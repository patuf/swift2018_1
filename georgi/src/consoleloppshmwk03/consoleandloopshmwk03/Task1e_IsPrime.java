package consoleloppshmwk03.consoleandloopshmwk03;

import java.util.Scanner;

public class Task1e_IsPrime {
    public static void main(String[] args) {

        /////////////////  e)  Task1e_IsPrime  ///////////////////////
        Scanner sc =new Scanner(System.in);
        System.out.println("enter num");
        int primeNum = sc.nextInt();
        boolean isPrime = true;

        if (primeNum <= 0) {// check for negative numbers
            if (primeNum < 0) {
                System.out.println("prime numberss are bigger than zero");
            }
            isPrime = false;
        }
        // check is number prime
        for (int divider = 2; divider < primeNum; divider++) {// divide= 2 first priem number
            if (primeNum % divider == 0) {// search if number
                isPrime = false;
                break;
            }
        }

        System.out.println("Number " + primeNum + " is " + isPrime);// print result
    }
}
