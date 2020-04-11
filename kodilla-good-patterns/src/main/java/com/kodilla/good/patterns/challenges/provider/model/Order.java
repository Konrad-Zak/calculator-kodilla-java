package com.kodilla.good.patterns.challenges.provider.model;

public class Order {
    private String shopName;
    private Product product;

    public Order(String shopName, Product product) {
        this.shopName = shopName;
        this.product = product;
    }

    public String getShopName() {
        return shopName;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return " Order: " + " shopName: " + shopName + " product " + product;
    }
}
