package com.github.rodiond26.lambdas.p2_first_lambda;

import com.github.rodiond26.lambdas.Student;

import java.util.List;

import static com.github.rodiond26.lambdas.Utils.delimiter;

public class StudentInfo {

    public static void main(String[] args) {
        List<Student> students = Student.makeStudents();

        StudentInfo studentInfo = new StudentInfo();

        delimiter();
        // 1. применение интерфейса
        studentInfo.studentCheck(students, new CheckOverGrade());

        delimiter();
        // 2. применение анонимного класса
        studentInfo.studentCheck(students, new StudentCheck() {
            @Override
            public boolean check(Student student) {
                return student.getAge() < 30;
            }
        });

        delimiter();
        // 3. от анонимного класса к лямбда-выражению
        studentInfo.studentCheck(students, (Student student) -> {
            return student.getAge() < 30;
        });
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

        // 6. Лямбда-выражение можно написать через переменную
        StudentCheck sc = (Student student) -> student.getAge() > 20 && student.getAvgGrade() < 9 && student.getSex() == 'f';
        studentInfo.studentCheck(students, sc);
    }

    void studentCheck(List<Student> students, StudentCheck studentCheck) {
        for (Student student : students) {
            if (studentCheck.check(student)) {
                System.out.println(student);
            }
        }
    }
}
