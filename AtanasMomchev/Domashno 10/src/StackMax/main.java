package StackMax;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stek stek = new Stek();

        System.out.println("Input commands: ");
        end:
        while (true){
            String str = input.next();
            str = str.toUpperCase();
            switch (str){
                case ("END"):
                    System.out.println("Goodbye!"); break end;
                case ("PUSH"):
                    stek.push(input.nextInt()); break ;
                case ("POP"):
                    System.out.println(stek.getLastNumber());
                        stek.pop();
                    break ;
                case ("MAX"):
                    System.out.println(stek.max()); break ;
                default:
                    System.out.println("No such command!");
            }
        }
        System.out.println(stek.getStack());
    }
}
