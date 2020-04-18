package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{
    private String taskName;
    private String color;
    private String whatToPaint;
    private boolean taskDone;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
        this.taskDone = false;
    }

    @Override
    public void executeTask() {
        System.out.println(taskName +" painting: " + whatToPaint + " color: " + color);
        taskDone = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public Boolean isTaskExecuted() {
        return taskDone;
    }
}
