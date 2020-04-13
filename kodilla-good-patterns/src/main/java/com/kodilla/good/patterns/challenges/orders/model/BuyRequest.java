package com.kodilla.good.patterns.challenges.orders.model;

public class BuyRequest {

    private User user;
    private Product product;
    private Integer numberOfItems;

    public BuyRequest(User user, Product product, Integer numberOfItems) {
        this.user = user;
        this.product = product;
        this.numberOfItems = numberOfItems;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public Integer getNumberOfItems() {
        return numberOfItems;
    }

    @Override
    public String toString() {
        return " user: " + user +
                " product: " + product +
                " numberOfItems: " + numberOfItems;
    }
}
