package com.bvan.oop.lesson8.iteration;

/**
 * @author bvanchuhov
 */
public class IterationArrayExample {

    public static void main(String[] args) {
        int[] array = {10, 30, 20};

        for (int elem : array) {
            System.out.println(elem);
        }

        for (int i = 0; i < array.length; i++) {
            int elem = array[i];
            System.out.println(elem);
        }
    }
}
