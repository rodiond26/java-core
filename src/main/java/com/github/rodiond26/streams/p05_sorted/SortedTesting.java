package com.github.rodiond26.streams.p05_sorted;

import com.github.rodiond26.streams.p02_filter.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static com.github.rodiond26.streams.p02_filter.Student.makeStudents;

public class SortedTesting {
    public static void main(String[] args) {
        int[] array = {3, 8, 1, 5, 0, 9, 7, 4, 6, 2,};
        array = Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(array));

        List<Student> students = makeStudents();
        students = students.stream()
                .sorted((student1, student2) -> student1.getName().compareToIgnoreCase(student2.getName()))
                .collect(Collectors.toList());
        System.out.println(students);
    }
}
