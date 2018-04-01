
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

    public static void main(String[] args) {

        String[] inputs = {
            "+359 897 123456",
            "They are students but we are learning Java",
            "Jan d1987 432423 42 432 42342"
        };

        String[] patterns = {
            "(\\+\\d{1,3})",
            "(?<=we\\sare\\s).*",
            "(\\w+ (\\d.*))"
        };

        for (int i = 0; i < inputs.length; i++) {
            System.out.printf("Looking for \"%s\" in \"%s\"%n", patterns[i], inputs[i]);
            printAllRegexMatches(inputs[i], patterns[i]);
            System.out.println();
        }
    }

    private static void printAllRegexMatches(String input, String pattern) {
        Pattern regex = Pattern.compile(pattern);

        Matcher matcher = regex.matcher(input);

        while (matcher.find()) {
            System.out.printf("Found match [%s] at index [%d]%n", 
                    matcher.group(), matcher.start());
        }
    }

}
