package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.Deque;

public class StudentHomework implements Observable {

    private String studentName;
    private Deque<String> homeworkTask;
    private Observer observer;


    public StudentHomework(String studentName) {
        this.studentName = studentName;
        homeworkTask = new ArrayDeque<>();
    }

    public void addTask(String taskText){
        homeworkTask.push(taskText);
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observer = observer;
    }

    @Override
    public void notifyObserver() {
        observer.upDate(this);
    }

    public String getStudentName() {
        return studentName;
    }

    public Deque<String> getHomeworkTask() {
        return homeworkTask;
    }

}
