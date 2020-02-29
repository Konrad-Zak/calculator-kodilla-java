package com.kodilla.rps;

import com.kodilla.rps.movement.GameControlKeys;
import com.kodilla.rps.movement.MovementKey;

import java.util.InputMismatchException;

public class Game {

    private int roundNumber;
    private boolean end;
    private GameData gameData;

    private GameControlKeys gameControlKeys = new GameControlKeys();
    private DataReader dataReader = new DataReader();

    public void runGame(){
        setSettings();
        showKeyControl();
        playGame();
        gameResult();
        endGame();
    }

    private void setSettings(){
        try {
            gameData = dataReader.readAndCreateGameData();
        } catch (InputMismatchException e){
            dataReader.getNextLine();
            System.err.println("Number is not integer ");
            setSettings();
        }
    }
    private void showKeyControl(){
        gameControlKeys.showMovementsMap();
    }
    private void playGame(){
        end = false;
        roundNumber = 0;
        gameData.resetScore();

        while(!end) {
            //get key from user
            Character userMove = dataReader.getKey();
            boolean keyMovement = gameControlKeys.verifyMovementKey(userMove);
            boolean keyFunction = gameControlKeys.verifyFunctionKey(userMove);

            //verify user key
            if(keyMovement){
                end = fight(userMove);
            } else if(keyFunction) {
                end = stopGame();
            } else {
                System.out.println("You put wrong key...try again");
            }

        }
    }
    private boolean fight(Character userMove){

        String result = null;
        Character aiMove = gameData.aiGenerateMove();
        MovementKey userChoice = gameControlKeys.getMovementFormKey(userMove);
        MovementKey aiChoice = gameControlKeys.getMovementFormKey(aiMove);

        //Calculated and verified
        boolean winPlayer = userChoice.winWithList().stream().anyMatch(t->t.matches(aiChoice.getMoveName()));
        boolean lostPlayer = userChoice.lossWithList().stream().anyMatch(t->t.matches(aiChoice.getMoveName()));

        if(winPlayer){
            gameData.addPointToPlayer();
            result = "Win";
        }
        if (lostPlayer){
            gameData.addPointToAi();
            result = "Lost";
        }
        if (!winPlayer && !lostPlayer){
            result = "Draw";
        }
        //Add point
        if(gameData.getUserScore() == gameData.getNumberRound() ||
                gameData.getAiScore() == gameData.getNumberRound()) {
            end = true;
        }
        //Show
        System.out.println("round: "+ roundNumber + "\n " + "You: " + userChoice +
                "\n Ai " + aiChoice +  "\n You: " + result + "\n");
        gameData.showResult();
        roundNumber++;
        return end;
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
        gameData.showResult();
    }

    private boolean stopGame(){
        System.out.println("Do you wanna end game? \n" + "x - Yes" + "\tn - No");
        Character choose = dataReader.getKey();
        boolean verify = gameControlKeys.verifyFunctionKey(choose);
        if (verify){
            if(choose.equals('x')) {
                end = true;
            }
        } else {
            System.out.println("You put wrong key!!!!");
        }
        return end;
    }

    private void endGame(){
        System.out.println("Exit Game - key x\t"+"New Game - key n");
        Character choose = dataReader.getKey();
        boolean verify = gameControlKeys.verifyFunctionKey(choose);
        if(verify){
            if (choose.equals('n')){
                playGame();
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
