package com.bvan.oop.lesson7.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class WithoutGenericsExample {

    public static void main(String[] args) {
        List names = new ArrayList();

        names.add("Taras");
        names.add("Ivan");

        String s = (String) names.get(0);

        System.out.println(names);
    }
}
