package com.kodilla.rps.movement;

import java.util.Arrays;
import java.util.List;

public class MovementKey {
    private final String moveName;
    private final String beatOne;
    private final String beatTwo;
    private final String loseOne;
    private final String loseTwo;

    public MovementKey(String moveName, String beatOne, String beatTwo, String loseOne, String loseTwo) {
        this.moveName = moveName;
        this.beatOne = beatOne;
        this.beatTwo = beatTwo;
        this.loseOne = loseOne;
        this.loseTwo = loseTwo;
    }

    public String getMoveName() {
        return moveName;
    }

    public List<String> winWithList(){
        return Arrays.asList(beatOne,beatTwo);
    }

    public List<String> lossWithList(){
        return Arrays.asList(loseOne,loseTwo);
    }

    @Override
    public String toString() {
        return "play " + moveName;
    }
}
