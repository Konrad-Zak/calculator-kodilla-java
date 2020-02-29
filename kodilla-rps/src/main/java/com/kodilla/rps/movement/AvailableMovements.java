package com.kodilla.rps.movement;

import org.omg.CORBA.Object;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class AvailableMovements {
    Map<Character,Movement> movementMap = new HashMap<>();

    public AvailableMovements() {
        movementMap.put('1',new Movement("rock","lizard","scissor",
                "paper","spock"));
        movementMap.put('2',new Movement("paper","rock","spock",
                "scissor","lizard" ));
        movementMap.put('3',new Movement("scissor","paper","lizard",
                "rock","spock"));
        movementMap.put('4',new Movement("spock","scissor","rock",
                "lizard","paper"));
        movementMap.put('5',new Movement("lizard","paper","spock",
                "rock","scissor"));
    }
    public Map<Character,Movement> getAvailableMovements(){
        return new HashMap<>(movementMap);
    }
    public void showMovementsMap(){
        for(Map.Entry<Character,Movement> entry :movementMap.entrySet()){
            System.out.println("Object: <" + entry.getKey() + ", " + entry.getValue() + ">");
        }
    }
    public Movement getMovementFormKey(Character key){
        return movementMap.get(key);

    }
}
