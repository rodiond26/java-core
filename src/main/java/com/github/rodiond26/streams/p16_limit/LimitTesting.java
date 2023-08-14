package com.github.rodiond26.streams.p16_limit;

import com.github.rodiond26.lambdas.Student;

import java.util.List;

import static com.github.rodiond26.lambdas.Student.makeStudents;

public class LimitTesting {
    public static void main(String[] args) {
        List<Student> students = makeStudents();

        students.stream()
                .filter(student -> student.getAge() > 20)
                .limit(2)
                .forEach(System.out::println);
    }
}
