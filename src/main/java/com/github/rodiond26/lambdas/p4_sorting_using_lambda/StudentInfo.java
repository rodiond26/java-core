package com.github.rodiond26.lambdas.p4_sorting_using_lambda;

import com.github.rodiond26.lambdas.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static com.github.rodiond26.lambdas.Utils.delimiter;

public class StudentInfo {

    public static void main(String[] args) {
        List<Student> students = Student.makeStudents();
        ArrayList<Student> studentList = new ArrayList<>(students);

        StudentInfo studentInfo = new StudentInfo();

        // 1. без использования лямбда-выражения
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getCourse() - s2.getCourse();
            }
        });
        delimiter();
        System.out.println(studentList);

        // 2. сортировка с лямбда-выражением
        Collections.sort(studentList, (s1, s2) -> s2.getCourse() - s1.getCourse());
        delimiter();
        System.out.println(studentList);

        // 3. Окончательный вид
        studentList.sort((s1, s2) -> s1.getCourse() - s2.getCourse());
        delimiter();
        System.out.println(studentList);
        studentList.sort(Comparator.comparingInt(Student::getCourse));
        delimiter();
        System.out.println(studentList);
    }
}
