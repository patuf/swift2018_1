import java.util.Scanner;

public class Task1_CalculatorClient {
    public static void main(String[] args) {

        Calculator Calc = new Calculator();
        boolean done = true;
        Scanner in = new Scanner(System.in);


        System.out.println("===========================> INITIALIZING CALCULATOR <===========================");
        System.out.print("");
        System.out.println("Welcome to Spiro's Basic Java Calculator for Swift Academy Homework number 6");
        System.out.print("");
        System.out.println("=================================================================================");
        System.out.print("");
        System.out.print("Please enter the number of calculations that will be performed: ");
        System.out.print("");

        int i = in.nextInt();
        int[] counter = new int[i];

        System.out.println("=================================================================================");
        System.out.print("");
        System.out.println("Thank you!");
        System.out.print("");
        System.out.println("=================================================================================");
        System.out.print("");
        System.out.println("Please first enter the OPERATION (SUM/MUL/PER/DIV/SUB)\nFollowed by the two numbers that are to be calculated");
        System.out.print("");
        System.out.println("=================================================================================");
        System.out.print("");
        System.out.print("Awaiting Input: ");


        while (done) {
            for (int n = 0; n < counter.length; n++) {
                counter[n] = i++;
                String input = in.next();

                if (input.equals("END")){
                    in.close();
                    System.out.println("Terminating Calculator!");
                    System.exit(0);

                }

                if (input.contains("SUM")) {
                    double inputA = in.nextInt();
                    double inputB = in.nextInt();
                    Calc.setA(inputA);
                    Calc.setB(inputB);
                    System.out.println(Calc.SUM(Calc.getA(), Calc.getB()));
                }

                if (input.contains("SUB")) {
                    double inputA = in.nextInt();
                    double inputB = in.nextInt();
                    Calc.setA(inputA);
                    Calc.setB(inputB);
                    System.out.println(Calc.SUB(Calc.getA(), Calc.getB()));
                }

                if (input.contains("MUL")) {
                    double inputA = in.nextInt();
                    double inputB = in.nextInt();
                    Calc.setA(inputA);
                    Calc.setB(inputB);
                    System.out.println(Calc.MUL(Calc.getA(), Calc.getB()));
                }

                if (input.contains("DIV")) {
                    double inputA = in.nextInt();
                    double inputB = in.nextInt();
                    Calc.setA(inputA);
                    Calc.setB(inputB);
                    System.out.println(Calc.DIV(Calc.getA(), Calc.getB()));
                }

                if (input.contains("PER")) {
                    double inputA = in.nextInt();
                    double inputB = in.nextInt();
                    Calc.setA(inputA);
                    Calc.setB(inputB);
                    System.out.println(Calc.PER(Calc.getA(), Calc.getB()));
                }

                if(input.equals("END")){
                    in.close();
                    System.exit(0);
                    System.out.println("Terminating Calculator application...");
                }

            }
            System.out.println("===============================================");
            System.out.println("Thank you for using Spiro's simple calculator!");
            System.out.println("-----------------------------------------------");
            System.out.println("Have a nice day!");
            System.out.println("===============================================");
        }
    }
}
