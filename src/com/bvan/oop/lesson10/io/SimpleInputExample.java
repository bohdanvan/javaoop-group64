package com.bvan.oop.lesson10.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author bvanchuhov
 */
public class SimpleInputExample {

    public static void main(String[] args) {
        // 1. Create/Open a stream +
        // 2. Read +
        // 3. Close the stream +

        String fileName = "files/message.txt";

        try {
            String s = readMessageFromFile(fileName);
            System.out.println(s);
        } catch (FileNotFoundException e) {
            System.out.println("Sorry, illegal file: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Sorry, IO error: " + e.getMessage());
        }
    }

    /**
     * @throws FileNotFoundException
     * @throws IOException
     */
    private static String readMessageFromFile(String fileName) throws IOException {
        // try-with-resources
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            return reader.readLine();
        }
    }

    /**
     * @throws FileNotFoundException
     * @throws IOException
     */
    private static String readMessageFromFileOldStyle(String fileName) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            return reader.readLine();
        } finally {
            closeReader(reader);
        }
    }

    private static void closeReader(BufferedReader reader) {
        try {
            if (reader != null) {
                reader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
