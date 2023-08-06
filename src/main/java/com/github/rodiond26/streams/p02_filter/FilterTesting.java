package com.github.rodiond26.streams.p02_filter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

import static com.github.rodiond26.streams.p02_filter.Student.makeStudents;

public class FilterTesting {
    public static void main(String[] args) {
        List<Student> students = makeStudents();

        List<Student> filteredStudents = students.stream()
                .filter(student -> student.getAge() > 22 && student.getAvgGrade() < 7.2)
                .collect(Collectors.toList());
        System.out.println(filteredStudents);
    }
}
