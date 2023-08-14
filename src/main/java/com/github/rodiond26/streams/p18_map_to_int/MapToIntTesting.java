package com.github.rodiond26.streams.p18_map_to_int;

import com.github.rodiond26.lambdas.Student;

import java.util.List;
import java.util.stream.Collectors;

import static com.github.rodiond26.lambdas.Student.makeStudents;

public class MapToIntTesting {
    public static void main(String[] args) {
        List<Student> students = makeStudents();

        List<Integer> courses = students.stream()
                .mapToInt(student -> student.getCourse())
                .boxed()
                .collect(Collectors.toList());
        System.out.println(courses);

        List<Double> averageGrades = students.stream()
                .mapToDouble(student -> student.getAvgGrade())
                .boxed()
                .collect(Collectors.toList());
        System.out.println(averageGrades);

        int sum = students.stream()
                .mapToInt(student -> student.getCourse())
                .sum();
        System.out.println(sum);

        double average = students.stream()
                .mapToInt(student -> student.getCourse())
                .average()
                .getAsDouble();
        System.out.println(average);

        int min = students.stream()
                .mapToInt(student -> student.getCourse())
                .min()
                .getAsInt();
        System.out.println(min);

        int max = students.stream()
                .mapToInt(student -> student.getCourse())
                .max()
                .getAsInt();
        System.out.println(max);
    }
}
