package com.bvan.oop.lesson2.person.oop;

/**
 * @author bvanchuhov
 */
public class PersonRunner {

    public static void main(String[] args) {
        Person ivan = new Person("Ivan", 20);
        String message = ivan.sayHello();
        System.out.println(message);

        Person taras = new Person("Taras", 30);

        int avgAge = (taras.getAge() + ivan.getAge()) / 2;
        System.out.println("avgAge = " + avgAge);

        System.out.println(ivan.toString());
    }
}
