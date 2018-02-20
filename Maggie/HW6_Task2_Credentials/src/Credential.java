
import java.util.Scanner;



public class Credential {


    //  public static void main(String[] args) {

    public void AUTH() {


        String Username;

        String Password;


        Password = "123";

        Username = "Magdalena";


        Scanner input1 = new Scanner(System.in);

        System.out.println("Enter Username : ");

        String username = input1.next();


        Scanner input2 = new Scanner(System.in);

        System.out.println("Enter Password : ");

        String password = input2.next();


        if (username.equals(Username) && password.equals(Password)) {


            System.out.println("Access! Welcome!");

        } else if (username.equals(Username)) {

            System.out.println("Fail! Invalid Password!");

        } else if (password.equals(Password)) {

            System.out.println("Fail! Invalid Username!");

        } else {

            System.out.println("Fail! Invalid Username & Password!");

        }

    }


    public void ENROLL() {

        Scanner input3 = new Scanner(System.in);

        Scanner input4 = new Scanner(System.in);


        System.out.println("Please enter your first name: ");

        String firstName = input3.next();

        System.out.println("Your firstName is " + firstName);


        System.out.println("Hello " + firstName + ". " + "What is your password?");

        String password1 = input4.next();

        System.out.println("Your password is " + password1);


    }


    public void CHPASS() {


        String Username1;

        String Password1;


        Password1 = "234";

        Username1 = "Maggie";


        Scanner input1 = new Scanner(System.in);

        System.out.println("Enter Username : ");

        String Username = input1.next();


        Scanner input2 = new Scanner(System.in);

        System.out.println("Enter Password : ");

        String password = input2.next();


        if (Username.equals(Username1) && password.equals(Password1)) {


            System.out.println("Access! Welcome!");

            System.out.println("Now you can change your password!");

            int NewPassword = input2.nextInt();


        } else if (Username.equals(Username1)) {

            System.out.println("Fail! Invalid Password!");

        } else if (password.equals(Password1)) {

            System.out.println("Fail! Invalid Username!");

        }
    }
}