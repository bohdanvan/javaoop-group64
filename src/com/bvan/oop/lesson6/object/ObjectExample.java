package com.bvan.oop.lesson6.object;

/**
 * @author bvanchuhov
 */
public class ObjectExample {

    public static void main(String[] args) {
        Person person = new Person("Taras", 25);
        Object object = person;

        System.out.println(object.toString());
    }
}
