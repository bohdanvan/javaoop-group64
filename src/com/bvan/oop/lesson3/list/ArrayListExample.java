package com.bvan.oop.lesson3.list;

import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);

        int sum = sum(list);
        System.out.println("sum = " + sum);

        System.out.println(list);

    }

    private static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int elem : list) {
            sum += elem;
        }
        return sum;
    }
}
