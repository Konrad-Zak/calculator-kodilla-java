package com.kodilla.rps;

import com.kodilla.rps.movement.AvailableMovements;
import com.kodilla.rps.movement.Movement;


public class Game {

    private GameData gameData;
    private AvailableMovements availableMovements = new AvailableMovements();
    private DataReader dataReader = new DataReader();

    public void runGame(){
        setSettings();
        showKeyControl();
        playGame();
        gameResult();

    }
    private void setSettings(){
        gameData = dataReader.readAndCreateGameData();
    }
    private void showKeyControl(){
        availableMovements.showMovementsMap();
    }
    private void playGame(){

        boolean end = false;
        int round = 1;
        String result = null;

        gameData.resetScore();
        while(!end) {

            Character userMove = dataReader.getKey();
            Character aiMove = gameData.aiGenerateMove();

            Movement userChoice = availableMovements.getMovementFormKey(userMove);
            Movement aiChoice = availableMovements.getMovementFormKey(aiMove);

            boolean winPlayer = userChoice.getVictory().stream().anyMatch(t->t.matches(aiChoice.getMoveName()));
            boolean lostPlayer = userChoice.getLost().stream().anyMatch(t->t.matches(aiChoice.getMoveName()));

            //add point
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
            if(gameData.getPlayerScore() == gameData.getNumberRound() ||
                    gameData.getAiScore() == gameData.getNumberRound()) {
                end = true;
            }

            System.out.println("round: "+ round + "\n " + gameData.getUserName() + " " + userChoice +
                    "\n Ai " + aiChoice +  "\n You: " + result + "\n");
            round++;
        }
    }
    private void gameResult(){
        String winner;
        if(gameData.getPlayerScore()>gameData.getAiScore()){
            winner = gameData.getUserName();
        } else {
            winner = "Ai";
        }
        System.out.println("Winner: " + winner);
        gameData.showResult();
    }


}
