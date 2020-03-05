package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
       Calculate calculate = new Calculate();
       calculate.handlingException(secondChallenge,1.5,1.5);
       calculate.handlingException(secondChallenge,2,10);
       calculate.handlingException(secondChallenge,1.5,4);
    }
}
class Calculate{
    public void handlingException(SecondChallenge secondChallenge, double x, double y){
        try{
            String result = secondChallenge.probablyIWillThrowException(x,y);
            System.out.println(result);
        }catch (Exception e){
            System.err.println("x >= 2 or x < 1 or y == 1.5");
        }finally {
            System.out.println("I only check You");
        }
    }
}
