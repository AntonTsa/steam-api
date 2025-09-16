package org.example.steam.api;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamsZipper {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> firstIterator = first.iterator();
        Iterator<T> secondIterator = second.iterator();

        return Stream
                .generate(
                        () -> {
                            List<T> pair = new ArrayList<>();
                            if (firstIterator.hasNext() && secondIterator.hasNext()) {
                                return List.of(firstIterator.next(), secondIterator.next());
                            } else {
                                return pair;
                            }
                        })
                .takeWhile(pair -> !pair.isEmpty())
                .flatMap(List::stream);
    }
}
