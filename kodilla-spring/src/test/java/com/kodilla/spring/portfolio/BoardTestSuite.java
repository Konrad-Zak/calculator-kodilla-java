package com.kodilla.spring.portfolio;


import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
    Board board = context.getBean(Board.class);
    String task;

    @Test
    public void testTaskAddToDoList(){
        //Given
        task = "Something to do";
        board.addTaskToDoList(task);
        //When
        String result = board.getTaskFromToDoList(0);
        //Then
        Assert.assertEquals(task,result);
    }

    @Test
    public void testTaskAddInProgressList(){
        //Given
        task = "Something in progress";
        board.addTaskInProgressList(task);
        //When
        String result = board.getTaskFromInProgressList(0);
        //Then
        Assert.assertEquals(task,result);
    }

    @Test
    public void testTaskAddDoneList(){
        //Given
        task = "Something done";
        board.addTaskDoneList(task);
        //When
        String result = board.getTaskFromDoneList(0);
        //Then
        Assert.assertEquals(task,result);
    }

}
