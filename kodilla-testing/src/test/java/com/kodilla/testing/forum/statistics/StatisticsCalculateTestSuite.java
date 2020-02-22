package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCalculateTestSuite {

    StatisticsCalculate statisticsCalculate = new StatisticsCalculate();
    Statistics statisticsMock = mock(Statistics.class);

    @AfterEach
    public void show(){
        System.out.println(statisticsCalculate);
    }
    @ParameterizedTest
    @CsvSource({"2,0,100,0,0,0", "2,100,0,0,0,0","2,1000,100,500,50,0.1","2,100,1000,50,500,10","0,10,10,0,0,0"})
    public void testCalculateAdvStatistics(int quantityOfUsers, int quantityOfPosts, int quantityOfComments, double avgPostsPerUser, double avgCommentsPerUser, double avgCommentsPerPost ){
        //Given
        when(statisticsMock.usersNames()).thenReturn(userGenerator(quantityOfUsers));
        when(statisticsMock.postsCount()).thenReturn(quantityOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(quantityOfComments);

        List<Object> expectedList = new ArrayList<>();
        expectedList.add((double)quantityOfUsers);
        expectedList.add((double)quantityOfPosts);
        expectedList.add((double)quantityOfComments);
        expectedList.add(avgPostsPerUser);
        expectedList.add(avgCommentsPerUser);
        expectedList.add(avgCommentsPerPost);
        //When
        statisticsCalculate.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(expectedList,calculateAdvStatisticsList(statisticsCalculate));
    }
    List<String> userGenerator(int quantity){
        List<String> userList = new ArrayList<>();
        for (int i = 0; i <quantity ; i++) {
            userList.add("");
        }
        return userList;
    }
    List<Object> calculateAdvStatisticsList(StatisticsCalculate statisticsCalculate){
        List<Object>testedList = new ArrayList<>();
        testedList.add(statisticsCalculate.getQuantityOfUser());
        testedList.add(statisticsCalculate.getQuantityOfPost());
        testedList.add(statisticsCalculate.getQuantityOfComment());
        testedList.add(statisticsCalculate.getAvgPostsPerUser());
        testedList.add(statisticsCalculate.getAvgCommentsPerUser());
        testedList.add(statisticsCalculate.getAvgCommentsPerPost());
        return testedList;
    }
}
