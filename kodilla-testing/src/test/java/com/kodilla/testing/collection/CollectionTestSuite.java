package com.kodilla.testing.collection;

import org.junit.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {
    private OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

    @Before
    public void before(){
        System.out.println("Test Case (collection): begin");
    }
    @After
    public  void after(){
        System.out.println("Test Case (collection): end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite (collection): begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite (collection): end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //When
        ArrayList<Integer> resultList = oddNumbersExterminator.exterminate(new ArrayList<>());
        //Then
        Assert.assertTrue(resultList.isEmpty());
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList<Integer> testList = new ArrayList<>();
        for (int i = 0; i <7 ; i++) {
            testList.add(i);
        }
        //When
        List<Integer> expectedList =Arrays.asList(0,2,4,6);
        ArrayList<Integer> resultList = oddNumbersExterminator.exterminate(testList);
        //Then
        Assert.assertEquals(expectedList,resultList);
    }
}
