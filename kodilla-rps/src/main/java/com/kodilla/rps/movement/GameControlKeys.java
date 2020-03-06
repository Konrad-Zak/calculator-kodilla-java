package com.kodilla.rps.movement;

import java.util.HashMap;
import java.util.Map;

public class GameControlKeys {
    private Map<Character,MovementKey> gameKeyMap = new HashMap<>();
    private Map<Character,FunctionKey> functionKeyMap = new HashMap<>();

    public GameControlKeys() {
        gameKeyMap.put('1',new MovementKey.Builder()
                .moveName("rock")
                .beatOne("lizard")
                .beatTwo("scissor")
                .loseOne("paper")
                .loseTwo("spock")
                .build());

        gameKeyMap.put('2',new MovementKey.Builder()
                .moveName("paper")
                .beatOne("rock")
                .beatTwo("spock")
                .loseOne("scissor")
                .loseTwo("lizard")
                .build());

        gameKeyMap.put('3',new MovementKey.Builder()
                .moveName("scissor")
                .beatOne("paper")
                .beatTwo("lizard")
                .loseOne("rock")
                .loseTwo("spock")
                .build());

        gameKeyMap.put('4',new MovementKey.Builder()
                .moveName("spock")
                .beatOne("scissor")
                .beatTwo("rock")
                .loseOne("lizard")
                .loseTwo("paper")
                .build());


        gameKeyMap.put('5',new MovementKey.Builder()
                .moveName("lizard")
                .beatOne("paper")
                .beatTwo("spock")
                .loseOne("rock")
                .loseTwo("scissor")
                .build());

        functionKeyMap.put('x',new FunctionKey("Finish the game"));
        functionKeyMap.put('n',new FunctionKey("Restarting the game"));
    }
    public void showMovementsMap(){
        for(Map.Entry<Character,MovementKey> entry : gameKeyMap.entrySet()){
            System.out.println("Key: " + entry.getKey() + " - " + entry.getValue());
        }
        for(Map.Entry<Character,FunctionKey> entry : functionKeyMap.entrySet()){
            System.out.println("Key: " + entry.getKey() + " - " + entry.getValue());
        }
    }

    public MovementKey getMovementFormKey(Character key){
        return gameKeyMap.get(key);
    }

    public boolean verifyMovementKey(Character userMove){
        return gameKeyMap.containsKey(userMove);
    }
    public boolean verifyFunctionKey(Character userMove){
        return functionKeyMap.containsKey(userMove);
    }
}

