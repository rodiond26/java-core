package com.github.rodiond26.lambdas.p3_example_2;

public class LambdaTesting {
    public static void def(I i) {
        System.out.println(i.abc("hello"));
    }

    public static void main(String[] args) {
        def((String str) -> {
            return str.length();
        });

        def((String str) -> str.length());

        def(String::length);
    }
}

interface I {
    int abc(String str);
}
