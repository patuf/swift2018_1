import java.util.Scanner;
import java.util.Locale;

public class Task1_CalculatorClient {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        String command = "";

        while (!(command.equals("END"))) {

            command = sc.next();
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double result = 0;

            switch (command) {
                case "SUM":
                    result = Calculator.sum(a, b);
                    break;
                case "SUB":
                    result = Calculator.substract(a, b);
                    break;
                case "MUL":
                    result = Calculator.multiply(a, b);
                    break;
                case "DIV":
                    result = Calculator.divide(a, b);
                    break;
                case "PER":
                    result = Calculator.percentage(a, b);
                    break;
                default:
                    continue;
            }
            System.out.printf("%.3f%n", result);
        }
    }
}

