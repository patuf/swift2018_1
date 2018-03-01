package com.swift.academy.homework06.task4;

import java.util.Scanner;
,
/**
 * To avoid hassle, we just assume names cannot contains spaces, contrary to what is shown in the task definition.
 */
public class Task4_Market {
    private static Task4_Market market = new Task4_Market(200, 500);

    private final Person[] buyers;
    // Question: Think about what would happen if Product was mutable!
    // Question: If we wanted to keep product quantities, where would we put it?
    private final Product[] products;
    private int buyerCounter = 0;
    private int productCounter = 0;

    public Task4_Market(int maxPersonCnt, int maxProdCnt) {
        this.buyers = new Person[maxPersonCnt];
        this.products = new Product[maxProdCnt];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String personsToParse = sc.nextLine();
        String[] personsAndBalances = personsToParse.split(";");
        for (String personAndBalance : personsAndBalances) {
            String[] pbArr = personAndBalance.split("=");
            if (pbArr.length != 2) {
                System.out.println("A person needs both name and balance and nothing else!");
                // By default the systems exits with code 0. Code 1 means an error happened.
                System.exit(1);
            }
            if (pbArr[0].isEmpty()) {
                System.out.println("Name can't be empty.");
                System.exit(1);
            }
            double balance = Double.parseDouble(pbArr[1]);
            if (balance < 0) {
                System.out.println("Balance can't be negative.");
                System.exit(1);
            }
            market.addBuyer(pbArr[0], balance);
        }
        String productsToParse = sc.nextLine();
        String[] productsAndPrices = productsToParse.split(";");
        for (String productAndPrice : productsAndPrices) {
            String[] ppArr = productAndPrice.split("=");
            if (ppArr.length != 2) {
                System.out.println("A product needs both name and price and nothing else!");
                // By default the systems exits with code 0. Code 1 means an error happened.
                System.exit(1);
            }
            if (ppArr[0].isEmpty()) {
                System.out.println("Name can't be empty.");
                System.exit(1);
            }
            double price = Double.parseDouble(ppArr[1]);
            if (price < 0) {
                System.out.println("Price can't be negative.");
                System.exit(1);
            }
            market.addProduct(ppArr[0], price);
        }

        // Pay attention to this construction - not too common, but has its uses
        outerLoop:
        while (true) {
            String op = sc.next();

            switch (op) {
                case "END":
                    market.listPossessions();
                    break outerLoop;
                default:
                    // op is a person name now
                    String prodName = sc.next();
                    // Logic too fuzzy? Perhaps...
                    System.out.printf("%s %s %s%n", op, market.makePurchase(op, prodName) ? "bought" : "can't afford", prodName);
                    break;
            }
        }
    }

    public void addBuyer(String name, double balance) {
        buyers[buyerCounter++] = new Person(name, balance);
    }

    public void addProduct(String name, double price) {
        products[productCounter++] = new Product(name, price);
    }

    /**
     * Returns false if person or product was not found or the person can't afford the product.
     * Obviously this return contract is not informative enough, as it doesn't give us the power to investigate what exactly happened.
     * Exceptions would have been useful here...
     * @param personName
     * @param productName
     * @return True if the purchase was successful, false if person or product was not found or the person can't afford the product.
     */
    public boolean makePurchase(String personName, String productName) {
        int personIdx = findByName(buyers, buyerCounter, personName);
        int productIdx = findByName(products, productCounter, productName);

        if (personIdx < 0 || productIdx < 0)
            return false;

        // Think about what would happen if Product was mutable!
        return buyers[person[Idx].buy(products[productIdx]);
    }

    /**
     * Noone can hide from the law! Every possession will be brought to light!
     */
    public void listPossessions() {
        for (int i = 0; i < buyerCounter; i++) {
            System.out.printf("%s - ", buyers[i].getName());
            if (buyers[i].getPossessionCount() == 0)
                System.out.println("Nothing bought");
            else {
                for (int j = 0; j < buyers[i].getPossessionCount(); j++) {
                    System.out.print(buyers[i].getPossessions()[j].getName());
                    if (j < buyers[i].getPossessionCount() - 1)
                        System.out.print(", ");
                    else
                        System.out.println();
                }
            }
        }
    }

    /** Find the polymorphism */
    private int findByName(Named[] arr, int currCount, String name) {
        for (int i = 0; i < currCount; i++) {
            if (arr[i].getName().equals(name))
                return i;
        }
        return -1;
    }
}
