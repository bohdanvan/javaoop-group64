package com.bvan.oop.lesson4.shape.runner;

import com.bvan.oop.lesson4.shape.Circle;
import com.bvan.oop.lesson4.shape.Rectangle;
import com.bvan.oop.lesson4.shape.Shape;

import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class PolymorphismRunner {

    public static void main(String[] args) {
        printShapeInfo(new Rectangle(10.0, 20.0));
        printShapeInfo(new Circle(10.0));
    }

    public static void printShapeInfo(Shape shape) {
        System.out.println("S = " + shape.getArea());
        System.out.println("P = " + shape.getPerimeter());
        System.out.println();
    }

    public static double getShapesAre(
            ArrayList<Shape> shapes) {

        double sum = 0.0;
        for (Shape shape : shapes) {
            sum += shape.getArea();
        }
        return sum;
    }

    public static double getRectanglesArea(
            ArrayList<Rectangle> rectangles) {

        double sumArea = 0.0;
        for (Rectangle rectangle : rectangles) {
            sumArea += rectangle.getArea();
        }
        return sumArea;
    }

    public static double getCirclesArea(
            ArrayList<Circle> circles) {

        double sumArea = 0.0;
        for (Circle circle : circles) {
            sumArea += circle.getArea();
        }
        return sumArea;
    }
}
