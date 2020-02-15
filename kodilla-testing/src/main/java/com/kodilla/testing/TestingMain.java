package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        // test for Calculator
        Calculator calculate = new Calculator();

        Integer score = 10;

        if (score.equals(calculate.add(5,5))){
            System.out.println("test for method add OK");
        } else {
            System.out.println("Error");
        }

        if (score.equals(calculate.subtract(20,10))){
            System.out.println("test for method subtract OK");
        } else {
            System.out.println("Error");
        }

    }
}
