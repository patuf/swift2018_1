import java.util.Scanner;

public class Task4d_SumOfNumbersInString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String digits = "";
        int num = 0;
        int sum = 0;

        char[] charArray = input.toCharArray();
        int len = charArray.length;


        for (int i = 0; i < len; i++) {
            if (Character.isDigit(charArray[i])){
                digits += charArray[i];
            }
            else {
                if (digits != "") {
                    num = Integer.parseInt(digits);
                    sum += num;
                    digits = "";
                }
            }

            if (i == len - 1){
                if (digits != "") {
                    num = Integer.parseInt(digits);
                    sum += num;
                }
            }
        }

        System.out.println(sum);
    }
}
