package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryDrivingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        Task task = taskFactory.makeTask(OptionTask.DRIVING_TASK);
        //When
        task.executeTask();
        //Then
        Assert.assertEquals("Journey",task.getTaskName());
        Assert.assertTrue(task.isTaskExecuted());
    }

    @Test
    public void testFactoryShoppingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        Task task = taskFactory.makeTask(OptionTask.SHOPPING_TASK);
        //When
        task.executeTask();
        //Then
        Assert.assertEquals("Buy immediately",task.getTaskName());
        Assert.assertTrue(task.isTaskExecuted());
    }

    @Test
    public void testFactoryPaintingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        Task task = taskFactory.makeTask(OptionTask.PAINTING_TASK);
        //When
        task.executeTask();
        //Then
        Assert.assertEquals("Paint",task.getTaskName());
        Assert.assertTrue(task.isTaskExecuted());
    }

}
