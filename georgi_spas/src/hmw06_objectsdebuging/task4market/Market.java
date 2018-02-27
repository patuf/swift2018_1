package hmw06_objectsdebuging.task4market;

import sun.invoke.empty.Empty;

import java.util.Arrays;
import java.util.Scanner;

public class Market {
    private static Person[] clients;
    private static int countClient;
    private static Product[] availableProducts;
    private static int countProduct;
    private int availableProdCount;

    private static double profitMarket;
    private static int person = 0;// notate data for client to take characteristics
    private static int goods = 1;// notate products to take characteristics

    private


        // constructor
    Market(int sizeClient, int sizeProduct) {

        this.clients = new Person[sizeClient];
        this.availableProducts = new Product[sizeProduct];
    }


    // property

    //  when buy product from market he becomes client in  market
    public static void buyProducInMarket(Person client, Product product) {

        System.out.print(client.getName());// out for print line name client when print answer fro bought or not bought

        if (!client.isPositiveBalance(client.getBalance())) {

            // stop we can't buy money are negative
            return;
        }
        if (client.getName() == null) {
            return;// name can't be null we do not serve ghosts-> https://www.youtube.com/watch?v=tA8AfQaUnXM&list=RDtA8AfQaUnXM&t=78
        }
        if (client.getName().isEmpty()) {
            return;//
        }

        if (client.buyProduct(product)) {// client can afford it
            profitMarket += product.getPrice();// increase money in market
            // we add new client
            //      addClient(client); !!!!!!!!! QUETION ABOUT CLIENT
            System.out.print(" bought ");
            System.out.print(product.getName());
            System.out.println();
            return;
        }

        if (client.getProductCount() == 0) {     // nothing bought

            System.out.print("-nothing bought ");
            System.out.println();
            return;
        }
        // can not afford it
        // no money to buy(  Get out of here(Пръждосвай се!) you have no money no respect(hypocrisy)-> that's the policy of market
        System.out.println(" can't afford it ");
        System.out.print(product.getName());
        System.out.println();
        return;// looser adios!!!

    }


    // negative price on product we can't buy
    boolean isNegativeBalance(Product product) {
        //price is negative we can't sell this product we make gift
        return (product.getPrice() < 0);
    }

    // when buy we have new client in market
    private static boolean addClient(Person person) {
        if (countClient >= clients.length) {
            // many soul ( can't afford it to take more souls- just joke)
            return false;
        }
        //add to client(add misguided soul-joketrue)
        clients[countClient++] = person;
        return true;
    }


    // add product to owr market to know what have in owr market

    public void addProductInMarket(Product newProduct) {

        if (availableProdCount >= availableProducts.length) {
            // we have enough stock
            System.out.println("no place to keeping");
            return;
        }
        // give more and moOReEEEEE...- >https://www.youtube.com/watch?v=V-rS174AUT0
        availableProducts[availableProdCount++] = newProduct;

    }
//!!!!!!!! let's PARTY BEGiNNNNNNNNNNNN(shopping to the end of money(empty pockets)!!!!!!

    public static void main(String[] args) {

        Market market = new Market(200, 500);// client =200, product=500
        Scanner sc = new Scanner(System.in);
        while (true) {


            System.out.println("enter client in format//<име_продукт1>=<цена1>;<име_продукт2>=<цена2>; .... ;<име_продуктM>=<ценаM>\n");

            String command = sc.nextLine();
            String[] data = command.split(";");
            // take data for client
            takeCharacterics(data, person);


            System.out.println("enter product in format// <име> <име_продукт>");
            command = sc.nextLine();
            data = command.split(";");
            // take data for product
            takeCharacterics(data, goods);

            break;
        }
        // commands to buy
        System.out.println();
        System.out.println("enter name Person to buy");
        String name = sc.nextLine();
        while (!name.equals("END")) {

            switch (name) {
                case "END":
                    //    print client purchase from market

                    break;
                default:
                    System.out.println("enter name product");
                    String prodName = sc.nextLine();
                    market.findGoods(name, prodName);

            }
            System.out.println("enter name client and name product to buy");
            name = sc.nextLine();
        }
        printMarketPruchase();

    }

    private void findGoods(String name, String prodName) {
        Product product = null;
        Person person = null;

        // search for product
        for (int i = 0; i < countProduct; i++) {

            if (availableProducts[i].getName().equals(prodName)) {
                //found it
                product = availableProducts[i];
                break;
            }
        }
        // search for client
        for (int i = 0; i < countClient; i++) {

            if (clients[i].getName().equals(name)) {
                // found it
                person = clients[i];
                break;
            }
        }
        // make purchase
        if (person == null || product == null) {
            if (person == null) {
                System.out.println("No client in data base");
            }
            if (product == null) {
                System.out.println("No client in data base");
            }

            return;
        }
        buyProducInMarket(person, product);

    }

    // take argument from to make person and product
    private static void takeCharacterics(String[] data, int indx) {

        for (int i = 0; i < data.length; i++) {

            String money = "";
            String name = "";
            //take money
            int idx = 0;// storage curent i
            int lastIdx = data[i].length();// take size current array
            lastIdx--;
            while (true) {// take last indx (to escape from exeption out of array boundarry)

                if (data[i].charAt(lastIdx) == '=' || data[i].charAt(idx) == '\0')
                    break;
                money += data[i].charAt(lastIdx);

                lastIdx--;
            }
            String reverse = new StringBuffer(money).reverse().toString();// to take digit in money value
            money = reverse;

            // take name
            int sizeName = data[i].length();

            while (true) {// take last indx

                if (data[i].charAt(idx) == '=' || data[i].charAt(idx) == '\0')
                    break;
                name += data[i].charAt(idx);
                idx++;
            }
            // make person
            if (indx == person) {
                addNewCLient(name, money);// add available people in magazine

                //  make product
            } else {
                addNewProduct(name, money);// add available goods in magazine
            }
        }


    }

    // register product
    private static void addNewProduct(String name, String money) {
        double price = Double.parseDouble(money);

        Product product = new Product(name, price);
        availableProducts[countProduct++] = product;

    }


    // register client
    private static void addNewCLient(String name, String balance) {
        double money = Double.parseDouble(balance);

        Person person = new Person(name, money);

        clients[countClient++] = person;
    }

    // product bought
    private static void printMarketPruchase() {
        for (Person pr : clients) {
            if (pr == null) {
                return;
            }

            System.out.print(pr.getName() + "-");
            if (pr.getProductCount() == 0) {
                System.out.print("nothing bought");
            }
            for (int i = 0; i < pr.getProductCount(); i++) {
                {
                    if (i < pr.getProductCount()-1) {
                        System.out.print(pr.getBasketProduct()[i].getName() + ",");
                    } else {
                        System.out.print(pr.getBasketProduct()[i].getName());
                    }
                }
            }
            System.out.println();
        }


    }

}


