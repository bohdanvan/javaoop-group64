package com.bvan.oop.lesson9.map.wordscounter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author bvanchuhov
 */
public class WordsCounter {

    public static void main(String[] args) {
        List<String> langs = Arrays.asList(
                "Java",
                "Kotlin",
                "JavaScript",
                "JavaScript",
                "Java",
                "JavaScript",
                "Fortran",
                "C#",
                "Java",
                "Go",
                "Fortran",
                "Fortran",
                "ASM",
                "Basic",
                "Python",
                "ASM",
                "ASM"
        );

        Map<String, Integer> langToCount = countWords(langs);
        for (Map.Entry<String, Integer> entry : langToCount.entrySet()) {
            System.out.println(entry);
        }
        System.out.println();

        List<Map.Entry<String, Integer>> sortedByCount = sortedByCount(langToCount);
        for (Map.Entry<String, Integer> entry : sortedByCount) {
            System.out.println(entry);
        }
    }

    private static List<Map.Entry<String, Integer>> sortedByCount(Map<String, Integer> wordToCount) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(wordToCount.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return Integer.compare(o1.getValue(), o2.getValue());
            }
        });

        return list;
    }

    public static Map<String, Integer> countWords(List<String> words) {
        Map<String, Integer> wordToCount = new LinkedHashMap<>();

        for (String word : words) {
            if (wordToCount.containsKey(word)) {
                Integer count = wordToCount.get(word);
                wordToCount.put(word, count + 1);
            } else {
                wordToCount.put(word, 1);
            }
        }

        return wordToCount;
    }
}
