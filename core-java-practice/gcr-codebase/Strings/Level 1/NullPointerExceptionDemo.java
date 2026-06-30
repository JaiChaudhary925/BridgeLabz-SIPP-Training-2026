import java.util.Scanner;

public class StringIndexExceptionDemo {

    public static void generateException(String text) {

        System.out.println(text.charAt(text.length()));
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter String: ");
        String text = scanner.next();

        generateException(text);

        scanner.close();
    }
}


import java.util.Scanner;

public class StringIndexExceptionHandling {

    public static void handleException(String text) {

        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException exception) {
            System.out.println("StringIndexOutOfBoundsException Handled");
            System.out.println(exception);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter String: ");
        String text = scanner.next();

        handleException(text);

        scanner.close();
    }
}