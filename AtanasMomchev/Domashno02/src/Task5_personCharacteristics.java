import java.util.Scanner;

public class Task5_personCharacteristics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many characteristic's will you make? -");
        int number = input.nextInt();
        //checking for input data
        while (true){
            if (number<0){
                System.err.print("Must input positive number. Input now: ");
                number =input.nextInt();
            }else break;
        }
        //creating a cycle for the number of characteristics you want
        while (number > 0) {
            //different inputs
            System.out.print("Imput first name:");
            String firstName = input.next();
            System.out.print("Imput last name:");
            String lastName = input.next();
            System.out.print("What is his/hers birth year :");
            int birthYear = input.nextInt();
            System.out.print("Weight? - ");
            double weight = input.nextDouble();
            //checking for correct input
            while (true){
                if (weight<0){
                    System.err.print("Must input positive number. Input now: ");
                    weight =input.nextDouble();
                }else break;
            }
            System.out.print("Height in cm pls? - ");
            int height = input.nextInt();
            //checking for correct input
            while (true){
                if (height<0){
                    System.err.print("Must input positive number. Input now: ");
                    height = input.nextInt();
                }else break;
            }
            System.out.print("What is her/his proffesion: ");
            input.nextLine();
            String job = input.nextLine();
            //creating int for the current yeaer
            int currentYera = 2018;
            //calculating how old is the person
            int age = currentYera - birthYear;
            System.out.printf("%s %s is %d years old.He was born in %d. His weight is %.2f and he is %d cm tall." +
                    "%nHe is a %s", firstName, lastName, age,birthYear, weight, height, job);
            //funny if statement for age
            if (age < 10) {
                System.out.format("%n %s %s is almost a baby O_O !!!", firstName, lastName);
            } else if (age < 18) {
                System.out.format("%n%s %s is under aged!", firstName, lastName);
            } else if (age > 120) {
                System.out.format("%n%s %s is a vampire", firstName, lastName);
            } else if (age > 80) {
                System.out.format("%n%s %s is a bit old", firstName, lastName);
            } else
                System.out.format("%n%s %s is adult", firstName, lastName);
            //reducing number to go to next iteration
            number--;
        }
        }
    }
