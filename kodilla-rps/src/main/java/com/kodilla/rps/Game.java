package com.kodilla.rps;

import com.kodilla.rps.movement.AvailableMovements;
import com.kodilla.rps.movement.Movement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class Game {

    private GameData gameData;
    private AvailableMovements availableMovements = new AvailableMovements();
    private DataReader dataReader = new DataReader();

    public void runGame(){
        setSettings();
        showKeyControl();
        playGame();

    }
    private void setSettings(){
        gameData = dataReader.readAndCreateGameData();
    }
    private void showKeyControl(){
        availableMovements.showMovementsMap();
    }
    private void playGame(){
        boolean end = false;
        while(!end) {
            Character userMove = dataReader.getKey();
            Character aiMove = gameData.aiGenerateMove();
            System.out.println(aiMove);
            Movement userChoice = availableMovements.getMovementFormKey(userMove);
            Movement aiChoice = availableMovements.getMovementFormKey(aiMove);

            System.out.println(userChoice + " \n "+ aiChoice);
            //Win player
            List<String> victoryList = userChoice.getVictory();
            boolean draw = false;
            boolean winPlayer = victoryList.stream().anyMatch(t->t.matches(aiChoice.getMoveName()));
           // boolean lostPlayer = userChoice.getLost().stream().anyMatch(t->t.matches(aiChoice.getMoveName()));
            //if (!winPlayer && !lostPlayer){
                draw = true;
            //}
            System.out.println("Result: "+ winPlayer );
            end = true;
        }
    }


}
