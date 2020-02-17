package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    List<Shape> shapeArrayList = new ArrayList<>();

    public void addFigure(Shape shape){
        shapeArrayList.add(shape);
    }
    public void removeFigure(Shape shape){
        shapeArrayList.remove(shape);
    }
    public Shape getFigure(int n){
        return shapeArrayList.get(n);
    }
    public String showFigures(){
        return shapeArrayList.toString();
    }
}
