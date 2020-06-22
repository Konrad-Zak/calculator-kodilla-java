package com.kodilla.patterns2.observer.homework;

import org.junit.Test;
import static org.junit.Assert.*;

public class StudentHomeworkTestSuite {

    @Test
    public void testUpdate(){
        //Given
        StudentHomework johnSmith = new Student("John Smith");
        StudentHomework johnWick = new Student("John Wick");
        StudentHomework markWeber = new Student("Mark Weber");
        Mentor arthurMax = new Mentor("Arthur Max");
        Mentor nickyCollins = new Mentor("Nicky Collins");
        johnSmith.registerObserver(arthurMax);
        johnWick.registerObserver(nickyCollins);
        markWeber.registerObserver(nickyCollins);
        //When
        johnSmith.addTask("task 1");
        johnSmith.addTask("task 2");
        johnWick.addTask("task 1");
        johnSmith.addTask("task 3");
        johnWick.addTask("task 2");
        markWeber.addTask("task 1");
        markWeber.addTask("task 2");
        //Then
        assertEquals(3,arthurMax.getCountTask());
        assertEquals(4,nickyCollins.getCountTask());
    }

}
