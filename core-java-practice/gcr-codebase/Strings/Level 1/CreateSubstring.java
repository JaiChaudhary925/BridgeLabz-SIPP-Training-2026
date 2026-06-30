import java.util.Scanner;

public class CreateSubstring {

    public static String getSubstring(String text, int startIndex, int endIndex) {

        String result = "";

        for (int index = startIndex; index < endIndex; index++) {
            result += text.charAt(index);
        }

        return result;
    }

    public static boolean compareStrings(String firstText, String secondText) {

        if (firstText.length() != secondText.length()) {
            return false;
        }

        for (int index = 0; index < firstText.length(); index++) {
            if (firstText.charAt(index) != secondText.charAt(index)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter String: ");
        String text = scanner.next();

        System.out.print("Enter Start Index: ");
        int startIndex = scanner.nextInt();

        System.out.print("Enter End Index: ");
        int endIndex = scanner.nextInt();

        String userSubstring = getSubstring(text, startIndex, endIndex);
        String builtInSubstring = text.substring(startIndex, endIndex);

        System.out.println("User Defined Substring: " + userSubstring);
        System.out.println("Built-in Substring: " + builtInSubstring);

        boolean result = compareStrings(userSubstring, builtInSubstring);

        System.out.println("Are Both Equal? " + result);

        scanner.close();
    }
}