package com.github.rodiond26.streams.p17_skip;

import com.github.rodiond26.lambdas.Student;

import java.util.List;

import static com.github.rodiond26.lambdas.Student.makeStudents;

public class SkipTesting {
    public static void main(String[] args) {
        List<Student> students = makeStudents();

        students.stream()
                .filter(student -> student.getAge() > 20)
                .skip(3)
                .forEach(System.out::println);
    }
}
