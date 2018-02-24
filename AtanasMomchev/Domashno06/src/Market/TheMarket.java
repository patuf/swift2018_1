package Market;

public class TheMarket {
    private Product [] products = new Product[500];
    private int productCounter = 0;
    private Person [] people = new Person[200];
    private int peopleCounter = 0;
    //adding people to the people array
    public void addPeople(String people){
        String [] pple = people.split(";");
        for(String part : pple){
          String [] personAndBalance = part.split("=");
          if(personAndBalance[0].isEmpty()){
              System.out.println("Name can't be empty!");
              System.exit(1);
          }
          this.people[peopleCounter]=new Person();
          this.people[peopleCounter].setName(personAndBalance[0]);
          double balance  = Double.parseDouble(personAndBalance[1]);
          if(balance < 0){
              System.out.println("Balance can't be negative!!");
              System.exit(1);
          }
          this.people[peopleCounter++].setBalance(balance);
        }
    }
    //adding product to the products array
    public void addProducts(String products){
            String [] pdc = products.split(";");
            for (String part : pdc){
            String [] productAndPrice = part.split("=");
            if(productAndPrice[0].isEmpty()){
                System.out.println("Name cant be empty!");
                System.exit(1);
            }
            this.products[productCounter] = new Product();
            this.products[productCounter].setName(productAndPrice[0]);
            double price = Double.parseDouble(productAndPrice[1]);
            if(price <0){
                System.out.println("Price can't be lower then 0!!");
                System.exit(1);
            }
            this.products[productCounter++].setPrice(price);
        }
    }
    //shoping for products
    public void shopping(String name, String productName){
        //check if we have that person in the array
        if(indexOfPerson(name) == -1){
            System.out.println("Cant fight you in the data base :O, are you real ? Matrix ?");
            System.exit(1);
        }
        //check if we have the product in the array
        if(indexOfProduct(productName) == -1){
            System.out.println("Where did you find that!?");
            System.exit(1);
        }
        Person person = people[indexOfPerson(name)];
        Product product = products[indexOfProduct(productName)];
        //check if person has enought money to buy
        if(person.getBalance() > product.getPrice()){
           person.setBalance(person.getBalance()-product.getPrice());
           person.addProduct(productName);
            System.out.printf("%s bought %s %n",person.getName(),product.getName());

        }else System.out.printf("%s can't afford %s %n",person.getName(),product.getName());
    }
    //print the products that a person has bought
    public void personProducts(){
        for(int i=0;i<peopleCounter;i++){
            System.out.print(people[i].getName()+ " - ");
            for(int j=0;j <= people[i].getProductCounter();j++) {
                if(people[i].getProductCounter() == 0){
                        System.out.print("bought nothing");
                        break;
                }
                System.out.print(people[i].products[j].getName() + " ");
            }
            System.out.println();
        }
    }

    private int indexOfPerson (String name){
        for(int i=0; i < peopleCounter;i++){
            if(people[i].getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
    private int indexOfProduct (String name){
        for (int i=0; i<productCounter;i++){
            if(products[i].getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
}
