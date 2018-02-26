package hmw06_objectsdebuging.task4market;

public class Product {
    private final String nameProduct;
    private double price;


    Product(String nameProd, double price) {
        this.nameProduct = setName(nameProd);
        this.price = setPrice(price);
    }
// property

    // property check correct input name
    private String setName(String nameProd) {
        if (nameProd.isEmpty() || nameProd.equals(null)) {// return while set name
            System.out.println("name can't be empty or null");
            return null;
        }// while input appropriate string for name we set
        return nameProd;// set name
    }


    // property set correct price
    private double setPrice(double price) {
        if (price < 0) {
            System.out.println("price can't be negative");
            System.exit(1);
            return -1;
        }
        return price;
    }

    // property to get name product
    public String getName() {
        return this.nameProduct;
    }

    // property get price product
    public double getPrice() {

        return this.price;
    }

}
