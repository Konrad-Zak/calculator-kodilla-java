package com.kodilla.good.patterns.challenges.orders.model;

public class OrderDto {
    private Integer numberOrder;
    private User user;
    private boolean isCorrectBuyOrder;

    public OrderDto(Integer numberOrder, User user, boolean isCorrectBuyOrder) {
        this.numberOrder = numberOrder;
        this.user = user;
        this.isCorrectBuyOrder = isCorrectBuyOrder;
    }

    @Override
    public String toString() {
        return "System info: " +
                "numberOrder: " + numberOrder +
                " user: " + user +
                " isCorrectBuyOrder: " + isCorrectBuyOrder;
    }
}
