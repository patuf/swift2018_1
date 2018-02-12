package swift2018_1.hristo.hwk_06;

import java.util.Scanner;

public class Task1_CalculatorClient extends Calculator {


        public static void main (String[]args) {

            Scanner sc = new Scanner(System.in);


            String st = new String();
            String end = new String("END");

            Calculator calc = new Calculator();

            while (!st.equals(end)) {


                System.out.println("Въведете име на матетамическата операция: ");
                st = sc.nextLine();

                double a = sc.nextDouble();

                double b = sc.nextDouble();

            switch (st) {


                case "SUM":
                    calc.sum(a, b);
                    System.out.printf("%.3f%n", calc.c);
                    break;

                case "SUB":
                    calc.substract(a, b);
                    System.out.printf("%.3f%n", calc.c);
                    break;


                case "MUL":
                    calc.multiply(a, b);
                    System.out.printf("%.3f%n", calc.c);
                    break;


                case "DIV":
                    calc.divide(a, b);
                    System.out.printf("%.3f%n", calc.c);
                    break;


                case "PER":
                    calc.percentage(a, b);
                    System.out.printf("%.3f%n", calc.c);
                    break;
            }

                sc.nextLine();

        }
        }

}
