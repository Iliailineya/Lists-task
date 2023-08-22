package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = createInitialList();
        printInitialList(names);

        List<String> sortedNames = sortNames(names);
        printSortedNames(sortedNames);
    }

    private static List<String> createInitialList() {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Robert");
        names.add("Lisa");
        names.add("David");
        names.add("Amanda");
        return names;
    }

    private static void printInitialList(List<String> names) {
        System.out.println("Initial list:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println((i + 1) + ") " + names.get(i));
        }
    }

    private static List<String> sortNames(List<String> names) {
        List<String> sortedNames = new ArrayList<>(names);
        Collections.sort(sortedNames);
        return sortedNames;
    }

    private static void printSortedNames(List<String> sortedNames) {
        System.out.println("\nSorted list:");
        for (int i = 0; i < sortedNames.size(); i++) {
            System.out.println((i + 1) + ") " + sortedNames.get(i));
        }
    }
}