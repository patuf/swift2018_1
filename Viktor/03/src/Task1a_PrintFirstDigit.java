import java.util.Scanner;

public class Task1a_PrintFirstDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, temp = 0;
        System.out.println("Enter the number:");
        n = sc.nextInt();
        while( n != 0 )
        {
            n = n/10;
            if(n==0)
            {
                break;
            }
            else
            {
                temp = n;
            }
        }
        System.out.println(temp);
    }
}
