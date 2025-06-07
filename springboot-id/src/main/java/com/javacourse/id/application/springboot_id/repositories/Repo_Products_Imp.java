package com.javacourse.id.application.springboot_id.repositories;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.javacourse.id.application.springboot_id.models.Products;

@Repository // Anotación que indica que esta clase es un repositorio de Spring
public class Repo_Products_Imp implements ProductRepositorio {
    List<Products> data;

    public Repo_Products_Imp() {
        this.data = Arrays.asList(
                new Products(001L, "Hoddie", 30),
                new Products(002L, "Cap", 10),
                new Products(003L, "Pant", 50));
    }

    public List<Products> findAll() {
        return data;
    }

    public Products findProductById(Long idProduct) {
        return data.stream()
                .filter(p -> p.getIdProduct()
                        .equals(idProduct))
                .findFirst().orElse(null); // orElse(null)
    }
}
