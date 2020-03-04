package com.kodilla.rps.movement;

import java.util.HashMap;
import java.util.Map;

public class GameControlKeys {
    private Map<Character,MovementKey> gameKeyMap = new HashMap<>();
    private Map<Character,FunctionKey> functionKeyMap = new HashMap<>();

    public GameControlKeys() {
        gameKeyMap.put('1',new MovementKey("rock","lizard","scissor",
                "paper","spock"));
        gameKeyMap.put('2',new MovementKey("paper","rock","spock",
                "scissor","lizard" ));
        gameKeyMap.put('3',new MovementKey("scissor","paper","lizard",
                "rock","spock"));
        gameKeyMap.put('4',new MovementKey("spock","scissor","rock",
                "lizard","paper"));
        gameKeyMap.put('5',new MovementKey("lizard","paper","spock",
                "rock","scissor"));
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

