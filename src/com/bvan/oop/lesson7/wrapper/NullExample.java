package com.bvan.oop.lesson7.wrapper;

/**
 * @author bvanchuhov
 */
public class NullExample {

    public static void main(String[] args) {
        Integer x = null;
        x++; // x = Integer.valueOf(x.intValue() + 1)
        System.out.println(x);
    }
}
