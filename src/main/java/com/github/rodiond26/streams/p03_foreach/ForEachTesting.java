package com.github.rodiond26.streams.p03_foreach;

import java.util.Arrays;

public class ForEachTesting {
    public static void main(String[] args) {
        int[] array = {5, 9, 3, 8, 1, 17, 23, 33, 2};
        Arrays.stream(array).
                forEach(element -> {
                    element *= 2;
                    System.out.println(element);
                });
        Arrays.stream(array).
                forEach(System.out::println);
    }
}
