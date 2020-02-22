package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCalculateTestSuite {

    @ParameterizedTest
    @CsvSource({"100,100,100,1,1,1", "10,100,100,10,10,1"})
    public void testCalculateAdvStatistics(int quantityOfUsers, int quantityOfPosts, int quantityOfComments, int avgPostsPerUser, int avgCommentsPerUser, int avgCommentsPerPost ){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(userGenerator(quantityOfUsers));
        when(statisticsMock.postsCount()).thenReturn(quantityOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(quantityOfComments);
        StatisticsCalculate statisticsCalculate = new StatisticsCalculate();
        //When
        statisticsCalculate.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertTrue(ifCalculateAdvStatisticsEqual(statisticsCalculate,quantityOfUsers,quantityOfPosts,));
    }
    List<String> userGenerator(int quantity){
        List<String> userList = new ArrayList<>();
        for (int i = 0; i <quantity ; i++) {
            userList.add("");
        }
        return userList;
    }
    boolean ifCalculateAdvStatisticsEqual(StatisticsCalculate statisticsCalculate,int quantityOfUsers, int quantityOfPosts, int quantityOfComments, int avgPostsPerUser, int avgCommentsPerUser, int avgCommentsPerPost ){
        return  statisticsCalculate.getQuantityOfUser() == quantityOfUsers &&
                statisticsCalculate.getQuantityOfPost() == quantityOfPosts &&
                statisticsCalculate.getQuantityOfComment() == quantityOfComments &&
                statisticsCalculate.getAvgPostsPerUser() == avgPostsPerUser &&
                statisticsCalculate.getAvgCommentsPerUser() == avgCommentsPerUser &&
                statisticsCalculate.getAvgCommentsPerPost() == avgCommentsPerPost;
    }
}
