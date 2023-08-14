package com.github.rodiond26.streams.p14_find_first;

import com.github.rodiond26.lambdas.Student;

import java.util.Comparator;
import java.util.List;

import static com.github.rodiond26.lambdas.Student.makeStudents;

public class FindFirstTesting {
    public static void main(String[] args) {
        List<Student> students = makeStudents();

        Student firstStudent = students.stream()
                .map(student -> {
                    student.setName(student.getName().toUpperCase());
                    return student;
                })
                .filter(student -> student.getSex() == 'f')
                .sorted(Comparator.comparingInt(Student::getAge))
                .findFirst()
                .get();
        System.out.println(firstStudent);
    }
}
