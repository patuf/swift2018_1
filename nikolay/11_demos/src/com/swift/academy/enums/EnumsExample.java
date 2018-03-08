package com.swift.academy.enums;

public class EnumsExample {

    public static void main(String[] args) {
        
        Grade grade = Grade.Excellent;
        System.out.printf("%s %d%n", grade, grade.getValue());

        Grade[] grades = {Grade.Excellent, Grade.Excellent, Grade.VeryGood, Grade.Good};
        System.out.println(Grade.getAverage(grades)); // Very Good

        grades = new Grade[]{Grade.Excellent, Grade.Poor};
        System.out.println(Grade.getAverage(grades)); // Poor

        if(grade instanceof Object) {
            System.out.println("Object");
        }

        printEnumValue(Grade.Poor);
    }

    public static void printEnumValue(Grade grade) {
        switch (grade) {
            case Excellent:
                System.out.printf("Excellent - %d", grade.getValue());
                break;
            case VeryGood:
                System.out.printf("VeryGood - %d", grade.getValue());
                break;
            case Average:
                System.out.printf("Average - %d", grade.getValue());
                break;
            case Good:
                System.out.printf("Good - %d", grade.getValue());
                break;
            default:
                System.out.printf("You have failed, you grade is %d", grade.getValue());

        }
    }
}
