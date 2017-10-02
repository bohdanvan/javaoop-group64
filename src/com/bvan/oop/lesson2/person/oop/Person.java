package com.bvan.oop.lesson2.person.oop;

/**
 * @author bvanchuhov
 */
public class Person {

    private final String name; // field
    private final int age;

    public Person(String name, int age) {
        checkAge(age);

        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this(name, 0);
    }

    public String sayHello() {
        return "Hello, I'm " + name + ", " + age + " years old";
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Person changeName(String name) {
        return new Person(name, this.age);
    }

    public Person changeAge(int age) {
        return new Person(this.name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private void checkAge(int age) {
        if (!isAge(age)) {
            throw new IllegalArgumentException("Illegal age: " + age);
        }
    }

    private boolean isAge(int n) {
        return n >= 0 && n <= 120;
    }
}
