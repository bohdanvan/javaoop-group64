package com.bvan.oop.lesson2.person.proc;

/**
 * @author bvanchuhov
 */
public class ProcPersonRunner {

    public static void main(String[] args) {
        ProcPerson person = new ProcPerson();
        person.name = "Taras";
        person.age = 25;

        String message = getPersonInfo(person);

        System.out.println(message);

        double sin = Math.sin(10.0);
        System.out.println(sin);
    }

    private static String getPersonInfo(ProcPerson person) {
        return "Hello, I'm " + person.name + ", "
                + person.age + " years old";
    }
}
