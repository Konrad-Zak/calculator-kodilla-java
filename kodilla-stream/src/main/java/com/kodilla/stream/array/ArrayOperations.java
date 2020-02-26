package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
     static double getAverage(int[] numbers){

               System.out.println("Table of int numbers: ");
               IntStream.range(0,numbers.length)
                       .map(n->n=numbers[n])
                       .forEach(System.out::println);

               OptionalDouble result =  IntStream.range(0, numbers.length)
                       .map(n->n=numbers[n])
                       .average();

               if (result.isPresent()){
                    return result.getAsDouble();
               } else {
                    return 0.0;
               }
     }
}
