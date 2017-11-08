package com.bvan.oop.lesson12.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author bvanchuhov
 */
public class ExecutorServiceBar {

    public static void main(String[] args) {
        ThreadUtils.println("Bar is opened");

        int availableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadUtils.println("availableProcessors = " + availableProcessors);

        ExecutorService executor =
                Executors.newFixedThreadPool(availableProcessors);

        for (int drinkerId = 0; drinkerId < 3; drinkerId++) {
            executor.submit(new Drinker());
        }
        executor.shutdown();

        ThreadUtils.println("Bar is closed");
    }
}
