package Task2;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CredentialsManager
{
    public static void main(String[] args)
    {
        // Toлкова съм уверен, че е супер че няма да я пусна да я пробвам дали работи.
        Scanner scn = new Scanner(System.in);

        LinkedList<Credentials> accounts = new LinkedList<Credentials>();

        run:
        do
        {
            String command;
            String[] input;
            boolean isSuccessful = true;
            Credentials temp;

            System.out.println();
            System.out.println();
            System.out.println("Enter command, enter Help if you don't know commands :");
            command = scn.next().toLowerCase();
            switch (command)
            {
                case "ENROLL":
                    input = usualInput();
                    accounts.add(new Credentials(input[0], input[1]));
                    isSuccessful = true;
                    break;
                case "CHPASS":
                    input = usualInput();
                    temp = accounts.get(accountIdx(new Credentials(input[0], input[1]), accounts));
                    System.out.println("Enter new password : ");
                    String newPassword = scn.next();
                    isSuccessful = temp.setPassword(input[1], newPassword);
                    break;
                case "AUTH":
                    input = usualInput();
                    temp = accounts.get(accountIdx(new Credentials(input[0], input[1]), accounts));
                    isSuccessful = temp.getPassword(input[1]);
                    break;
                case "HELP":
                    System.out.println("Command - ENROLL enrols a new user.");
                    System.out.println("Command - CHPASS changes password of selected user.");
                    System.out.println("Command - AUTH checks if password of user matches.");
                    break;
                case "END":
                    System.out.println("Have a nice day");
                    break run;
            }

            if (command != "END" && command != "HELP")
            if (isSuccessful)
                System.out.println(command + "success");
            else
                System.out.println(command + "fail");

        }while(true);
    }

    static private String[] usualInput()
    {
        String name;
        String password;
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter user name : ");
        name = scn.next();
        System.out.println("Enter Password");
        password = scn.next();

        return new String[]{name,password};
    }

    static private int accountIdx(Credentials acc , List<Credentials> accs)
    {
        return accs.indexOf(acc);
    }
}
