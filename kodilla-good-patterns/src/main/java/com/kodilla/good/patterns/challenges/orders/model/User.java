package com.kodilla.good.patterns.challenges.orders.model;

public class User {
    private String firstName;
    private String surname;

    public User(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }


    @Override
    public String toString() {
        return  "FirstName: " + firstName +
                " Surname: " + surname;
    }
}
