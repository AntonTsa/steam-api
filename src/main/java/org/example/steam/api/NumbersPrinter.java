package org.example.steam.api;

import java.util.Arrays;
import java.util.List;

public class NumbersPrinter {
    public static void printNumbers(String[] strings) {
        List<Integer> numbers = Arrays.stream(strings)
                .flatMap(string -> Arrays.stream(string.split(", ")))
                .map(Integer::parseInt)
                .sorted()
                .toList();

        numbers.forEach(
                number -> {
                    if (numbers.indexOf(number) != numbers.size() - 1) {
                        System.out.print(number + ", ");
                    } else {
                        System.out.print(number);
                    }
                }
        );

    }
}
