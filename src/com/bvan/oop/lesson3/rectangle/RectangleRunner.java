package com.bvan.oop.lesson3.rectangle;

/**
 * @author bvanchuhov
 */
public class RectangleRunner {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10.0, 20.0);
        double perimeter = rectangle.getPerimeter();
        System.out.println("perimeter = " + perimeter);

        double area = rectangle.getArea();
        System.out.println("area = " + area);
    }
}
