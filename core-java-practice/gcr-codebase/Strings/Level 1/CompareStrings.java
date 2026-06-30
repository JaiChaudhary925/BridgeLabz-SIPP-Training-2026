import java.util.Scanner;

public class CompareStrings {

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

        System.out.print("Enter First String: ");
        String firstText = scanner.next();

        System.out.print("Enter Second String: ");
        String secondText = scanner.next();

        boolean userResult = compareStrings(firstText, secondText);
        boolean builtInResult = firstText.equals(secondText);

        System.out.println("Using charAt(): " + userResult);
        System.out.println("Using equals(): " + builtInResult);

        if (userResult == builtInResult) {
            System.out.println("Both results are same.");
        } else {
            System.out.println("Results are different.");
        }

        scanner.close();
    }
}