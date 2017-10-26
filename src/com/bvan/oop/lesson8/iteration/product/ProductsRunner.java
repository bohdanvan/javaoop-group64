package com.bvan.oop.lesson8.iteration.product;

/**
 * @author bvanchuhov
 */
public class ProductsRunner {

    public static void main(String[] args) {
        Products products = new Products();
        products.add(new Product("MacBook", 2000));
        products.add(new Product("Lenovo", 1500));

        for (Product product : products) {
            System.out.println(product);
        }
    }
}
