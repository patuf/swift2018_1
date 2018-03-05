package SumNumber;

import java.util.Scanner;

public class main {
    public static void main(String[] args) throws MyException{
        Scanner input = new Scanner(System.in);
        Method m = new Method();
        System.out.println("Input numbers: ");
        try {
            System.out.println(m.sum(input.nextDouble(),input.nextDouble()));
        }catch (MyException e){
            System.out.println(e);
        }
    }
}
