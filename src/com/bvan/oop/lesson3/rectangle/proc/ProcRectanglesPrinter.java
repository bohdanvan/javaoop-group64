package com.bvan.oop.lesson3.rectangle.proc;

import com.bvan.oop.lesson3.rectangle.Rectangle;

import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class ProcRectanglesPrinter {

    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles = new ArrayList<>();

        rectangles.add(new Rectangle(10.0, 20.0));
        rectangles.add(new Rectangle(2.0, 1.0));

        double sumArea = sumArea(rectangles);
        System.out.println("sumArea = " + sumArea);
    }

    private static double sumArea(ArrayList<Rectangle> rectangles) {
        double sumArea = 0.0;
        for (Rectangle rectangle : rectangles) {
            sumArea += rectangle.getArea();
        }
        return sumArea;
    }
}
