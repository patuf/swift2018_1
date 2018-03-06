package com.swift.academy.all;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        Set treeSet = new TreeSet<>();
        List treeSet2 = new LinkedList();

        treeSet.add(5);
        treeSet.add(8);
        treeSet.add(1);
        treeSet.add(6);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.remove(6);

        treeSet2.add(4);
        treeSet2.add(3);

        if (treeSet.containsAll(treeSet2)) {
            System.out.printf("contains all from treeset2");
        } else {
            System.out.println("there is a missing element in treeSet");
        }

        treeSet.addAll(treeSet2);

        System.out.println();

        for (Object i : treeSet) {
            System.out.printf("%s ", String.valueOf(i));
        }

        // Result:  1 3 5 8
    }
}
