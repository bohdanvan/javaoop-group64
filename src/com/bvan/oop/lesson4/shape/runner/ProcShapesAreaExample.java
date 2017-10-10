package com.bvan.oop.lesson4.shape.runner;

import com.bvan.oop.lesson4.shape.Circle;
import com.bvan.oop.lesson4.shape.Rectangle;
import com.bvan.oop.lesson4.shape.Shape;

import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class ProcShapesAreaExample {

    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Rectangle(10.0, 20.0)); // 200
        shapes.add(new Circle(10.0)); // 314

        double area = getShapesArea(shapes);
        System.out.println(area);
    }

    public static double getShapesArea(ArrayList<Shape> shapes) {
        double sum = 0.0;
        for (Shape shape : shapes) {
            sum += shape.getArea();
        }
        return sum;
    }
}
