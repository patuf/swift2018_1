package hmw09.Exercise.exerciseownexception;

import java.util.Random;
import java.util.Scanner;

public class DemoValidateInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        try {
            System.out.println("enter name");
            if (rnd.nextBoolean()) {
                Person person = new Person(null);
            } else {
                Person person = new Person("");
            }

        } catch (ValidateInputException ex) {
            System.out.println("I handel whit this error!");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
