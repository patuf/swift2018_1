package com.swift.academy.enums;

public enum Grade {
    Poor(2),
    Average(3),
    Good(4),
    VeryGood(5),
    Excellent(6);

    private final int value;

    private Grade(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    
    /**
     * Calculates the average grade among a collection of grades. If any of the
     * grades is Poor, then the average is considered as Poor, regardless of the
     * actual value
     * @param grades
     * @return The rounded grade as an enum member.
     */ 
    public static Grade getAverage(Grade[] grades) {
        double avg = 0;
        
        for(Grade grade : grades) {
            if(grade == Poor) {
                return Poor;
            }
            
            avg += grade.getValue();
        }
        
        avg /= grades.length;

        int position = (int) avg - Poor.value;

        return Grade.values()[position];
    }
}
