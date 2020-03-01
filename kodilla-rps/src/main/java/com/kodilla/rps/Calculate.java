package com.kodilla.rps;

import com.kodilla.rps.movement.GameControlKeys;
import com.kodilla.rps.movement.MovementKey;

public class Calculate {
    boolean end = false;

    public boolean fight(Character userMove, GameData gameData, GameControlKeys gameControlKeys, int roundNumber){

        Character aiMove = gameData.aiGenerateMove();
        MovementKey userChoice = gameControlKeys.getMovementFormKey(userMove);
        MovementKey aiChoice = gameControlKeys.getMovementFormKey(aiMove);

        //type winner
        String result = typeWinner(userChoice, aiChoice, gameData);
        //Add point
        addPoint(gameData);
        //Show
        showRoundResult(gameData,userChoice,aiChoice,roundNumber,result);
        return end;
    }
    private String typeWinner(MovementKey userChoice, MovementKey aiChoice,GameData gameData){
        String result = "";
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
        return result;
    }

    private void addPoint(GameData gameData){
        if(gameData.getUserScore() == gameData.getNumberRound() ||
                gameData.getAiScore() == gameData.getNumberRound()) {
            end = true;
        }
    }
    private void showRoundResult(GameData gameData,MovementKey userChoice,
                                 MovementKey aiChoice,int roundNumber, String result){
        System.out.println("round: "+ roundNumber + "\n " + "You: " + userChoice +
                "\n Ai " + aiChoice +  "\n You: " + result + "\n");
        gameData.showScore();

    }
}
