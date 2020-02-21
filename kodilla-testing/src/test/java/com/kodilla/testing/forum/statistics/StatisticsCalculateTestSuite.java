package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.stubbing.OngoingStubbing;

import java.awt.*;
import java.util.*;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCalculateTestSuite {
    private static int testCounter = 0;
    private  int numberOfusers;
    private int testQuantityOfPost;
    private int testQuantityOfComment;

    List<String>testQuantityOfUser;
    List<String> users = Arrays.asList("50","50","50","50","50","0","100");
    List<Integer> numberOfPosts = Arrays.asList(10,1000,50,500,10,50);
    List<Integer> numberOfComments = Arrays.asList(50,50,0,50,500,50,50);
    List<List<String>> testUserLists = Arrays.asList(users, users, users, users, users, null, users );

    Statistics statisticsMock = mock(Statistics.class);
    StatisticsCalculate statisticsCalculate = new StatisticsCalculate();

    @Before
    public void inicial(){
        testQuantityOfUser = testUserLists.get(testCounter);
        testQuantityOfPost = numberOfPosts.get(testCounter);
        testQuantityOfComment = numberOfComments.get(testCounter);
        numberOfusers = testQuantityOfUser.size();
        testCounter ++;
    }


    @Test
    public void calculateAdvStatistics(){
        //Given
        Double a = Double.valueOf(testQuantityOfPost/numberOfusers);
        when(statisticsMock.usersNames()).thenReturn(testQuantityOfUser);
        when(statisticsMock.postsCount()).thenReturn(testQuantityOfPost);
        when(statisticsMock.commentsCount()).thenReturn(testQuantityOfComment);
        //When
        statisticsCalculate.calculateAdvStatistics(statisticsMock);
        //Then
        if (testQuantityOfUser.size() > 0){
        Assert.assertEquals(a,statisticsCalculate.getAvgPostsPerUser(),0);
        }
    }
}
