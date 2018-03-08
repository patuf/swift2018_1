package com.swift.academy.generics;

import java.util.List;
import java.util.ArrayList;

public class GenericClass {

    public static void main(String[] args) {
        //Array
        String[] arr = new String[10];

        List<String> collection = getCollection();

        String first = collection.get(0);

        List<Object> nonGeneric = new ArrayList<>();

        printAll(collection);

        List<String> copyOfCollection = justReturnCollection(collection);

//        printAllString(nonGeneric);
        printAllString(copyOfCollection);

    }

    public static List<String> getCollection() {
        List<String> collection = new ArrayList<>();

        collection.add("One");
        collection.add("Two");

        return collection;
    }

    public static void printAll(List collection) {
        for (int i = 0; i < collection.size(); i++) {
            System.out.println(collection.get(i));
        }
    }

    public static List justReturnCollection(List collection) {
        collection.add(1);

        return collection;
    }

    public static void printAllString(List<String> collection) {
        for (String s : collection) {
            System.out.println(s);
        }
    }
}
