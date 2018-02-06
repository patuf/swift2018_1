/*
Задача 5: ProgramCharacteristics
Напишете програма Task5_PersonCharacteristics, като за основа ползвате задачата PersonCharacteristics от предния път.
 Заменете статично заложената информация, с въвеждане от клавиатурата. Проверявайте входните данни и при грешка поискайте повторно въвеждане.
 Добавете проверка дали лицето е непълнолетно. Ако е, допишете към вече изписаното:
<първо име> <последно име> is <години> years old. His weight is <тегло> and he is <височина> cm tall. He is a <професия>.
Съобщението:
<първо име> <последно име> is under-aged.
 Променете програмата, така че отначало да се въвежда число N и после характеристики за N на брой отделни индивиди
 */
import java.util.Calendar;
import java.util.Scanner;

public class Task5_PersonCharacteristics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of people: ");
        int inputNumber = Integer.parseInt(in.nextLine());

        for (; ; ) {
            if (inputNumber < 0) {
                System.err.print("Invalid value! Please, enter positive number: ");
                inputNumber = Integer.parseInt(in.nextLine());
            } else {
                break;
            }
        }
        for (int i = 0; i < inputNumber; i++) {
            System.out.print("Please, enter first name: ");
            String firstName = in.nextLine();
            System.out.print("Please, enter last name: ");
            String lastName = in.nextLine();
            System.out.print("Please, enter birth year: ");
            int birthYear = Integer.parseInt(in.nextLine());
            System.out.printf("Please, enter weight of %s %s in [kg]: ", firstName, lastName);
            double weightValue = Double.parseDouble(in.nextLine());
            while (true) {
                if (weightValue < 0 && weightValue > 220) {
                    System.err.print("Please, enter valid weight: ");
                    weightValue = Double.parseDouble(in.nextLine());
                } else {
                    break;
                }
            }
            System.out.printf("Please, enter height of %s %s in [cm]: ", firstName, lastName);
            double heightValue = Double.parseDouble(in.nextLine());
            while (true) {
                if (heightValue < 0 && heightValue > 270) {
                    System.err.print("Please, enter valid weight: ");
                    heightValue = Integer.parseInt(in.nextLine());
                } else {
                    break;
                }
            }
            System.out.print("Please, enter his/her current position: ");
            String currentPosition = in.nextLine();
            Calendar now = Calendar.getInstance();
            int currentYear = now.get(Calendar.YEAR);
            int ageValue = currentYear - birthYear;
            if (ageValue < 18) {
                System.out.printf("%s %s is %d years old. He/She was born in %d. His/Her weight is %.6f and he/she is %.2f cm tall. He/She is a %s. %s %s is under aged.%n"
                        , firstName, lastName, ageValue, birthYear, weightValue, heightValue, currentPosition, firstName, lastName);

            } else {
                System.out.printf("%s %s is %d years old. He/She was born in %d. His/Her weight is %.6f and he/she is %.2f cm tall. He/She is a %s.%n"
                        , firstName, lastName, ageValue, birthYear, weightValue, heightValue, currentPosition);
            }
        }
    }
}
