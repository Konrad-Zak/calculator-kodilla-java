package com.kodilla.rps.movement;

public class FunctionKey {
    String action;

    public FunctionKey(String action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return action;
    }
}
