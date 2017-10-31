package com.bvan.oop.lesson9.set;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author bvanchuhov
 */
public class SetExample {

    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();

        set.add("Kotlin");
        set.add("Java");
        set.add("Python");
        set.add("ASM");
        set.add("Kotlin");
        set.add("Java");
        set.add("ASM");
        set.add("Kotlin");
        set.add("Python");
        set.add("Java");
        set.add("Python");
        set.add("Ruby");

        System.out.println(set);

        boolean contains = set.contains("Fortran");
        System.out.println(contains);
    }
}
