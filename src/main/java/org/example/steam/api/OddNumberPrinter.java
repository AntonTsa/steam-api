package org.example.steam.api;

import java.util.List;

public class OddNumberPrinter {
    public static void printOddNames(List<String> names) {
        names.stream()
                .filter(name -> names.indexOf(name) % 2 != 0)
                .forEach(name -> System.out.println(names.indexOf(name) + ". " + name));
    }
}
