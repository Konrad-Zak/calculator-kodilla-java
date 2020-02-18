package com.kodilla.testing.shape;

import java.lang.Math;
import java.util.Objects;

public class Square implements Shape {
    private String name = "Square";
    private double side;

    public Square(double side) {
        this.side = side;
    }
    public String getShapeName(){
        return name;
    }

    public double getField(){
        return Math.pow(side,2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.side, side) == 0 &&
                Objects.equals(name, square.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, side);
    }
}
