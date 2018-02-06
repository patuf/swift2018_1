package homework.consoleandloopsHmwk03;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);





        // next time make conversre to hexa convertion(no time to do it)
        /////////////////  Task1f_ToBinaryAndHexa  ///////////////////////

        System.out.println("enter num to convert");
        int inputNum = sc.nextInt();
        String bynaryNum = "";
        int countRest = 0;
        // convert to bynary
        while (inputNum != 0) {
            int reversenum = inputNum % 2;// take rest
            countRest++;
            inputNum = inputNum / 2;// take whole part of num


            String reverse = new StringBuffer(bynaryNum).reverse().toString();
            System.out.println(reverse);

        }

    }
}
