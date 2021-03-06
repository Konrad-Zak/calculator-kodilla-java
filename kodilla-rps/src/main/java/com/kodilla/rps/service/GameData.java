package com.kodilla.rps.service;

import java.util.Random;

public final  class GameData {
    private final String userName;
    private final int numberRound;
    private int playerScore;
    private int aiScore;
    private static final Random RANDOM = new Random();

    public GameData(String userName, int numberRound) {
        this.userName = userName;
        this.numberRound = numberRound;
    }
    public Character aiGenerateMove(){
        int generate = RANDOM.nextInt(5)+1;
        String numberGeneration = Integer.toString(generate);
        return numberGeneration.charAt(0);
    }

    public void showScore(){
        System.out.println(userName + " score: " + playerScore + "\nAi score: "+ aiScore + "\n");
    }

    public void resetScore(){
        playerScore = 0;
        aiScore = 0;
    }
    public void addPointToPlayer(){
        playerScore++;
    }
    public void addPointToAi(){
        aiScore++;
    }

    public int getUserScore() {
        return playerScore;
    }

    public int getAiScore() {
        return aiScore;
    }

    public String getUserName() {
        return userName;
    }

    public int getNumberRound() {
        return numberRound;
    }
}
