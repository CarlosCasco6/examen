package com.uisrael.vault.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "Producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private BigDecimal precio;   // cambiado a BigDecimal
    private Boolean iva;
    private Long idcategoria;

    // Constructor vacío (requerido por JPA)
    public Producto() {}

    // Constructor con parámetros (opcional, útil para pruebas)
    public Producto(String nombre, BigDecimal precio, Boolean iva, Long idcategoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.iva = iva;
        this.idcategoria = idcategoria;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Boolean getIva() {
        return iva;
    }

    public void setIva(Boolean iva) {
        this.iva = iva;
    }

    public Long getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(Long idcategoria) {
        this.idcategoria = idcategoria;
    }

    // Método toString (útil para depuración y logs)
    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", iva=" + iva +
                ", idcategoria=" + idcategoria +
                '}';
    }
}