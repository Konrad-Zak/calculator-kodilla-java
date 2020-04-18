package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public Task makeTask(OptionTask optionTask){

        switch (optionTask){
            case DRIVING_TASK:
                return new DrivingTask("Journey","Warsaw","BMW");

            case SHOPPING_TASK:
                return new ShoppingTask("Buy immediately","Toilet paper",10);

            case PAINTING_TASK:
                return new PaintingTask("Paint","white","bedroom");

            default:
                return null;
        }
    }

}
