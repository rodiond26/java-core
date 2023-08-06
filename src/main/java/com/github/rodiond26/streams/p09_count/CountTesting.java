package com.github.rodiond26.streams.p09_count;

import java.util.stream.Stream;

public class CountTesting {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        System.out.println(stream1.count());
        System.out.println(stream2.distinct().count());
    }
}
