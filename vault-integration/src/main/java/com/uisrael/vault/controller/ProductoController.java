package com.uisrael.vault.controller;

import com.uisrael.vault.models.Producto;
import com.uisrael.vault.models.Descuento;
import com.uisrael.vault.repository.ProductoRepository;
import com.uisrael.vault.repository.DescuentoRepository;
import com.uisrael.vault.dto.ProductoConDescuentoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/vault")
public class ProductoController {

    @Autowired
    private ProductoRepository productoRepo;

    @Autowired
    private DescuentoRepository descuentoRepo;

    @GetMapping("/productos")
    public List<Producto> getProductos() {
        return productoRepo.findAll();
    }

    @PostMapping("/productos")
    public Producto createProducto(@RequestBody Producto producto) {
        return productoRepo.save(producto);
    }

    // Nuevo endpoint: productos con descuento aplicado
    @GetMapping("/productos-con-descuento")
    public List<ProductoConDescuentoDTO> getProductosConDescuento() {
        List<Producto> productos = productoRepo.findAll();
        List<Descuento> descuentos = descuentoRepo.findAll();

        List<ProductoConDescuentoDTO> resultado = new ArrayList<>();

        for (Producto p : productos) {
            // ejemplo simple: aplicar el primer descuento activo
            Descuento d = descuentos.stream()
                    .filter(desc -> "Activo".equalsIgnoreCase(desc.getEstado()))
                    .findFirst()
                    .orElse(null);

            if (d != null) {
                BigDecimal precioFinal = p.getPrecio()
                        .subtract(p.getPrecio().multiply(d.getPorcentaje().divide(BigDecimal.valueOf(100))));

                resultado.add(new ProductoConDescuentoDTO(
                        p.getNombre(),
                        p.getPrecio(),
                        d.getPorcentaje(),
                        precioFinal
                ));
            }
        }
        return resultado;
    }
}