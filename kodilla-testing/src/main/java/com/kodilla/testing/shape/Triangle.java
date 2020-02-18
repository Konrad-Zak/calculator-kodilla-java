package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape{
    private String name = "Triangle";
    private double height;
    private double side;

    public Triangle(double height, double side) {
        this.height = height;
        this.side = side;
    }
    public String getShapeName(){
        return name;
    }

    public double getField(){
        return (height*side)/2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.height, height) == 0 &&
                Double.compare(triangle.side, side) == 0 &&
                Objects.equals(name, triangle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height, side);
    }
}
