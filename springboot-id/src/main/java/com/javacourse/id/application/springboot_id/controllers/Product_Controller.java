package com.javacourse.id.application.springboot_id.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.javacourse.id.application.springboot_id.models.Products;
import com.javacourse.id.application.springboot_id.services.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")
public class Product_Controller {

    @Autowired // Habilita la inyección de dependencias
    private ProductService services; // Inyecta el servicio de productos

    @GetMapping()
    public List<Products> listProduct() {
        return services.findAll();
    }

    @GetMapping("/{idProduct}")
    public Products show(@PathVariable Long idProduct) {
        return services.findProductById(idProduct);
    }
}
