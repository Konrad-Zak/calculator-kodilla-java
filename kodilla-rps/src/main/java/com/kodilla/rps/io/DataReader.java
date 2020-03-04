package com.kodilla.rps.io;



import java.util.InputMismatchException;
import java.util.Scanner;

public class DataReader {
    private Scanner sc = new Scanner(System.in);

    public void close() {
        sc.close();
    }

    public String readNamePlayer(){
            System.out.println("\nGive your name... please....");
            return sc.nextLine();
    }
    public int readNumberOfRound() throws InputMismatchException {
        System.out.println("\n" + "Give me the number of rounds won after which the game will be end");
        int numberOfRound = sc.nextInt();
        sc.nextLine();
        return  numberOfRound;
    }

    public Character getKey(){
        System.out.println("\nYour choose: ");
        return sc.next().charAt(0);
    }

    public void getNextLine(){
        sc.nextLine();
    }
}
