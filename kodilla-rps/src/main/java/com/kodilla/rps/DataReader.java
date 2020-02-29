package com.kodilla.rps;

import java.util.Scanner;

public class DataReader {
    private Scanner sc = new Scanner(System.in);

    public void close() {
        sc.close();
    }

    public GameData readAndCreateGameData() {
        System.out.println("Give your name... please....");
        String userName = sc.nextLine();
        System.out.println("Give number of round in game");
        int numberOfRound = sc.nextInt();
        sc.nextLine();
        return new GameData(userName, numberOfRound);
    }
    public Character getKey(){
        System.out.println("Your choose: ");
        return sc.next().charAt(0);
    }
}
