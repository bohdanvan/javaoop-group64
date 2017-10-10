package com.bvan.oop.lesson4.shape;

import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class Shapes {

    private final ArrayList<Shape> shapes = new ArrayList<>();

    public void add(Shape shape) {
        shapes.add(shape);
    }

    public double getArea() {
        double sum = 0.0;
        for (Shape shape : shapes) {
            sum += shape.getArea();
        }
        return sum;
    }
}
