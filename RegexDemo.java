
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexDemo {
    public static void main(String[] args) {

        // Pattern Example
        System.out.println("Pattern Example:");

        System.out.println(Pattern.matches("Daffodil.*",
                "Daffodil Int University"));

        System.out.println(Pattern.matches("Daffodil[0-9]+",
                "Daffodil University12"));


        // Matcher Example
        System.out.println("\nMatcher Example:");

        Pattern p = Pattern.compile("daffodil");
        Matcher m = p.matcher("daffodil.ac");

        while (m.find()) {
            System.out.println("Pattern found from "
                    + m.start() + " to " + (m.end() - 1));
        }


        // Character Class
        System.out.println("\nCharacter Class:");

        System.out.println(Pattern.matches("[a-z]", "g"));

        System.out.println(Pattern.matches("[a-zA-Z]", "Gfg"));


        // Quantifier Example
        System.out.println("\nQuantifier Example:");

        System.out.println(Pattern.matches("\\d{4}", "1234"));

        System.out.println(Pattern.matches("\\d{4}", "123"));

        System.out.println(Pattern.matches("[a-z]+", "hello"));

        System.out.println(Pattern.matches("[a-z]+", ""));

        System.out.println(Pattern.matches("a*", "aaaa"));


        // Common Regex
        System.out.println("\nCommon Regex:");

        System.out.println(Pattern.matches("\\d+", "1234"));

        System.out.println(Pattern.matches("\\D+", "1234"));

        System.out.println(Pattern.matches("\\D+", "Gfg"));

        System.out.println(Pattern.matches("\\S+", "gfg"));
    }
}