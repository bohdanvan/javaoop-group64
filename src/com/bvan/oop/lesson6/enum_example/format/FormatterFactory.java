package com.bvan.oop.lesson6.enum_example.format;

import com.bvan.oop.lesson5.format.oop.CsvFormatter;
import com.bvan.oop.lesson5.format.oop.Formatter;
import com.bvan.oop.lesson5.format.oop.JsonFormatter;

/**
 * @author bvanchuhov
 */
public class FormatterFactory {

    private FormatterFactory() {
    }

    public static Formatter createByEnum(String type) {
        return FormatterType.valueOf(type.toUpperCase());
    }

    public static Formatter create(String type) {
        switch (type) {
            case "json":
                return new JsonFormatter();
            case "csv":
                return new CsvFormatter();
            default:
                throw new IllegalArgumentException("no such format type: " + type);
        }
    }
}
