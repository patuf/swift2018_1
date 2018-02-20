package com.swift.academy.homework06.task1;

import com.swift.academy.homework06.task1.Calculator;

import java.util.Scanner;

public class Task1_CalculatorClient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculator calc = new Calculator();
        while (true) {
            String op = sc.next();
            if (op.equalsIgnoreCase("END")) {
                System.out.println("Bye!");
                break;
            }
            double a = sc.nextDouble();
            double b = sc.nextDouble();

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
                    break;
                default:
                    System.out.println("Unrecognised command!");
                    break;
            }
        }
    }
}
