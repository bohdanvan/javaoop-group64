package com.bvan.oop.lesson7.wrapper;

/**
 * @author bvanchuhov
 */
public class IntegerExample {

    public static void main(String[] args) {
        Integer x = 10; // autoboxing, int -> Integer
        Integer y = 20;
        Integer z = x + y;
        // Integer.valueOf(x.intValue() + y.intValue())

        System.out.println(z);
    }
}
