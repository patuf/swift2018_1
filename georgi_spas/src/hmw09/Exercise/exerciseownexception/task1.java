package hmw09.Exercise.exerciseownexception;

import java.util.Scanner;

public class task1 {
    /*
        InputMismatchException - if the next token does not match the Float regular expression, or is out of range
        NoSuchElementException - if the input is exhausted
        IllegalStateException - if this scanner is closed

        */
    public static void main(String[] args) {

        System.out.println("enter double number");
        int x = 1;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                double a = sc.nextDouble();
                x = 0;
            } catch ( Exception ex){
                System.out.println("invalid input symbol. Use float numbers.");

            }

        } while (x == 1);
        System.out.println("succes");
    }


}
