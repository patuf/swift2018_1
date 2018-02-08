package homework.ArraysStringHmwk04;

import com.sun.deploy.util.SyncAccess;

import java.util.Scanner;

public class Task3a_IsPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter text or numbers to check is palnidrome");
        String palindrom=sc.nextLine();
        int length=palindrom.length();
        boolean isPalindrom=true;
        for (int i = 0; i <length; i++) {
            if ((char)palindrom.charAt(i)!=(char)palindrom.charAt((length-1)-i)) {
                isPalindrom=false;
                break;
            }
        }
        if (isPalindrom) {
            System.out.println("The string is palindrom "+isPalindrom);

        }else{
            System.out.println("The string is palindrom "+isPalindrom);
        }


    }
}
