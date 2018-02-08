import java.util.Scanner;
import java.util.Locale;

public class Task4_PersonCharacteristics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);;
        int input = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i <= input; i++) {
            String firstName = sc.nextLine();
            String lastName = sc.nextLine();
            char gender = sc.nextLine().charAt(0);
            short birthYear = sc.nextShort();
            sc.nextLine();
            double weight = sc.nextDouble();
            sc.nextLine();
            short height = sc.nextShort();
            sc.nextLine();
            String job = sc.nextLine();

            double[] marks = new double[4];
            for (int j = 0; j < marks.length; j++) {
                marks[j] = sc.nextDouble();
            }

            double avgMark = (marks[0] + marks[1] + marks[2] + marks[3]) / 4;
            int age = 2017 - birthYear;
            if (gender == 'M' && age < 18) {
                System.out.printf("%s %s is %d years old. He was born in %d. His weight is %.1f and he is %d " +
                                "cm tall. He is a %s with an average grade of %.3f. He is under-aged. %n",
                        firstName, lastName, age, birthYear, weight, height, job, avgMark);
            } else if (gender == 'M' && age >= 18) {
                System.out.printf("%s %s is %d years old. He was born in %d. His weight is %.1f and he is %d " +
                                "cm tall. He is a %s with an average grade of %.3f. %n",
                        firstName, lastName, age, birthYear, weight, height, job, avgMark);
            } else if (gender == 'F' && age < 18) {
                System.out.printf("%s %s is %d years old. She was born in %d. Her weight is %.1f and she is %d " +
                                "cm tall. She is a %s with an average grade of %.3f. She is under-aged. %n",
                        firstName, lastName, age, birthYear, weight, height, job, avgMark);
            } else {
                System.out.printf("%s %s is %d years old. She was born in %d. Her weight is %.1f and she is %d " +
                                "cm tall. She is a %s with an average grade of %.3f. %n",
                        firstName, lastName, age, birthYear, weight, height, job, avgMark);
            }
        }
    }
}
