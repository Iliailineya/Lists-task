package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        runDemo();
    }

    public static void runDemo() {
        firstTask();
        System.out.println();
        secondTask();
        System.out.println();
        thirdTask();
    }

    public static void firstTask() {
        List<String> names = DataProvider.createNamesList();
        Util.printMessage(names, "Initial list:");

        Util.printMessage(Util.sortNames(names), "\nSorted list:");
    }

    public static void secondTask() {
        List<String> fruits = DataProvider.createFruitsList();
        Util.printMessage(fruits, "Initial list:");

        Util.printMessage(Util.getListPart(fruits, 1, 3), "\nList part:");
    }

    public static void thirdTask() {
        LinkedList<String> products = DataProvider.createFruitsLinkedList();
        Util.printMessage(products, "Initial list:");

        Util.manipulateList(products);
        Util.printMessage(products, "\nEdited list:");
    }
}