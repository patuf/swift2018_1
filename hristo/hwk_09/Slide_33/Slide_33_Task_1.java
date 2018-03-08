package swift2018_1.hristo.hwk_09.Slide_33;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Slide_33_Task_1 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        float f;

        boolean error;

        do {error = false;

            try {
                f = sc.nextFloat();
            } catch (InputMismatchException exeption) {
                System.out.println("Input the correct value");
                sc.nextLine();
                error = true;
            }
        }while (error);
        System.out.println("finally you input the correct number format");


    }
}