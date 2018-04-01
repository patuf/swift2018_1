
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

    public static void main(String[] args) {

        String[] inputs = {
            "a123 4 12 as351aa",
            "a123 4 12 as351aa",
            "a123 4 12 as351aa",
            "a123 4 12 as351aa",
        };

        String[] patterns = {
            "\\d{2,3}",
            "\\w+",
            "123?",
            "3\\D*\\d"
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
            System.out.printf("Found match [%s] at index [%d]%n", matcher.group(), matcher.start());
        }
    }

}
