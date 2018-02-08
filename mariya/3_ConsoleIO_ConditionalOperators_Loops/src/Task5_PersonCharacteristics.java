import java.util.Scanner;
import java.util.Locale;

public class Task5_PersonCharacteristics {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++){
            String firstName = sc.nextLine();
            String lastName = sc.nextLine();
            short yearOfBirth = sc.nextShort();
            sc.nextLine();
            double weight = sc.nextDouble();
            sc.nextLine();
            short height = sc.nextShort();
            sc.nextLine();
            String job = sc.nextLine();

            final short CURRENT_YEAR = 2018;
            int age = CURRENT_YEAR - yearOfBirth;

            String message = firstName + " " + lastName + " is " + age + " years old. His weight is " + weight + " and he is " + height + " cm tall. He is a " + job + ".";
            if (age <= 18){
                message += " " + firstName + " " + lastName + " is under-aged.";
            }
            System.out.println(message);
        }
    }
}
