package com.bvan.oop.lesson8.iteration.array;

/**
 * @author bvanchuhov
 */
public class ArrayRunner {

    public static void main(String[] args) {
        Array<String> array = new Array<>(new String[]{"Java", "Kotlin", "Go"});

        for (String elem : array) {
            System.out.println(elem );
        }
    }
}
