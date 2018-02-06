import java.util.Scanner;

public class Task2h_PrintOddFrequencyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int zeroes = 0;
        int ones = 0;
        int twos = 0;
        int threes = 0;
        int fours = 0;
        int fives = 0;
        int sixes = 0;
        int sevens = 0;
        int eights = 0;
        int nines = 0;

        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case 0:
                    zeroes++;
                    break;
                case 1:
                    ones++;
                    break;
                case 2:
                    twos++;
                    break;
                case 3:
                    threes++;
                    break;
                case 4:
                    fours++;
                    break;
                case 5:
                    fives++;
                    break;
                case 6:
                    sixes++;
                    break;
                case 7:
                    sevens++;
                    break;
                case 8:
                    eights++;
                    break;
                case 9:
                    nines++;
                    break;
            }
        }
        int[] numbersArr = {zeroes, ones, twos, threes, fours, fives, sixes,
                sevens, eights, nines};

        for (int i = 0; i < numbersArr.length; i++) {
            if (numbersArr[i] % 2 != 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
