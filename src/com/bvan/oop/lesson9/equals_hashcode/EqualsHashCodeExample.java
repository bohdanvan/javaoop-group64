package com.bvan.oop.lesson9.equals_hashcode;

import java.util.Objects;

/**
 * @author bvanchuhov
 */
public class EqualsHashCodeExample {

    public static void main(String[] args) {
        A a = new A(10);
        A b = new A(10);
        A c = new A(20);

        System.out.println("Equals:");
        System.out.println(a.equals(a)); // T
        System.out.println(a.equals(b)); // T
        System.out.println(b.equals(a)); // T
        System.out.println(a.equals(c)); // F
        System.out.println(Objects.equals(a, c)); // F
        System.out.println();

        System.out.println("Hash code:");
        System.out.println(a.hashCode() == a.hashCode()); // T
        System.out.println(a.hashCode() == b.hashCode()); // T
        System.out.println(a.hashCode() == c.hashCode()); // F, but can be T (collision)
        System.out.println();

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());
    }
}

class A {
    private final int x;

    public A(int x) {
        this.x = x;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        A a = (A) o;

        return x == a.x;
    }

    @Override
    public int hashCode() {
        return x;
    }
}
