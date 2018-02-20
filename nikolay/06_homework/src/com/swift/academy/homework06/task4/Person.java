package com.swift.academy.homework06.task4;

// What is this "implements Named"?!?
public class Person implements Named {
    // Is this class mutable or immutable?
    private final String name;
    private double balance;
    /**
     * The market has a number of users, then each user has a number of products.
     */
    private Product[] possessions = new Product[500];
    private int possessionCount = 0;

    public Person(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    /**
     * Makes an attempt to buy the given product
     * @param product The product to buy
     * @return true if successfully bought, false if this person can't afford it.
     */
    public boolean buy(Product product) {
        if (product.getPrice() > balance)
            return false;

        balance -= product.getPrice();
        possessions[possessionCount++] = product;
        return true;
    }

    public String getName() {
        return name;
    }

    public Product[] getPossessions() {
        return possessions;
    }

    public int getPossessionCount() {
        return possessionCount;
    }
}
