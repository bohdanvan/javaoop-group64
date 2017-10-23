package com.bvan.oop.lesson7.sorting;

/**
 * @author bvanchuhov
 */
public class ComparingExample {

    public static void main(String[] args) {
        System.out.println("int:");
        System.out.println(Integer.compare(10, 20)); // < 0
        System.out.println(Integer.compare(40, 30)); // > 0
        System.out.println(Integer.compare(5, 5)); // 0
        System.out.println();

        System.out.println("String:");
        System.out.println("ABCD".compareTo("EFG")); // < 0
        System.out.println("XBCD".compareTo("EFG")); // > 0
        System.out.println("EBCD".compareTo("EXG")); // < 0
        System.out.println("Home".compareTo("Homework")); // < 0
        System.out.println("Home".compareTo("Home")); // 0
        System.out.println();

        System.out.println("Integer:");
        Integer x = 10;
        Integer y = 20;
        System.out.println(x.compareTo(y)); // < 0
    }
}
