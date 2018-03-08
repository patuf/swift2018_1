package hmw09.Exercise.taskks;

import java.util.Scanner;

public class Tasko0_NumberNotANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String number;

        whilebreak:
        while (true) {
            System.out.println("enter number");
            number = sc.next();
            switch (number) {
                case "END":
                    System.out.println("OFF!");
                    break whilebreak;
                default:
                    try {
                        int num = Integer.parseInt(number);
                    } catch (NumberFormatException ex) {
                        System.out.println("Not a Number");
                        continue ;
                    }
                    System.out.println("number");
                    break;

            }
        }
    }
}
