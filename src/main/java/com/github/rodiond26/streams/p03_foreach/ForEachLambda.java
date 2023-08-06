package com.github.rodiond26.streams.p03_foreach;

import java.util.Arrays;

public class ForEachLambda {
    public static void main(String[] args) {
        int[] array = {5, 9, 3, 8, 1, 17, 23, 33, 2};

        Arrays.stream(array).forEach(Utils::method);
    }
}

class Utils {
    public static void method(int a) {
        a = a + 5;
        System.out.println("Element = " + a);
    }
}
