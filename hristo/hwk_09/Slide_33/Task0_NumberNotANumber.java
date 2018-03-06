package swift2018_1.hristo.hwk_09.Slide_33;

import java.util.Scanner;

public class Task0_NumberNotANumber {

    public static void main(String[] args) {

        String isNumber = " ";
        int num;
        final String end = "END";

        Scanner sc = new Scanner(System.in);


        while (!isNumber.equals(end)){

            isNumber = sc.nextLine();

        try {
            num = Integer.parseInt(isNumber);
            System.out.println("Number");
        }
        catch (NumberFormatException exception){
            System.out.println("Not a number");
        }

        }

     }

}
