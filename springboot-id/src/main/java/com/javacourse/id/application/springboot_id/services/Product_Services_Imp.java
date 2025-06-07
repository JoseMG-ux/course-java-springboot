package com.javacourse.id.application.springboot_id.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.javacourse.id.application.springboot_id.models.Products;
import com.javacourse.id.application.springboot_id.repositories.ProductRepositorio;
import com.javacourse.id.application.springboot_id.repositories.Repo_Products_Imp;

@Service // Anotación que indica que esta clase es un servicio de Spring
public class Product_Services_Imp implements ProductService {

    //private Repo_Products_Imp repository = new Repo_Products_Imp();

    @Autowired //Habilita la inyección de dependencias 
    private ProductRepositorio repository; //Inyecta el repositorio de productos

    @Override //Anotación que indica que este método es una implementación de un método de la interfaz
    public List<Products> findAll() {

        return repository.findAll().stream().map(item -> {
            Double precioTotal = item.getPrecio() * 1.50d;
            // Products newPrice = new Products(item.getIdProduct(), item.getNombre(),
            // precioTotal.intValue());

            Products newProducts = (Products) item.clone(); // Copia del producto
            newProducts.setPrecio(precioTotal.intValue());

            return newProducts;
        }).collect(Collectors.toList());

    }

    @Override //Anotación que indica que este método es una implementación de un método de la interfaz
    public Products findProductById(Long idProduct) {
        return repository.findProductById(idProduct);
    }

}
