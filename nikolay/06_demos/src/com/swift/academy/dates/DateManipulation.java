package com.swift.academy.dates;


import com.sun.org.apache.xpath.internal.SourceTree;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateManipulation{

    public static void main(String[] args) {
        demo();
    }

    static void demo() {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date: " + currentDate);

        LocalDate firstDay_2010 = LocalDate.of(2010, Month.JANUARY, 1);
        System.out.println("First day of 2010: " + firstDay_2010);

        LocalDate yearDay_100 = LocalDate.ofYearDay(2017, 100);
        System.out.println("100th day of 2017: " + yearDay_100);

        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time: " + currentTime);

        LocalTime specificTime = LocalTime.of(20, 10, 5);
        System.out.println("Specific time: " + specificTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Local date time: " + localDateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MM yyyy  hh:mm:ss a");

        String out = localDateTime.format(formatter);
        System.out.println("Local date time: " + out);
        LocalDateTime.parse("1 10 1980  03:32:45 PM", formatter);

        //
        //
        if (currentDate.isBefore(LocalDate.of(2018, Month.MARCH, 1))) {
            System.out.println("You are good to go!");
        } else {
            System.out.println("You need to get new licence!");
        }

    }
}