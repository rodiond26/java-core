package com.github.rodiond26.streams.p19_parallel_stream;

import java.util.List;

public class ParallelStreamTesting {
    public static void main(String[] args) {
        List<Double> list = List.of(
                10.0,
                5.0,
                1.0,
                0.25
        );

        double sum1 = list.stream()
                .reduce((accumulator, value) -> accumulator + value)
                .get();
        System.out.println(sum1);

        double sum2 = list.parallelStream()
                .reduce((accumulator, value) -> accumulator + value)
                .get();
        System.out.println(sum2);

        double div1 = list.stream()
                .reduce((accumulator, value) -> accumulator / value)
                .get();
        System.out.println(div1);

        double div2 = list.parallelStream()
                .reduce((accumulator, value) -> accumulator / value)
                .get();
        System.out.println(div2);
    }
}
