package Market;

import java.util.Scanner;

public class mainAgain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TheMarket market = new TheMarket();
        //add people
        System.out.println("Input shoppers :");
        market.addPeople(input.nextLine());
        //add products
        System.out.println("Input the products :");
        market.addProducts(input.nextLine());
        //cycle to for people to shop
        System.out.println("Lets do some shopping :");
        while (true){
            String str = input.nextLine();
            if(str.equals("END")) break;
            String [] pAndP= str.split(" ");
            if(pAndP.length > 2) {
                System.out.println("Enter 1 buyer and 1 product only!!!");
                continue;
            }
          market.shopping(pAndP[0], pAndP[1]);
        }
        //printing what people bought after shopping is finished
        market.personProducts();
    }
}
