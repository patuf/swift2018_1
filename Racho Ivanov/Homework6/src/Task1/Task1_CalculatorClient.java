package Task1;

import java.util.Scanner;

public class Task1_CalculatorClient
{
    public static void main(String[] args)
    {
        Scanner scr = new Scanner(System.in);
        String[] input = scr.nextLine().split(" ");
        float a = Float.parseFloat(input[1]);
        float b = Float.parseFloat(input[2]);

        onLoad:
        while (true)
        switch (input[0].toLowerCase())
        {
            case "sum":
                System.out.println(Calculator.sum(a,b));
                break;
            case "sub":
                System.out.println(Calculator.subtract(a,b));
                break;
            case "mul":
                System.out.println(Calculator.multiply(a,b));
                break;
            case "div":
                System.out.println(Calculator.divide(a,b));
                break;
            case "per":
                System.out.println(Calculator.percentage(a,b));
                break;
            case "end":
               break onLoad;
            default:
                System.out.println("Error i n input");
                break;
        }
    }
}
