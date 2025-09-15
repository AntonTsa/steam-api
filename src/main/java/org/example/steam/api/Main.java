package org.example.steam.api;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eve", "Frank");
        System.out.println();
        OddNumberPrinter.printOddNames(names);
        System.out.println("--------");
        DescendingSorter.printSortedDescending(names);
    }
}
