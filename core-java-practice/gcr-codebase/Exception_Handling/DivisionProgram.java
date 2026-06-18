import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int number1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int number2 = scanner.nextInt();

            int result = number1 / number2;

            System.out.println("Result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } catch (InputMismatchException e) {
            System.out.println("Please enter numeric values only");
        }

        scanner.close();
    }
}