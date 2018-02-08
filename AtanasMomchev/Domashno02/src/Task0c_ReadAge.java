import java.util.Scanner;

public class Task0c_ReadAge {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("How old are you son: ");
        int age = input.nextInt();
        //using the if statement to check if he is below 18
        if( age <18){
            System.out.println("Hear is some money for school.");
        }else
            System.out.println("Get a job !");
    }
}
