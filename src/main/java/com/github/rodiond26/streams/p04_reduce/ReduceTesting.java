package com.github.rodiond26.streams.p04_reduce;

import java.util.ArrayList;
import java.util.List;

public class ReduceTesting {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);

        int result = list.stream()
                .reduce(1, (accumulator, element) -> accumulator * element);
        // Работа reduce
        // stream = 5, 8, 2, 4, 3
        // accumulator = 5, 40, 80, 320, 960
        // element =     8,  2,  4,   3
        System.out.println(result);

        List<String> strList = new ArrayList<>();
        strList.add("a5");
        strList.add("n8");
        strList.add("s2");
        strList.add("v4");
        strList.add("l3");

        String reduceStr = strList.stream()
                .reduce((strResult, strValue) -> strResult + " " + strValue)
                .get();
        System.out.println(reduceStr);
    }
}
