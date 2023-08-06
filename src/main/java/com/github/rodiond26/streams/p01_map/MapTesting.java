package com.github.rodiond26.streams.p01_map;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.github.rodiond26.lambdas.Utils.delimiter;

public class MapTesting {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak dela?");
        list.add("OK");
        list.add("poka");

        // Пример создания stream 1
        Stream<String> stream = list.stream();
        List<String> newStrinList = stream.collect(Collectors.toList());

        // Пример создания stream 2
        Stream<String> newStream = Stream.of("privet", "kak dela?", "OK", "poka");

        List<Integer> newIntegerList = list.stream()
                .map(element -> element.length())
                .collect(Collectors.toList());

        int[] array = {5, 9, 3, 8, 1, 17, 23, 33, 2};
        array = Arrays.stream(array).map(element -> {
            if (element % 3 == 0) {
                element = element / 3;
            }
            return element;
        }).toArray();
        System.out.println(Arrays.toString(array));

        delimiter();

        Set<String> set = new TreeSet<>();
        set.add("bbb");
        set.add("privet");
        set.add("kak dela?");
        set.add("OK");
        set.add("poka");
        set.add("a");
        set.add("ccc");
        System.out.println(set);

        Set<Integer> newIntegerSet = set.stream().map(String::length).collect(Collectors.toSet());
        List<Integer> newIntegerList2 = set.stream().map(String::length).collect(Collectors.toList());
        System.out.println(newIntegerSet);
        System.out.println(newIntegerList2);
    }
}
