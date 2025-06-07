package com.javacourse.id.application.springboot_id.services;

import java.util.List;

import com.javacourse.id.application.springboot_id.models.Products;

public interface ProductService {
    List<Products> findAll();
    Products findProductById(Long idProduct);
}
