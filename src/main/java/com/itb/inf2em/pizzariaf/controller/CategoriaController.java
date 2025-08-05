package com.itb.inf2em.pizzariaf.controller;

import com.itb.inf2em.pizzariaf.moldel.entity.categoria;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/categoria")
public class CategoriaController {

    private List<categoria> categorias = new ArrayList<>();

    @GetMapping
    public List<categoria> findAll() {
        categoria c1 = new categoria();
        c1.setNome("Pizzas");
        c1.setDescricao("Todas as pizzas disponíveis");

        categoria c2 = new categoria();
        c2.setNome("Bebidas");
        c2.setDescricao("Refrigerantes, sucos e água");

        categorias.add(c1);
        categorias.add(c2);

        return categorias;
    }
}
