package com.kodilla.rps;

import com.kodilla.rps.movement.GameControlKeys;

import java.util.InputMismatchException;

public class Game {

    private boolean end;
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
        gameResult();
        endGame();
    }

    private void setSettings() throws InputMismatchException{
        try {
            gameData = dataReader.readAndCreateGameData();
        } catch (InputMismatchException e){
            dataReader.getNextLine();
            System.err.println("Number is not integer...pleas press any key ");
            dataReader.getNextLine();
            setSettings();
        }
    }


    private void playGame(){
        end = false;
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
                end = stopGame();
            } else {
                System.out.println("You put wrong key...try again");
            }
        }
    }


    private void gameResult(){
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

    private boolean stopGame(){
        System.out.println("Do you wanna end this game? \n" + "x - Yes" + "\tn - No");
        Character character = dataReader.getKey();
        boolean verify = gameControlKeys.verifyFunctionKey(character);
        if (verify){
            if(character.equals('x')) {
                end = true;
            }
        } else {
            System.out.println("You put wrong key!!!!");
        }
        return end;
    }

    private void endGame(){
        System.out.println("\nWhat You wanna do?"+"\nExit Game - key x\t"+"New Game - key n");
        Character choose = dataReader.getKey();
        boolean verify = gameControlKeys.verifyFunctionKey(choose);
        if(verify){
            if (choose.equals('n')){
                dataReader.getNextLine();
                runGame();
            } else {
            System.out.println("Bye thank You for game...");
            dataReader.close();
            }
        } else {
            System.out.println("You put wrong key!!!! try again...");
            endGame();
        }
    }
}
