package com.swift.academy.statics;

class Student {
    static int count = 0;
    static int studentLimit;

    int studentId;
    String name;
    String birthPlace;

    static {
        String str = "Some crazy law I read on Internet, saying that student limit is 5.";

        int n = 0;

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                n = c - '0';
            }
        }

        studentLimit = n;
    }

    Student(String name, String birthPlace) {
        if (Student.count >= studentLimit) {
            System.out.println("No more students can be registered. " + name + " was rejected.");
            //throw new RuntimeException("No more students can be registered. " + name + " was rejected.");
        } else {
            Student.count++;

            this.name = name;
            this.birthPlace = birthPlace;
            this.studentId = count;
        }
    }

}