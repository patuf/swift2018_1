import java.util.Scanner;

public class Task4d_SumOfNumbersInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("If you give me any numbers i will ad them: ");
        String sentence = input.nextLine();
        String num ="";
        int sum = 0;
        //loop to go trough the string
        for(int i=0; i<sentence.length();i++){
            //if statement to check if character is digit
            if(Character.isDigit(sentence.charAt(i))) {
                num += sentence.charAt(i);
                //loop to check if character after the first digit is digit again then add it to the first
                for (int j = i + 1; j < sentence.length(); j++) {
                    if (Character.isDigit(sentence.charAt(j))) {
                        num += sentence.charAt(j);
                    }else
                    break;
                }
                //parsing the num to int and adding it to sum
                int n = Integer.parseInt(num);
                sum+= n;
            }
            //setting the num to empty again
            num = "";
        }
        System.out.printf("The sum of your numbers is %d",sum);
    }
}