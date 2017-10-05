package com.bvan.oop.lesson3.rectangle;

/**
 * @author bvanchuhov
 */
public class RectanglesPrinter {

    public static void main(String[] args) {
        Rectangles rectangles = new Rectangles();

        rectangles.add(new Rectangle(10.0, 20.0));
        rectangles.add(new Rectangle(2.0, 1.0));

        double sumArea = rectangles.getArea();
        System.out.println("sumArea = " + sumArea);

        System.out.println(rectangles);
    }
}
