package Market;

public class Person {
    private String name;
    private double balance;

    Product [] products = new Product[100];
    private int productCounter = 0;

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public Product[] getProducts() {
        return products;
    }

    public void addProduct(String name){
        products[productCounter] = new Product();
        products[productCounter++].setName(name);
    }

    public int getProductCounter() {
        return productCounter;
    }
}
