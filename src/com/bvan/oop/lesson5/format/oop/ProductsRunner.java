package com.bvan.oop.lesson5.format.oop;

import com.bvan.oop.lesson5.format.Product;

/**
 * @author bvanchuhov
 */
public class ProductsRunner {

    public static void main(String[] args) {
        Products products = new Products();
        products.add(new Product("MacBook", 2000));
        products.add(new Product("Lenovo", 1500));

        products.print(new NameFormatter());
        System.out.println();

        products.print(new CsvFormatter());
        System.out.println();

        products.print(new CsvFormatter(";"));
        System.out.println();

        products.print(jsonFormatter());
        System.out.println();

        products.print(toStringFormatter());
    }

    private static JsonFormatter jsonFormatter() {
        return new JsonFormatter();
    }

    private static Formatter toStringFormatter() {
        return new Formatter() {
            @Override
            public String format(Product p) {
                return p.toString();
            }
        };
    }

    private static Formatter toStringFormatterWithLambda() {
        return p -> p.toString();
    }
}
