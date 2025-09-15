package org.example.steam.api;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eve", "Frank");
        String[] numberStrings = {"3, 5, 1", "4, 2", "8, 6, 7"};

        System.out.println();
        OddNumberPrinter.printOddNames(names);
        System.out.println("--------");
        DescendingSorter.printSortedDescending(names);
        System.out.println("--------");
        NumbersPrinter.printNumbers(numberStrings);
    }
}
