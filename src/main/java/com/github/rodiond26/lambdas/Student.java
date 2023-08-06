package com.github.rodiond26.lambdas;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {

    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public static List<Student> makeStudents() {
        return List.of(
                new Student("Ivan", 'm', 22, 3, 8.3),
                new Student("Nikolay", 'm', 28, 2, 6.4),
                new Student("Elena", 'f', 19, 1, 8.9),
                new Student("Petr", 'm', 35, 4, 7),
                new Student("Maria", 'f', 23, 3, 9.1)
        );
    }
}
