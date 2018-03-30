import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task6_WordReplacement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int numberOfPairs = Integer.parseInt(sc.nextLine());
        String[] split = input.split(" ");
        String[] namesSplit = null;
        Map<String, String> names = new HashMap<>();
        String pairsOfNames;

        for (int i = 0; i < numberOfPairs; i++) {
            System.out.println(i);
            pairsOfNames = sc.nextLine();
            namesSplit = pairsOfNames.split(" ");
            names.put(namesSplit[0], namesSplit[1]);
        }

        for (int i = 0; i < split.length; i++) {
            split[i] = split[i].toLowerCase();
        }

        for (int i = 0; i < split.length; i++) {
            String value = names.get(split[i]);
            if (value != null) {
                split[i] = value;
            }
        }
        System.out.println(Arrays.toString(split));
    }
}
