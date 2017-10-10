package com.bvan.oop.lesson4.shape.runner;

import com.bvan.oop.lesson4.shape.Circle;
import com.bvan.oop.lesson4.shape.EquilateralTriangle;
import com.bvan.oop.lesson4.shape.Rectangle;
import com.bvan.oop.lesson4.shape.Shapes;

/**
 * @author bvanchuhov
 */
public class ShapesRunner {

    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        shapes.add(new Rectangle(10.0, 20.0));
        shapes.add(new Circle(10.0));
        shapes.add(new EquilateralTriangle(10.0));

        double area = shapes.getArea();
        System.out.println(area);
    }
}
