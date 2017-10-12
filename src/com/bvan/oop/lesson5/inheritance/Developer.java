package com.bvan.oop.lesson5.inheritance;

/**
 * @author bvanchuhov
 */
public class Developer extends Person {

    private final String company;

    public Developer(String name, int age, String company) {
        super(name, age);
        this.company = company;
    }

    public void writeCode() {
        System.out.println("I write code in " + company);
    }

    @Override
    public void sayHello() {
        super.sayHello();
        super.sayHello();
        System.out.println("I'm great dev " + getName() + " from " + company);
        super.sayHello();
    }


    @Override
    public String toString() {
        return "Developer{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", company='" + company + '\'' +
                '}';
    }
}
