package org.example.steam.api;

import java.util.List;

public class DescendingSorter {
    public static void printSortedDescending(List<String> strings) {
        strings.stream()
                .sorted(((o1, o2) -> -o1.compareTo(o2)))
                .forEach(System.out::println);
    }
}
