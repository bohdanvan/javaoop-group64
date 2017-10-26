package com.bvan.oop.lesson8.stringbuilder;

/**
 * @author bvanchuhov
 */
public class StringBuilderExample {

    public static void main(String[] args) {
        String name = "Taras";
        int age = 25;

        String helloMessage = "Hello, I'm " + name + ", "
                + age + " years old";
        System.out.println(helloMessage);

        StringBuilder sb = new StringBuilder()
                .append("Hello, I'm ")
                .append(name)
                .append(", ")
                .append(age)
                .append(" years old");
        System.out.println(sb);
    }
}
