import java.util.Scanner;
import java.util.stream.IntStream;

public class Task2d_PrintSplitIndex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int chisla[] = new int[n];
        System.out.println("enter numbers");
        for (i = 0; i < n; i++) {
            chisla[i] = sc.nextInt();
        }
        int sum = IntStream.of(chisla).sum();
        int count = -1;
        int half = 0 ;
        if (sum%2 ==0){
            for (i=0; i<n; i++) {
                half += chisla[i];
                count++;

                if (half == sum / 2) {
                    System.out.println(count);
                    break;
                } else {
                    if (half<sum/2){
                        continue;
                    }else {
                        System.out.println("NO");
                    }

                }
            }

        }else {
            System.out.println("NO");
        }
    }
    }
