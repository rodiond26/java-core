package com.github.rodiond26.streams.p15_min_max;

import com.github.rodiond26.lambdas.Student;

import java.util.Comparator;
import java.util.List;

import static com.github.rodiond26.lambdas.Student.makeStudents;

public class MinAndMaxTesting {
    public static void main(String[] args) {
        List<Student> students = makeStudents();

        Student minStudent = students.stream()
                .min(Comparator.comparingInt(Student::getAge))
                .get();
        System.out.println(minStudent);

        Student maxStudent = students.stream()
                .max(Comparator.comparingInt(Student::getAge))
                .get();
        System.out.println(minStudent);
    }
}
