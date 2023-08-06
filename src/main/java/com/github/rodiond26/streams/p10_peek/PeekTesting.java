package com.github.rodiond26.streams.p10_peek;

import java.util.stream.Stream;

public class PeekTesting {
    public static void main(String[] args) {
        Stream<Integer> stream  = Stream.of(0, 1, 2, 3, 4, 99, 1, 2, 3);
        System.out.println(stream
                .distinct()
                .sorted()
                .peek(System.out::println)
                .count());
    }
}
