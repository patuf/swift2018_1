import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1_SumNumber extends Exception {
    public static String SumNumber(int a, int b) {
        if (a == b) {
            throw new ArithmeticException("Values must NOT be equal.");
        }
        if (a < 0 | b < 0) {
            throw new IllegalArgumentException("Only positive values are allowed.");
        }
        int sum = (a + b);
        System.out.println(sum);
        return "";
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        try {
            String[] ints = input.split(" ", 2);
            int a = Integer.parseInt(ints[0]);
            int b = Integer.parseInt(ints[1]);
            SumNumber(a, b);
        } catch (InputMismatchException inEx){
            System.out.println("No values entered.");
        } catch (ArithmeticException ArEx) {
            System.out.println(ArEx.getMessage());
        } catch (NumberFormatException nonumberException) {
            System.out.println("Not a number.");
        } catch (ArrayIndexOutOfBoundsException outofException) {
            System.out.println("Enter exactly only 2 values.");
        } catch (IllegalArgumentException Ex) {
            System.out.println(Ex.getMessage());
        }
    }
}
