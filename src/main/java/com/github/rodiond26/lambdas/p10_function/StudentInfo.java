package com.github.rodiond26.lambdas.p10_function;

import com.github.rodiond26.lambdas.Student;

import java.util.List;
import java.util.function.Function;

import static com.github.rodiond26.lambdas.Utils.delimiter;

public class StudentInfo {
    public static void main(String[] args) {
        List<Student> students = Student.makeStudents();
        StudentInfo studentInfo = new StudentInfo();
        delimiter();

        // 1. Пример Function в виде лямбда-выражения
        Function<Student, Double> f1 = student -> 3.14;
        Function<Student, Double> f2 = student -> student.getAvgGrade();
        Function<Student, Double> f3 = Student::getAvgGrade;

        // 1. Примеры использования интерфейса Function
        double result1 = averageOfSomething(students, student -> student.getAvgGrade());
        double result2 = averageOfSomething(students, Student::getAvgGrade);
        System.out.println(result1);
        System.out.println(result2);

        double result3 = averageOfSomething(students, student -> (double) student.getCourse());
        System.out.println(result3);

        double result4 = averageOfSomething(students, student -> (double) student.getAge());
        System.out.println(result4);
    }

    private static double averageOfSomething(List<Student> students, Function<Student, Double> f) {
        double result = 0;
        for (Student student : students) {
            result += f.apply(student);

        }
        result = result / students.size();
        return result;
    }
}
