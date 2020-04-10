package com.kodilla.good.patterns.challenges.orders.model;

public class User {
    private String firstName;
    private String surname;

    public User(final String firstName, final String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return  "FirstName: " + firstName +
                " Surname: " + surname;
    }
}
