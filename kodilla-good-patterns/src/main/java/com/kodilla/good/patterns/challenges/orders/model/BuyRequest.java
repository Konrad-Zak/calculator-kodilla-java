package com.kodilla.good.patterns.challenges.orders.model;

public class BuyRequest {

    private User user;
    private Product product;
    private Integer numberOfItems;

    public BuyRequest(final User user, final Product product, final Integer numberOfItems) {
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
}
