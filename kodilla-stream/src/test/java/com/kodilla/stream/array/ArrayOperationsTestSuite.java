package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ArrayOperationsTestSuite {

    private  int[] numbers;
    private double avgExpected;

    public ArrayOperationsTestSuite(int[] numbers, double avgExpected) {
        this.numbers = numbers;
        this.avgExpected = avgExpected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { new int[]{1,2,3,4,5,6}, 3.5 },
                { new int[]{2,3,2,3}, 2.5 },
                { new int[]{5,5,5,5,5}, 5.0 }
        });
    }

    @Test
    public void testGetAverage() {
        //When
        double avgResult = ArrayOperations.getAverage(numbers);
        //Then
        Assert.assertEquals(avgExpected,avgResult,0.0);
    }
}
