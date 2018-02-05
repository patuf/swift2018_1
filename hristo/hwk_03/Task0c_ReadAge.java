import java.util.Scanner;

public class Task0c_ReadAge {

    public static void main(String [] args){

        Scanner age = new Scanner(System.in);

        int a = age.nextInt();


        if (a<18) {
            System.out.println("Nepalnoleten");

        }else {
            System.out.println("Palnoleten");

        }

    }


}
