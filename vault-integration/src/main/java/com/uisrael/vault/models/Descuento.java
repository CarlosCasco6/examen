package com.uisrael.vault.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "Descuentos")
public class Descuento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private BigDecimal porcentaje;
    private String estado;
    private String observacion;

    // Constructor vacío (requerido por JPA)
    public Descuento() {}

    // Constructor con parámetros (opcional, útil para pruebas)
    public Descuento(BigDecimal porcentaje, String estado, String observacion) {
        this.porcentaje = porcentaje;
        this.estado = estado;
        this.observacion = observacion;
    }

    // Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(BigDecimal porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    // Método toString (útil para depuración y logs)
    @Override
    public String toString() {
        return "Descuento{" +
                "id=" + id +
                ", porcentaje=" + porcentaje +
                ", estado='" + estado + '\'' +
                ", observacion='" + observacion + '\'' +
                '}';
    }
}