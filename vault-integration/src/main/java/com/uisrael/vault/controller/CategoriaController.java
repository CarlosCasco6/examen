package com.uisrael.vault.controller;

import com.uisrael.vault.models.Categoria;
import com.uisrael.vault.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vault")
public class CategoriaController {

    @Autowired
    private CategoriaRepository repo;

    @GetMapping("/categorias")
    public List<Categoria> getCategorias() {
        return repo.findAll();
    }

    @PostMapping("/categorias")
    public Categoria createCategoria(@RequestBody Categoria categoria) {
        return repo.save(categoria);
    }
}