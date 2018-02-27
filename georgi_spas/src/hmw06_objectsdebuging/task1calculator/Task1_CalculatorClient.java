package hmw06_objectsdebuging.task1calculator;

import hmw06_objectsdebuging.task1calculator.Calculator;

import java.util.Scanner;

public class Task1_CalculatorClient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // instance( calculator on)
        Calculator calc = new Calculator();
        System.out.println("Calculator On");
        System.out.println("Calculator off whit operation-> END ");

        // auto example demo
        String[] operations = {"SUM", "MUL", "PER","DIV","SUB","SUN","END"};// iterate commands
        int opCount = 0;
        float[] nums = {3f, 8f, 3f, 8f, 9f, 5.4f,24f,6.5f,5.4f,11.222f,0f,0f};// iterate numbers
        int numCount = 0;

        while (true) {

            System.out.print("enter operation:");
            System.out.println("enter operation from list");
            // TODO  loop to write commands


            String op = operations[opCount++];
            double a = nums[numCount];
            double b = nums[numCount + 1];
            numCount++;

            if (op.equals("END"))
            {
                System.out.println("Calculator OFF");
                break;
            }

            switch (op) {
                case "SUM":
                    System.out.printf("%.3f%n", calc.sum(a, b));
                    break;
                case "SUB":
                    System.out.printf("%.3f%n", calc.subtract(a, b));
                    break;
                case "MUL":
                    System.out.printf("%.3f%n", calc.multiply(a, b));
                    break;
                case "DIV":
                    System.out.printf("%.3f%n", calc.divide(a, b));
                    break;
                case "PER":
                    System.out.printf("%.3f%n", calc.percentage(a, b));
                default:
                    System.out.println("Unrecognised command!");
                    break;
            }


        }

    }
}



