package com.bvan.oop.lesson2.storing;

/**
 * @author bvanchuhov
 */
public class StringStoring {

    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = new String("Java");

        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); // true
    }
}
