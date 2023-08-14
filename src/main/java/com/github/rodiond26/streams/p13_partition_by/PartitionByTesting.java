package com.github.rodiond26.streams.p13_partition_by;

import com.github.rodiond26.lambdas.Student;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.github.rodiond26.lambdas.Student.makeStudents;

public class PartitionByTesting {

    public static void main(String[] args) {
        List<Student> students = makeStudents();

        Map<Boolean, List<Student>> map = students.stream()
                .collect(Collectors.partitioningBy(student -> student.getAvgGrade() > 7));
        System.out.println(map);
    }
}
