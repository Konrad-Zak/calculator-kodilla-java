package com.kodilla.good.patterns.challenges.orders.model;

import java.time.LocalDate;

public class Order {
    private Integer orderNumber;
    private LocalDate localDate;
    private User user;
    private Product product;
    private Integer numberOfItems;

    public Order( final LocalDate localDate, final  User user,
                 final Product product, final Integer numberOfItems) {
        this.localDate = localDate;
        this.user = user;
        this.product = product;
        this.numberOfItems = numberOfItems;
    }
}
