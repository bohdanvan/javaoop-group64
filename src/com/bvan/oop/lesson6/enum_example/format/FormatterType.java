package com.bvan.oop.lesson6.enum_example.format;

import com.bvan.oop.lesson5.format.Product;
import com.bvan.oop.lesson5.format.oop.Formatter;

/**
 * @author bvanchuhov
 */
public enum FormatterType implements Formatter {
    JSON {
        @Override
        public String format(Product product) {
            return "{\"name\": \"" + product.getName() + "\", \"price\": " + product.getPrice() + "}";
        }
    },
    CSV {
        @Override
        public String format(Product product) {
            return product.getName() + "," + product.getPrice();
        }
    }
}
