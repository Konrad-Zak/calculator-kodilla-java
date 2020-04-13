package com.kodilla.good.patterns.challenges.provider.model;

public class Product {

    private String nameProduct;
    private Integer numberOfItems;

    public Product(String nameProduct, Integer numberOfItems) {
        this.nameProduct = nameProduct;
        this.numberOfItems = numberOfItems;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public Integer getNumberOfItems() {
        return numberOfItems;
    }

    @Override
    public String toString() {
        return " nameProduct: " + nameProduct + " numberOfItems: " + numberOfItems;
    }
}
