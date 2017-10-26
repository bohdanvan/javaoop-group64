package com.bvan.oop.lesson8.iteration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class IterationObjectsExample {

    public static void main(String[] args) {
        Iterable<Integer> list =
                new ArrayList<>(Arrays.asList(10, 20, 30));

        for (Integer elem : list) {
            System.out.println(elem);
        }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer elem = iterator.next();
            System.out.println(elem);
        }
    }
}
