public class Person {
    private String name;
    private double balance;
    private int productsCount;

    private Product[] productsBought;

    Person(String name, double balance) {
        name = name;
        balance = balance;
        productsBought = new Product[500];
        productsCount = 0;
    }

    String getName() {
        return name;
    }

    boolean tryBuy(Product product) {
        if(balance >= product.getPrice()){
            balance -= product.getPrice();
            productsBought[productsCount++] = product;
            return true;
        }

        return false;
    }

    Product[] getProductsBought() {

        Product[] products = new Product[productsCount];

        //System.arraycopy(_productsBought, 0, products, 0, _productsCount);

        for(int i = 0 ; i < productsCount; i++){
            products[i] = productsBought[i];
        }

        return products;
    }
}
