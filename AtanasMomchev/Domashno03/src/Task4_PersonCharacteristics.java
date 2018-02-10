import java.util.Arrays;
import java.util.Scanner;

public class Task4_PersonCharacteristics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many characteristic's will you make? -");
        int number = input.nextInt();
        //checking for input data
        while (true){
            if (number<0){
                System.err.print("Must input positive number. Input now: ");
                number =input.nextInt();
            }else break;
        }
        input.nextLine();
        //loop for characters
        for(int i=0; i<number;i++) {
            System.out.println("Input sequence: ");
            String data = input.nextLine();
            //inputting the string in array
            String [] dataArray = data.split(";");
            //different data inputs
            String firstName = dataArray[0];
            String lastName = dataArray[1];
            String g = dataArray[2];
            char gender = g.charAt(0);
            int birthYear = Integer.parseInt(dataArray[3]);
            double weight = Integer.parseInt(dataArray[4]);
            int height = Integer.parseInt(dataArray[5]);
            String job = dataArray[6];
            String [] copy = Arrays.copyOfRange(dataArray,7,11);
            double[] marks = new double[4];
            int sum =0;
            //inputting marks in array
            for(int j=0;j<marks.length;j++){
                marks[j]= Double.parseDouble(copy[j]);
                sum += marks[j];
            }
            double average = sum / marks.length;
            int currentYera = 2018;
            //calculating how old is the person
            int age = currentYera - birthYear;
            //creating he or she and his or her
            String heOrShe = ((gender == 'm') ? "he" : "she");
            String hisOrHer = ((gender == 'm') ? "His" : "Her");
            String HeorShe = ((gender == 'm') ? "He" : "She");
            System.out.printf("%s %s is %d years old.%s was born in %d. %s weight is %.2f and %s is %d cm tall." +
                            "%n%s is a %s with average grade %.2f.%n"
                    , firstName, lastName, age, HeorShe, birthYear,hisOrHer, weight, heOrShe, height, HeorShe, job,average);
            //funny if statement for age
            if (age < 10) {
                System.out.format("%n %s %s is almost a baby O_O !!!", firstName, lastName);
            } else if (age < 18) {
                System.out.format("%n%s %s is under aged!", firstName, lastName);
            } else if (age > 120) {
                System.out.format("%n%s %s is a immortal!!", firstName, lastName);
            } else if (age > 80) {
                System.out.format("%n%s %s is a bit old.", firstName, lastName);
            } else
                System.out.format("%n%s %s is adult", firstName, lastName);
        }
    }
}
