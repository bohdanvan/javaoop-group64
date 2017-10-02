package com.bvan.oop.lesson2.storing;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayMethodStoring {

    public static void main(String[] args) {
        int[] array = new int[10];
        Arrays.fill(array, 1);
        System.out.println("a = " + Arrays.toString(array));
    }
}
