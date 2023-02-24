package com.reto.sistecredito.app.models;

public class Product {


    String nameProduct;
    String size;

    public Product() {
    }

    public Product(String nameProduct, String size) {
        this.nameProduct = nameProduct;
        this.size = size;
    }
    public String getNameProduct() {
        return nameProduct;
    }
    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
}
