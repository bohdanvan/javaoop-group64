package com.bvan.oop.lesson7.sorting.min;

import com.bvan.oop.common.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class MinRunner {

    public static void main(String[] args) {
        List<Integer> ages = Arrays.asList(30, 20, 45);
        List<String> names = Arrays.asList("John", "Bob", "Phil");
        List<Person> people = Arrays.asList(
                new Person("John", 25),
                new Person("Bob", 30),
                new Person("Phil", 20)
        );

        System.out.println(Min.min(ages)); // 20
        System.out.println(Min.min(names)); // "Bob"
        System.out.println(Min.min(people, new AgeComparator())); // Person{name='Phil', age=20}
        System.out.println(Min.min(people, byName())); // Person{name='Bob', age=30}
    }

    public static Comparator<Person> byName() {
        return new Comparator<Person>() {
            @Override
            public int compare(Person a, Person b) {
                return a.getName().compareTo(b.getName());
            }
        };
    }

    public static Comparator<Person> byAge() {
        return new AgeComparator();
    }
}

class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person a, Person b) {
        return Integer.compare(a.getAge(), b.getAge());
    }
}
