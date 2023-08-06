package com.github.rodiond26.streams.p06_chaining;

import com.github.rodiond26.streams.p02_filter.Student;

import java.util.Arrays;
import java.util.List;

import static com.github.rodiond26.streams.p02_filter.Student.makeStudents;

public class ChainingTesting {
    public static void main(String[] args) {
        int[] array = {3, 8, 1, 81, 5, 0, 21, 9, 7, 4, 6, 2, 18};
        int result = Arrays.stream(array)
                .filter(e -> e % 2 == 1)
                .map(e -> e % 3 == 0 ? e / 3 : e)
                .reduce((a, e) -> (a + e)).getAsInt();

        System.out.println(result);


        List<Student> students = makeStudents();
        students.stream()
                .map(student -> {
                    student.setName(student.getName().toUpperCase());
                    return student;
                })
                .filter(student -> student.getSex() == 'f')
                .sorted((student1, student2) -> student1.getAge() - student2.getAge())
                .forEach(student -> System.out.println(student));
    }
}
