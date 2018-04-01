
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

    public static void main(String[] args) {

        String[] inputs = {
            "I have 13 cats and 4 dogs.",
            "18231asd831",
            "#@!#(a)3",
            "#@!#(a)3",
            "I have 3\tcats.",
            "  a b    \t   d",
            "abc 12 #",
            "abc 12 #w",
            "abc 12 #"
        };

        String[] patterns = {
            "\\d",
            "\\D",
            "\\w",
            "\\W",
            "\\s",
            "\\S",
            ".",
            "[atw]",
            "[a-zA-Z]"
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
