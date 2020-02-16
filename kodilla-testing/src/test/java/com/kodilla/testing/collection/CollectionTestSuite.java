package com.kodilla.testing.collection;

import org.junit.*;
import java.util.ArrayList;

public class CollectionTestSuite {
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
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> testList = new ArrayList<>();
        //When
        ArrayList<Integer> expectedList = new ArrayList<>();
        ArrayList<Integer> resultList = oddNumbersExterminator.exterminate(testList);
        //Then
        Assert.assertEquals(expectedList,resultList);
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> testList = new ArrayList<>();
        for (int i = 0; i <7 ; i++) {
            testList.add(i);
        }
        //When
        ArrayList<Integer> expectedList = new ArrayList<>();
        expectedList.add(0);
        expectedList.add(2);
        expectedList.add(4);
        expectedList.add(6);

        ArrayList<Integer> resultList = oddNumbersExterminator.exterminate(testList);
        //Then
        Assert.assertEquals(expectedList,resultList);
    }
}
