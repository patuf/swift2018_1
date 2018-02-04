import java.util.Scanner;

public class Task4c_PrintEverySentance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Let me separate the sentences for you: ");
        String sentence = input.nextLine();
        String newSentence = "";
        //looping trough the sentence
        for(int i=0;i<sentence.length();i++){
            //imputing every char here
            char lookingForEnd = sentence.charAt(i);
            //making new sentence
            newSentence += lookingForEnd;
            //checking if the char is ending the sentence
            if(lookingForEnd =='.'||lookingForEnd=='!'||lookingForEnd=='?'){
                newSentence.trim(); // trim does not work for some reason :D
                System.out.println(newSentence);
                newSentence = "";
                //if its the end of the string still print out whats left
            }else if(i== sentence.length()-1) {
                newSentence.trim();
                System.out.println(newSentence);
            }
        }
    }
}
