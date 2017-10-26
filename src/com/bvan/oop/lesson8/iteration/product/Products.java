package com.bvan.oop.lesson8.iteration.product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class Products implements Iterable<Product> {

    private final List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }
}
