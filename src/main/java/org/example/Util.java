package org.example;

import java.util.*;

public class Util {
    public static List<String> sortNames(List<String> names) {
        List<String> sortedNames = new ArrayList<>(names);
        Collections.sort(sortedNames);
        return sortedNames;
    }

    public static void printList(List<String> sortedNames) {
        for (int i = 0; i < sortedNames.size(); i++) {
            String s = (i + 1) + ") " + sortedNames.get(i);
            System.out.println(s);
        }
    }

    public static void printMessage(List<String> item, String message) {
        System.out.println(message);
        printList(item);
    }

    public static List<String> getListPart(List<String> list, int startIndex, int endIndex) {
        if (startIndex < 1 || endIndex > list.size() || startIndex > endIndex) {
            throw new IllegalArgumentException("Invalid start or end index.");
        }

        return list.subList(startIndex, endIndex);
    }

    public static void manipulateList(LinkedList<String> products) {
        products.addFirst("plum");
        products.addLast("mango");
    }
}
