package com.swift.academy.homework06.task4;

// What is this "implements Named"?!?
public class Product implements Named {
    // Is product mutable or immutable?
    private final String name;
    private final double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
