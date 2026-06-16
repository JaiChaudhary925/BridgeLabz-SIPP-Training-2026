import java.util.Scanner;

public class StringLengthWithoutLength {

    public static int findLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException exception) {
            return count;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter String: ");
        String text = scanner.next();

        int userLength = findLength(text);
        int builtInLength = text.length();

        System.out.println("Length Using User Method: " + userLength);
        System.out.println("Length Using length(): " + builtInLength);

        scanner.close();
    }
}