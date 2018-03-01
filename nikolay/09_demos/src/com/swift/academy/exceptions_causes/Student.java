package com.swift.academy.exceptions_causes;

import java.io.IOException;

public class Student {

    static int count = 6;
    double[] grades;

    Student(double[] grades) {
        this.grades = grades;
    }

    double getAverageGrade() throws CalculationException {
        double avg = 0;

        try {
            for (int i = 0; i < count; i++) {
                avg += grades[i];
            }

            avg /= count;
        } catch (ArrayIndexOutOfBoundsException ex) {
            throw new CalculationException("Cannot calculate average grade.", ex);
        }

        return avg;
    }
}
