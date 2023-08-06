package com.github.rodiond26.lambdas.p1_no_lambdas;

import com.github.rodiond26.lambdas.Student;

import java.util.List;

import static com.github.rodiond26.lambdas.Utils.delimiter;

public class StudentInfo {
    public static void main(String[] args) {
        List<Student> students = Student.makeStudents();

        StudentInfo studentInfo = new StudentInfo();
        delimiter();
        studentInfo.printStudentsOverGrade(students, 8);
        delimiter();
        studentInfo.printStudentsUnderAge(students, 30);
        delimiter();
        studentInfo.printStudentsMixCondition(students, 20, 9.5, 'f');
    }

    void printStudentsOverGrade(List<Student> students, double grade) {
        for (Student student : students) {
            if (student.getAvgGrade() > grade) {
                System.out.println(student);
            }
        }
    }

    void printStudentsUnderAge(List<Student> students, int age) {
        for (Student student : students) {
            if (student.getAge() < age) {
                System.out.println(student);
            }
        }
    }

    void printStudentsMixCondition(List<Student> students, int age, double grade, char sex) {
        for (Student student : students) {
            if (student.getAge() > age && student.getAvgGrade() < grade && student.getSex() == sex) {
                System.out.println(student);
            }
        }
    }
}
