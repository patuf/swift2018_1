package CredentialManager;

import java.util.Scanner;

public class MainCredentials {
    public static void main(String[] args) {
        Credentials c = new Credentials();
        Scanner input = new Scanner(System.in);
        System.out.println("Input commands now: ");
        c.fillArrays();
        int i=0;//used to go to next position in array
        while (true){
            //string to keep command
            String str = input.next();
            if(str.equals("END")) break;
            //check which command is inputed
            if(str.equals("ENROLL")){
                c.ENROLL(input.next(),input.next(),i);
                i++;
            }else if(str.equals("CHPASS")){
                c.CHPASS(input.next(),input.next(),input.next());
            }else if(str.equals("AUTH")) {
                c.AUTH(input.next(), input.next());
            }
        }
    }
}
