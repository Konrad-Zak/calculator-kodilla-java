package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;

    @Test
    public  void testFindByListName(){
        //Given
        TaskList taskList = new TaskList("Buy order","what we need");
        taskListDao.save(taskList);
        String listName = taskList.getListName();
        //When
        List<TaskList> taskLists = taskListDao.findByListName(listName);
        //Then
        Assert.assertEquals(1,taskLists.size());
        Assert.assertEquals("what we need",taskLists.get(0).getDescription());
        //CleanUp
        int id = taskLists.get(0).getId();
        taskListDao.deleteById(id);
    }

}
