package com.bvan.oop.lesson2.storing;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayCopyStoring {

    public static void main(String[] args) {
        int[] a = {10, 20};
        int[] b = Arrays.copyOf(a, a.length);

        b[0] = 1000;

        System.out.println("a = " + Arrays.toString(a)); // [10, 20]
        System.out.println("b = " + Arrays.toString(b)); // [1000, 20]
    }
}
