package com.kodilla.rps.movement;

import java.util.Arrays;
import java.util.List;

public class MovementKey {
    private String moveName;
    private String beatOne;
    private String beatTwo;
    private String loseOne;
    private String loseTwo;

    public static final class Builder{
        private String moveName;
        private String beatOne;
        private String beatTwo;
        private String loseOne;
        private String loseTwo;

        public Builder moveName(String moveName){
            this.moveName = moveName;
            return this;
        }

        public Builder beatOne(String beatOne){
            this.beatOne = beatOne;
            return this;
        }

        public Builder beatTwo(String beatTwo){
            this.beatTwo = beatTwo;
            return this;
        }

        public Builder loseOne(String loseOne){
            this.loseOne = loseOne;
            return this;
        }

        public Builder loseTwo(String loseTwo){
            this.loseTwo = loseTwo;
            return this;
        }

        public MovementKey build(){
            MovementKey movementKey = new MovementKey();
            movementKey.moveName = this.moveName;
            movementKey.beatOne = this.beatOne;
            movementKey.beatTwo = this.beatTwo;
            movementKey.loseOne = this.loseOne;
            movementKey.loseTwo = this.loseTwo;
            return movementKey;
        }
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
