import java.util.Scanner;

public class Task4d_SumOfNumbersInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("If you give me any numbers i will ad them: ");
        String sentence = input.nextLine();
        String num ="";
        int sum = 0;
        for(int i=0; i<sentence.length();i++){
            if(Character.isDigit(sentence.charAt(i))) {
                num += sentence.charAt(i);
                for (int j = i + 1; j < sentence.length(); j++) {
                    if (Character.isDigit(sentence.charAt(j))) {
                        num += sentence.charAt(j);
                    }
                    break;
                }
                int n = Integer.parseInt(num);
                sum+= n;
            }
            num = "";
        }
        System.out.printf("The sum of your numbers is %d",sum);
    }
}