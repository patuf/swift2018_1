package hmw09.Exercise.taskks;

import java.util.Scanner;
import java.util.SortedMap;

public class Task1_SumNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        double a = sc.nextDouble();
        System.out.println("Enter number");
        double b = sc.nextDouble();

        try {
            System.out.println(readTwoNumbers(a, b));
        } catch (Exception e) {

        }

    }

    static double readTwoNumbers(double numOne, double numTwo) throws Exception {
        if (numOne == numTwo) {
            System.out.println("Numbers can't be equal!");
            throw new Exception();
        } else if (numOne < 0 || numTwo < 0) {
            System.out.println("Numbers can't be negative!");
            throw new Exception();
        } else {
            return numOne + numTwo;
        }


    }
}
