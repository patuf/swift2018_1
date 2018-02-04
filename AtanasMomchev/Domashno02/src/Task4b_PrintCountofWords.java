import java.util.Scanner;

public class Task4b_PrintCountofWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("I will tell how much words you have given me: ");
        String sentance = input.nextLine();
        int sum=0;//counter for the words
        if(sentance.length()>1) sum=1;//if sentence is longer then 2 probably at least 1 word
        //loop to go through the string
        for(int i=0;i<sentance.length();i++){
            char lookingForSpace = sentance.charAt(i);
            if(lookingForSpace == ' ') sum++;
        }
        System.out.printf("You wrote me %d words",sum);
    }
}
