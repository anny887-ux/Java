import java.util.*;

public class Homework2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of lines: ");
        int n = sc.nextInt();
        sc.nextLine();

        String text = "";

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter line " + i + ": ");
            text = text + sc.nextLine() + " ";
        }

        String[] words = text.trim().split("\\s+");

        int repeated = 0;

        for (int i = 0; i < words.length; i++) {
            int count = 0;

            for (int j = 0; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    count++;
                }
            }

            if (count > 1) {
                repeated++;
            }
        }

        int vowels = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = Character.toLowerCase(text.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
            }
        }

        System.out.println();
        System.out.println("Number of lines: " + n);
        System.out.println("Number of words: " + words.length);
        System.out.println("Repeated words: " + repeated);
        System.out.println("Number of vowels: " + vowels);

        sc.close();
    }
}