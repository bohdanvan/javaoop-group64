package com.bvan.oop.lesson1.dynamic_array.oop;

import java.util.Arrays;
import java.util.StringJoiner;

/**
 * @author bvanchuhov
 */
public class DynamicArray {

    private int[] elems;
    private int size = 0;
    private final double growFactor;

    public DynamicArray(int initSize, double aGrowFactor) {
        elems = new int[initSize];
        growFactor = aGrowFactor;
    }

    public DynamicArray() {
        this(4, 1.5);
    }

    public void addLast(int n) {
        if (size == elems.length) {
            int newLength = (int) (growFactor * elems.length);
            elems = Arrays.copyOf(elems, newLength);
        }
        elems[size] = n;
        size++;
    }

    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < size; i++) {
            int elem = elems[i];
            joiner.add(String.valueOf(elem));
        }
        return joiner.toString();
    }
}
