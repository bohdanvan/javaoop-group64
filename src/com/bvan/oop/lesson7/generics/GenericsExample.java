package com.bvan.oop.lesson7.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class GenericsExample {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Taras");
        names.add("Ivan");

        System.out.println(names);
    }
}
