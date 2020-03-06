package com.kodilla.rps.movement;

public class FunctionKey {
    private final String action;

    public FunctionKey(String action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return action;
    }
}
