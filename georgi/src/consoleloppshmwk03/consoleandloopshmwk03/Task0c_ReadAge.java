package consoleloppshmwk03.consoleandloopshmwk03;

import java.util.Scanner;

public class Task0c_ReadAge {
    public static void main(String[] args) {
        // c) ReadAgeHuman
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Age");
        int age = sc.nextInt();// read integer num and  check if it can be a humans years
        // human years can be between (1 to 150)
        byte ageMin = 0;
        byte ageMax = 127;

        if (age > ageMin && age < ageMax) {
            System.out.println("The Human age are valid " + age);
            if (age>=18){
                System.out.println("The human is adult and his age are "+age);
            }else {
                System.out.println("The human is not adult, his age are"+age);
            }
        } else {
            System.out.println("Input is not valid human age = " + age);
        }

    }
}
