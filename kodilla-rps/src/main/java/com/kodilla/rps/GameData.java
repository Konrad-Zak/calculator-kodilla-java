package com.kodilla.rps;

import java.util.Random;

public final  class GameData {
    private final String userName;
    private final int numberRound;

    public GameData(String userName, int numberRound) {
        this.userName = userName;
        this.numberRound = numberRound;
    }
    public Character aiGenerateMove(){
        Random generator = new Random();
        int generate = generator.nextInt(5)+1;
        String numberGeneration = Integer.toString(generate);
        return numberGeneration.charAt(0);
    }

    public String getUserName() {
        return userName;
    }

    public int getNumberRound() {
        return numberRound;
    }
}
