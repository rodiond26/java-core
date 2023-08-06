package com.github.rodiond26.lambdas.p6_removeif;

import java.util.ArrayList;
import java.util.function.Predicate;

import static com.github.rodiond26.lambdas.Utils.delimiter;

public class RemoveIfExample {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Hello1");
        al.add("Bye2");
        al.add("Ok");
        al.add("Learn Java");
        al.add("Lambda Expressions");
        System.out.println(al);
        delimiter();
        // 1. Первый вариант removeIf
        al.removeIf(element -> element.length() < 5);
        System.out.println(al);

        // 2. Второй вариант removeIf
        Predicate<String> predicate1 = element -> element.length() < 5;
        al.removeIf(predicate1);
        System.out.println(al);

        // 3. Использование Predicate + and
        Predicate<String> predicate2 = element -> element.length() > 12;
        al.removeIf(predicate1.and(predicate2));
        System.out.println(al);

        // 4. Использование Predicate + or
        Predicate<String> predicate3 = element -> element.length() > 13;
        al.removeIf(predicate2.or(predicate3));
        System.out.println(al);

        // 4. Использование Predicate + or
        Predicate<String> predicate4 = element -> element.length() > 13;
        al.removeIf(predicate4.negate());
        System.out.println(al);
    }
}
