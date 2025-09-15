package org.example.steam.api;

import java.util.stream.Stream;

public class RandomInfinitySteamHandler {
    public static Stream<Long> generateRandomInfinitySteam(long a, long c, long m) {
        return Stream.iterate(3L, n -> n + 1)
                .map(n -> (a * (n - 1) + c) % m);
    }
}
