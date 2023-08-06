package com.github.rodiond26.lambdas.p9_foreach_lambda;

import java.util.ArrayList;
import java.util.List;

import static com.github.rodiond26.lambdas.Utils.delimiter;

public class ForEachTesting {

    public static void main(String[] args) {
        List<String> list1 = List.of("privet", "kak dela?", "normal", "poka");

        // 1. Обычный foreach
        for (String str : list1) {
            System.out.println(str);
        }

        // 2. Применение Consumer
        list1.forEach(str -> System.out.println(str));

        // 3. Упрощение выражения
        list1.forEach(System.out::println);

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);

        list2.forEach(element -> {
            delimiter();
            System.out.println(element);
            element *= 2;
            System.out.println(element);
        });
    }
}
