package com.bvan.oop.lesson7.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class Example {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        addOne(names);

        String s = names.get(0);
        System.out.println(s);
    }

    private static void addOne(List list) {
        list.add(100);
    }
}
