package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculate = new Calculator();

        Integer score = 10;

        if (score.equals(calculate.add(5,5))){
            System.out.println("add method test OK");
        } else {
            System.out.println("Error");
        }

    }
}
