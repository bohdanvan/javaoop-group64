package com.bvan.oop.lesson4.shape.runner;

import com.bvan.oop.lesson4.shape.Circle;
import com.bvan.oop.lesson4.shape.Rectangle;
import com.bvan.oop.lesson4.shape.Shape;

/**
 * @author bvanchuhov
 */
public class UpcastingDowncastingExample {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10.0, 20.0);

        downcasting(rectangle);
        upcasting(rectangle);
    }

    // BAD CODE
    public static void downcasting(Shape shape) {
        if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            System.out.println(rectangle.getWidth());
        }
    }

    // OK
    public static void upcasting(Rectangle rectangle) {
        Shape shape = rectangle;
        System.out.println(shape.getPerimeter());
    }
}
