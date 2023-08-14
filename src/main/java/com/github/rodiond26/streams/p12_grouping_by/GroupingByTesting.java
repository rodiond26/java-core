package com.github.rodiond26.streams.p12_grouping_by;

import com.github.rodiond26.lambdas.Student;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.github.rodiond26.lambdas.Student.makeStudents;

public class GroupingByTesting {
    public static void main(String[] args) {
        List<Student> students = makeStudents();

        Map<Integer, List<Student>> map = students.stream()
                .map(student -> {
                    student.setName(student.getName().toUpperCase());
                    return student;
                })
                .collect(Collectors.groupingBy(student -> student.getCourse()));
        System.out.println(map);
    }
}
