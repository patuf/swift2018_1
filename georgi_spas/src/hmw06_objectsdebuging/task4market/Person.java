package hmw06_objectsdebuging.task4market;

public class Person {

    private final String name;
    private double balance;
    private Product[] basketProduct;
    private int productCount;

    Person(String name, double balance) {
        this.name = setName(name);
        this.balance = setBalance(balance);
        int sizeBasket = 200;
        this.basketProduct = new Product[sizeBasket];
    }
    // property


    public Product[] getBasketProduct() {
        return basketProduct;
    }


    public double getBalance() {
        return this.balance;
    }
    // property check correct input name
    private String setName(String name) {
        if (name.isEmpty() || name.equals(null)) {// return while set name
        //    System.out.println("name can't be empty ");
            return null;
        }// while input appropriate string for name we set
        return name;// set name
    }
// property get count
    public int getProductCount(){// idea is to see person have any purchase
        return this.productCount;
    }

    private double setBalance(double balance) {
        if (!isPositiveBalance(balance)) {
            System.out.println("balance can't be negative");
            System.exit(1);
            return -1;
        }
        return balance;

    }

    // property to stop client make robbery( there are rules the police are waiting for you->https://www.youtube.com/watch?v=dSy2DcATYUo)
    // negative price on product we can't buy
    boolean isPositiveBalance(double balance) {
        //balance is negative we can't buy product
        return (balance >0);
    }

    // methods


    // buy need product e have price and name  buyRpoduct(Procuct prod) product have into price and name
    public boolean buyProduct(Product product) {

        if (checkBalance(product.getPrice())) {// take price to check balance of person to understand if he can buy
            // buy product
            if (canBought(product.getPrice())) {
                balance -= product.getPrice();// give me your money!!!
                addBasketProduct(product);
                return true;
            }
        }
        // don't buy no money enough
        return false;

    }

    // check balance
    private boolean checkBalance(double price) {

        return ((this.balance >= 0) && (this.balance - price >= 0));//(this.balance-balance>=0 it means we can pay for this product and owr balance is not negative)

    }

    //!!! decision to buy -if have money we buy !!otherwise we blow the soap!!( just joking for the soap)
    // boolean can bought give as can bought or no if bought go add to basket on person we pass from product params for price and name

    private boolean canBought(double price) {

        if (checkBalance(price)) {// we can buy

            return true;
        }
        // can't afford it blow it the soap
        return false;
    }

    // add buy product /add product in basket
    private void addBasketProduct(Product product) {
        if (productCount >= basketProduct.length) {// override volume of our basket for product
            System.out.println("Basket is FUll");
            return;
        }
        // add product
        basketProduct[productCount++] = product;
    }


    public String getName() {
        if (this.name==null){
            System.out.println("Name can't be null");
            return null;
        }

        return name;
    }
}
