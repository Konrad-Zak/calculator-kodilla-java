package com.kodilla.testing.shape;

import org.junit.*;
import java.util.Arrays;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    private ShapeCollector shapeCollector = new ShapeCollector();

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void testAddFigure() {
        //When
        shapeCollector.addFigure(new Circle(4));
        //Then
        Assert.assertEquals(1, shapeCollector.shapeArrayList.size());
    }
    @Test
    public void testRemoveFigure(){
        //Given
        shapeCollector.shapeArrayList.addAll(Arrays.asList(new Square(4),new Circle(4),new Triangle(5,10)));
        Shape shapeRemove = new Circle(4);
        //When
        shapeCollector.removeFigure(shapeRemove);
        //Then
        Assert.assertFalse(shapeCollector.shapeArrayList.contains(shapeRemove));
    }
    @Test
    public void testGetFigure(){
        //Given
        shapeCollector.shapeArrayList.addAll(Arrays.asList(new Square(4),new Circle(4),new Triangle(5,10)));
        Shape expected = new Square(4);
        //When
        Shape result = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(expected,result);
    }
    @Test
    public void testShowFigures(){
        //When
        String result = shapeCollector.showFigures();
        //Then
        Assert.assertNotNull(result);
    }
}
