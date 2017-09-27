package com.bvan.oop.lesson1.dynamic_array.oop;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class DynamicArrayApp {

    public static void main(String[] args) {
        DynamicArray elems = readClientElemsFromConsole();
        System.out.println("Your numbers: " + elems.toString());
    }

    private static DynamicArray readClientElemsFromConsole() {
        RepeatableReader reader = new RepeatableReader(System.in);

        DynamicArray elems = new DynamicArray(10, 1.5);

        int n = reader.readInt();
        while (n != 0) {
            elems.addLast(n);
            n = reader.readInt();
        }

        return elems;
    }
}
