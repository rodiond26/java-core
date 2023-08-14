package com.github.rodiond26.streams.p11_flatmap;

import com.github.rodiond26.streams.p02_filter.Student;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

public class FlatMapTesting {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student student2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student student3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student student4 = new Student("Petr", 'm', 35, 4, 7);
        Student student5 = new Student("Maria", 'f', 23, 3, 9.1);

        Faculty faculty1 = new Faculty("Economics");
        Faculty faculty2 = new Faculty("Mathematics");

        faculty1.addStudent(student1);
        faculty1.addStudent(student2);
        faculty1.addStudent(student3);

        faculty2.addStudent(student4);
        faculty2.addStudent(student5);

        List<Faculty> faculties = new ArrayList<>();
        faculties.add(faculty1);
        faculties.add(faculty2);

        faculties.stream()
                .flatMap(faculty -> faculty.getStudents().stream())
                .forEach(student -> System.out.println(student.getName()));

    }
}

@NoArgsConstructor
@Getter
class Faculty {
    private String name;
    List<Student> students;

    public Faculty(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}
