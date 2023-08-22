package org.example;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class DataProvider {
    public static List<String> createNamesList() {
        return Arrays.asList("John", "Alice", "Robert", "Lisa", "David", "Amanda");
    }

    public static List<String> createFruitsList() {
        return Arrays.asList("orange", "mango", "banana", "apple", "kiwi", "cherry");
    }

    public static LinkedList<String> createFruitsLinkedList() {
        LinkedList<String> products = new LinkedList<>();
        products.add("orange");
        products.add("grape");
        products.add("apple");
        products.add("lemon");
        return products;
    }
}
