package com.swift.academy.all;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ListsDemo {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        list.add("Hello");
        list.add(5);
        list.add(3.14159);
        list.add(LocalDateTime.now());

        for (int i = 0; i < list.size(); i++) {
            Object value = list.get(i);
            System.out.printf("Index = %d; Value = %s\n", i, value);
        }

        List myNewList = new ArrayList<>();

        myNewList.addAll(list);
        myNewList.add(6);
        myNewList.add(6.78);
        myNewList.add("test");

        for (Object o : myNewList) {
            System.out.printf("Value = %s\n", o);
        }
    }
}
