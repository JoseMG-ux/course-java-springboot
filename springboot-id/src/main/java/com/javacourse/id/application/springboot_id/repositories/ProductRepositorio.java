package com.javacourse.id.application.springboot_id.repositories;

import java.util.List;

import com.javacourse.id.application.springboot_id.models.Products;

public interface ProductRepositorio {
    List<Products> findAll();
    Products findProductById(Long idProduct);
}
