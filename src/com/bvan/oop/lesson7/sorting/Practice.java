package com.bvan.oop.lesson7.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class Practice {

    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "John",
                "Bob",
                "Phil",
                "Alex",
                "Michael",
                "Ira",
                "Sofia"
        );
        Collections.sort(names);
        System.out.println("Alphabetical, ASC: " + names);

        Collections.sort(names, Collections.reverseOrder());
        System.out.println("Alphabetical, DESC: " + names);

        Collections.sort(names, new LengthComparator());
        System.out.println("Length, ASC: " + names);

        Collections.sort(names, Collections.reverseOrder(new LengthComparator()));
        System.out.println("Length, DESC: " + names);

        Collections.sort(names, new LengthComparator().reversed());
        System.out.println("Length, DESC: " + names);
    }
}

class LengthComparator implements Comparator<String> {

    @Override
    public int compare(String a, String b) {
        return Integer.compare(a.length(), b.length());
    }
}
