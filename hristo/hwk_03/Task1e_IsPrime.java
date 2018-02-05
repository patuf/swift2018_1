import java.util.Scanner;

public class Task1e_IsPrime {

    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        boolean isPrime=true;

        int i=2;
        while(i<= num/2)
        {
            if(num % i == 0)
            {
                isPrime = false;
                break;
            }
            i++;
    }
        if(isPrime)
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + " is not a Prime Number");

    }
}
