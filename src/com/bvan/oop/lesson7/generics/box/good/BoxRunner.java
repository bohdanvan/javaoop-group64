package com.bvan.oop.lesson7.generics.box.good;

import com.bvan.oop.lesson7.generics.box.Cat;
import com.bvan.oop.lesson7.generics.box.Dog;

/**
 * @author bvanchuhov
 */
public class BoxRunner {

    public static void main(String[] args) {
        Box<Cat> catBox = new Box<Cat>(new Cat());
        Box<Dog> dogBox = new Box<Dog>(new Dog());

        sendBox(catBox);
    }

    private static void sendBox(Box<Cat> catBox) {
        Cat cat = catBox.get();
        cat.meow();
    }
}
