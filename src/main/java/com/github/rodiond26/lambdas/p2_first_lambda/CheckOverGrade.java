package com.github.rodiond26.lambdas.p2_first_lambda;

import com.github.rodiond26.lambdas.Student;

public class CheckOverGrade implements StudentCheck {

    @Override
    public boolean check(Student student) {
        return student.getAvgGrade() > 8;
    }
}
