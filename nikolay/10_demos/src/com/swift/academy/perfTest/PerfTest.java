package com.swift.academy.perfTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PerfTest {
    private static long startTime;

    public static void main(String[] args) {

        int size = 100000;
        List<Integer> arrList = new ArrayList<>(size);
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            arrList.add(i);
            linkedList.add(i);
        }

        tick();
        getAllElements(arrList);
        tock("get all arrlist");
        tick();
        getAllElements(linkedList);
        tock("get all linked");

        tick();
        iterateElements(arrList);
        tock("get all arrlist");
        tick();
        iterateElements(linkedList);
        tock("get all linked");

    }

    private static void tick() {
        startTime = System.nanoTime();
    }

    private static void tock(String label) {
        long elapsed = System.nanoTime() - startTime;
        System.out.printf("%s: %.3f ms%n", label, elapsed / 1000000.);
    }

    private static void getAllElements(List<?> list) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
    }
    private static void iterateElements(List<?> list) {
        for (Object o : list) {

        }
    }
}
