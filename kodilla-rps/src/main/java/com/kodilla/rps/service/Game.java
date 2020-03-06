package com.kodilla.rps.service;

import com.kodilla.rps.io.DataReader;
import com.kodilla.rps.movement.GameControlKeys;

import java.util.InputMismatchException;

public class Game {

    private int numberOfRound = 0;
    private GameData gameData;

    private GameControlKeys gameControlKeys = new GameControlKeys();
    private DataReader dataReader = new DataReader();
    private Calculate calculate = new Calculate();

    public  void initiationGame(){
        setSettings();
        runGame();
    }

    public void runGame(){
        playGame();
        getGameResults();
        getEndGame();
    }

    private void setSettings(){
        String userName = dataReader.readNamePlayer();
        numberOfRound = getNumberOfRound();
        boolean v = false;
        while (!v)
            if(numberOfRound <1 ){
                System.out.println("Number is less than 1... Please correct...");
                numberOfRound = getNumberOfRound();
            } else {
                v = true;
                gameData = new GameData(userName,numberOfRound);
            }
    }

    private int getNumberOfRound(){
        try {
            numberOfRound = dataReader.readNumberOfRound();
        } catch (InputMismatchException e){
            dataReader.getNextLine();
            System.out.println("You put not... integer... ");
            readNotInteger();
        }
        return numberOfRound;
    }

    private void readNotInteger(){
        getNumberOfRound();
    }

    private void playGame(){
        boolean end = false;
        int roundNumber = 1;
        gameData.resetScore();

        while(!end) {
            //Show keys
            gameControlKeys.showMovementsMap();

            //get key from user
            Character userMove = dataReader.getKey();
            boolean keyMovement = gameControlKeys.verifyMovementKey(userMove);
            boolean keyFunction = gameControlKeys.verifyFunctionKey(userMove);

            //verify user key
            if(keyMovement){
                end = calculate.fight(userMove,gameData,gameControlKeys, roundNumber);
                roundNumber++;
            } else if(keyFunction) {
                end = getStopGame();
            } else {
                System.err.println("You put wrong key...try again");
            }
        }
    }

    private void getGameResults(){
        String winner;
        int userScore = gameData.getUserScore();
        int aiScore = gameData.getAiScore();

        if(userScore>aiScore){
            winner = gameData.getUserName();
        } else if (userScore == aiScore) {
            winner = "No one";
        } else {
            winner = "Ai";
        }
        System.out.println("\n>>>END GAME<<<"+ "\nWinner: " + winner);
        gameData.showScore();
    }

    private boolean getStopGame(){
        boolean end = false;
        boolean verify;
        do{
            System.out.println("Do you wanna end this game? \n" + "x - Yes" + "\tn - No");
            Character character = dataReader.getKey();
            verify = gameControlKeys.verifyFunctionKey(character);
            if(!verify){
                System.out.println("You put wrong key... try again");
            } else if(character.equals('x')) {
                end = true;
            }
        }while (!verify);
        return end;
    }

    private void getEndGame(){
        boolean verify;
        do{
            System.out.println("\nWhat You wanna do?"+"\nExit Game - key x\t"+"New Game - key n");
            Character choose = dataReader.getKey();
            verify = gameControlKeys.verifyFunctionKey(choose);
            if(!verify){
                System.out.println("\nYou put wrong key!!!! try again...\n");
            } else if(choose.equals('n')){
                dataReader.getNextLine();
                runGame();
            } else {
                System.out.println("\nBye thank You for game...");
                dataReader.close();
            }
        }while (!verify);
    }
}
