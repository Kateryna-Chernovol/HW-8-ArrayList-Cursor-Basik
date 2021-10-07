package com.cursor.geometry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("1. Remove divisible by 3");
        List<Integer> array = new ArrayList<>();
        array.add(3);
        array.add(9);
        array.add(11);
        array.add(18);
        array.add(20);
        array.add(22);

        for (Integer value : array) {
            System.out.print(value + "  ");
        }
        System.out.println();
        array.removeIf(x -> x % 3 == 0);

        for (Integer value : array) {
            System.out.print(value + "  ");
        }
        System.out.println("\n");

        System.out.println("2. Replace \"Orange\" with \"Grapefruit\" if present");
        List<String> fruits = new ArrayList<>();
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Peach");
        System.out.println(fruits);
        if (fruits.contains("Orange")) {
            int orangeIndex = fruits.indexOf("Orange");
            fruits.set(orangeIndex, "Grapefruit");
        } else {
            System.out.println("Value not present");
        }
        System.out.println(fruits + "\n");

        System.out.println("3. Check similar elements in two ArrayLists");
        List<Integer> arrayFirst = new ArrayList<>();
        arrayFirst.add(10);
        arrayFirst.add(12);
        arrayFirst.add(15);
        System.out.println("First ArrayList: " + arrayFirst);
        List<Integer> arraySecond = new ArrayList<>();
        arraySecond.add(15);
        arraySecond.add(18);
        arraySecond.add(12);
        System.out.println("Second ArrayList: " + arraySecond);
        arrayFirst.retainAll(arraySecond);
        System.out.println("Same values: " + arrayFirst);
    }
}
