package com.uisrael.vault.controller;

import com.uisrael.vault.models.Descuento;
import com.uisrael.vault.repository.DescuentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vault")
public class DescuentoController {

    @Autowired
    private DescuentoRepository repo;

    @GetMapping("/descuentos")
    public List<Descuento> getDescuentos() {
        return repo.findAll();
    }

    @PostMapping("/descuentos")
    public Descuento createDescuento(@RequestBody Descuento descuento) {
        return repo.save(descuento);
    }
}