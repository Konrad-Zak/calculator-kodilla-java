package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

import java.util.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCalculateTestSuite {
    //test input data
    String[] users =  new String[100];
    List<String>testQuantityOfUser = Arrays.asList(users);
    List<Integer> numberOfPosts = Arrays.asList(0,1000,100,100,100);
    List<Integer> numberOfComments = Arrays.asList(100,100,1000,0,100);

    //test result data
    double[] resultAvgPostsPerUser =  {0,10,1,1,0};
    double[] resultAvgCommentsPerUser = {1,1,10,0,0};
    double[] resultAvgCommentsPerPost = {0,0.1,10,0,1};

    //Variable
    Statistics statisticsMock = mock(Statistics.class);
    StatisticsCalculate statisticsCalculate = new StatisticsCalculate();

    private static int testCounter = 0;
    private int testQuantityOfPost;
    private int testQuantityOfComment;

    @BeforeEach
    public void init(){
        if (testCounter>3){
            testQuantityOfUser = new ArrayList<>();
        }
        testQuantityOfPost = numberOfPosts.get(testCounter);
        testQuantityOfComment = numberOfComments.get(testCounter);
        testCounter ++;
    }

    @AfterEach
    public void showStatistics(){
        System.out.println(statisticsCalculate);
    }

        @RepeatedTest(value = 5)
        public void calculateAdvStatistics () {
        //Given
        when(statisticsMock.usersNames()).thenReturn(testQuantityOfUser);
        when(statisticsMock.postsCount()).thenReturn(testQuantityOfPost);
        when(statisticsMock.commentsCount()).thenReturn(testQuantityOfComment);
        //When
        statisticsCalculate.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(resultAvgPostsPerUser[testCounter-1], statisticsCalculate.getAvgPostsPerUser(), 0);
        Assert.assertEquals(resultAvgCommentsPerUser[testCounter-1], statisticsCalculate.getAvgCommentsPerUser(), 0);
        Assert.assertEquals(resultAvgCommentsPerPost[testCounter-1], statisticsCalculate.getAvgCommentsPerPost(), 0);
    }
}
