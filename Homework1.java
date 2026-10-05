import java.util.*;

public class Homework1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {

            System.out.print("Enter string " + i + ": ");
            String str = sc.nextLine();

            if (list.contains(str)) {
                System.out.println("Already exists!");
            } else {
                list.add(str);
            }
        }

        System.out.println("\nFinal Strings:");

        for (String s : list) {
            System.out.println(s);
        }

        sc.close();
    }
}