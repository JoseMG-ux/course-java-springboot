package com.javacourse.id.application.springboot_id.models;

public class Products implements Cloneable {
    private Long idProduct;
    private String nombre;
    private int precio;

    public Products(long idProduct, String nombre, int precio) {
        this.idProduct = idProduct;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return new Products(idProduct, nombre, precio);
        }
    }
}
