package com.uisrael.vault.repository;


import com.uisrael.vault.models.Descuento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DescuentoRepository extends JpaRepository<Descuento, Integer> {
}