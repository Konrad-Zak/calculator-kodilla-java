package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class LoggerTestSuite {

    private String log;

    @Parameterized.Parameters
    public static List<String> data(){
        return Arrays.asList("Max","Neo","Gil");
    }

    public LoggerTestSuite(String log) {
        this.log = log;
    }

    @Test
    public void testGetLastLog(){
        //Given
        Logger.getInstance().log(log);
        //When
        String result = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals(log,result);
    }

}
