package com.bvan.oop.lesson5.format.proc;

import com.bvan.oop.lesson5.format.Product;

/**
 * @author bvanchuhov
 */
public class ProcProductsRunner {

    public static void main(String[] args) {
        ProcProducts products = new ProcProducts();
        products.add(new Product("MacBook", 2000));
        products.add(new Product("Lenovo", 1500));

        products.print("name");
        System.out.println();

        products.print("csv");
        System.out.println();

        products.print("json");
        System.out.println();
    }
}
