package com.github.rodiond26.lambdas.p5_predicate;

import com.github.rodiond26.lambdas.Student;

import java.util.List;
import java.util.function.Predicate;

import static com.github.rodiond26.lambdas.Utils.delimiter;

public class StudentInfo {

    // 1. Применение Predicate
    void studentCheck(List<Student> students, Predicate<Student> pr) {
        for (Student student : students) {
            if (pr.test(student)) {
                System.out.println(student);
            }
        }
    }

    public static void main(String[] args) {
        List<Student> students = Student.makeStudents();

        StudentInfo studentInfo = new StudentInfo();

        delimiter();
        // 1. применение интерфейса с Predicate
        studentInfo.studentCheck(students, (Student student) -> {
            return student.getAge() < 30;
        });

        delimiter();
        // 2. упрощение записи
        studentInfo.studentCheck(students, (Student student) -> student.getAge() < 30);

        // 3. несколько вложенных действий
        studentInfo.studentCheck(students, (Student student) -> {
            System.out.println("nested actions");
            return student.getAge() < 30;
        });

        delimiter();
        // 4. сокращение записи лямбда-выражению
        studentInfo.studentCheck(students, (Student student) -> student.getAge() < 30);

        delimiter();
        // 5. еще примеры
        studentInfo.studentCheck(students, (Student student) -> student.getAvgGrade() > 8);
        delimiter();
        studentInfo.studentCheck(students, (Student student) -> student.getAge() > 20 && student.getAvgGrade() < 9 && student.getSex() == 'f');
    }
}
