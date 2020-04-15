package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    private ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
    private Calculator calculator = context.getBean(Calculator.class);
    private double result;

    @Test
    public void testAddCalculation(){
        //When
        result = calculator.add(4.0,2.0);
        //Then
        Assert.assertEquals(6.0,result,0.0);
    }

    @Test
    public void testSubCalculation(){
        //When
        result = calculator.sub(4.0,2.0);
        //Then
        Assert.assertEquals(2.0,result,0.0);
    }

    @Test
    public void testMulCalculation(){
        //When
        result = calculator.mul(4.0,2.0);
        //Then
        Assert.assertEquals(8.0,result,0.0);
    }

    @Test
    public void testDivCalculation(){
        //When
        result = calculator.div(10.0,2.0);
        //Then
        Assert.assertEquals(5.0,result,0.0);
    }

}
