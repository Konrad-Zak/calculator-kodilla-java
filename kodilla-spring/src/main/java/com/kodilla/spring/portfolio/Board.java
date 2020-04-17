package com.kodilla.spring.portfolio;

public class Board {

    private TaskList toDoList,inProgressList,doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public void addTaskToDoList(String task){
        toDoList.addTask(task);
    }

    public void addTaskInProgressList(String task){
        inProgressList.addTask(task);
    }

    public void addTaskDoneList(String task){
        doneList.addTask(task);
    }

    public String getTaskFromToDoList(int taskNumber){
        return toDoList.getTask(taskNumber);
    }

    public String getTaskFromInProgressList(int taskNumber){
        return inProgressList.getTask(taskNumber);
    }

    public String getTaskFromDoneList(int taskNumber){
        return doneList.getTask(taskNumber);
    }

}
