import java.util.Scanner;

public class Task1e_IsPrime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean isPrime = true;

        for(int i = 2; 2 * i < n; i++) {
            if(n % i == 0){
                isPrime = false;
            }
        }

        System.out.println(isPrime);
    }
}
