package com.uisrael.vault.dto;

import java.math.BigDecimal;

public class ProductoConDescuentoDTO {
    private String nombre;
    private BigDecimal precioOriginal;
    private BigDecimal porcentajeDescuento;
    private BigDecimal precioFinal;

    // Constructor vacío
    public ProductoConDescuentoDTO() {}

    // Constructor con parámetros
    public ProductoConDescuentoDTO(String nombre, BigDecimal precioOriginal,
                                   BigDecimal porcentajeDescuento, BigDecimal precioFinal) {
        this.nombre = nombre;
        this.precioOriginal = precioOriginal;
        this.porcentajeDescuento = porcentajeDescuento;
        this.precioFinal = precioFinal;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getPrecioOriginal() {
        return precioOriginal;
    }

    public void setPrecioOriginal(BigDecimal precioOriginal) {
        this.precioOriginal = precioOriginal;
    }

    public BigDecimal getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(BigDecimal porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public BigDecimal getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(BigDecimal precioFinal) {
        this.precioFinal = precioFinal;
    }

    @Override
    public String toString() {
        return "ProductoConDescuentoDTO{" +
                "nombre='" + nombre + '\'' +
                ", precioOriginal=" + precioOriginal +
                ", porcentajeDescuento=" + porcentajeDescuento +
                ", precioFinal=" + precioFinal +
                '}';
    }
}