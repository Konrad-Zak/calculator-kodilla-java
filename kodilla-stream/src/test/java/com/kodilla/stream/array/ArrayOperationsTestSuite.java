package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = {1,2,3,4,5,6};
        double avgExpected = 3.5;
        //When
        double avgResult = ArrayOperations.getAverage(numbers);
        //Then
        Assert.assertEquals(avgExpected,avgResult,0.0);
    }
}
