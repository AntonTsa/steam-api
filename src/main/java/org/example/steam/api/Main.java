package org.example.steam.api;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eve", "Frank");

        System.out.println();
        OddNumberPrinter.printOddNames(names);
        System.out.println("--------");
        DescendingSorter.printSortedDescending(names);

        String[] numberStrings = {"3, 5, 1", "4, 2", "8, 6, 7"};

        System.out.println("--------");
        NumbersPrinter.printNumbers(numberStrings);
        System.out.println("--------");
        System.out.println(Arrays.toString(RandomInfinitySteamHandler
                .generateRandomInfinitySteam(25214903917L, 11, 281474976710656L)
                .limit(10)
                .toArray()));
        System.out.println("--------");
        System.out.println(StreamsZipper.zip(
                names.stream(),
                Arrays.stream(numberStrings)).toList());
    }
}
