package com.kodilla.rps.movement;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Movement {
    private final String moveName;
    private final String beatOne;
    private final String beatTwo;
    private final String loseOne;
    private final String loseTwo;

    public Movement(String moveName, String beatOne, String beatTwo, String loseOne, String loseTwo) {
        this.moveName = moveName;
        this.beatOne = beatOne;
        this.beatTwo = beatTwo;
        this.loseOne = loseOne;
        this.loseTwo = loseTwo;
    }

    public String getMoveName() {
        return moveName;
    }

    public List<String> getVictory(){
        return Arrays.asList(beatOne,beatTwo);
    }

    public List<String> getLost(){
        return Arrays.asList(loseOne,loseTwo);
    }

    @Override
    public String toString() {
        return "play " + moveName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movement movement = (Movement) o;
        return Objects.equals(moveName, movement.moveName) &&
                Objects.equals(beatOne, movement.beatOne) &&
                Objects.equals(beatTwo, movement.beatTwo) &&
                Objects.equals(loseOne, movement.loseOne) &&
                Objects.equals(loseTwo, movement.loseTwo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(moveName, beatOne, beatTwo, loseOne, loseTwo);
    }
}
