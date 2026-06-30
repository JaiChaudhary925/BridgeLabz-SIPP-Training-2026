import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int number = sc.nextInt();

        int temp = number;
        int digitCount = 0;

        while (temp != 0) {
            digitCount++;
            temp /= 10;
        }

        int[] digits = new int[digitCount];

        temp = number;
        int index = 0;

        while (temp != 0) {
            digits[index] = temp % 10;
            temp /= 10;
            index++;
        }

        int[] reverseDigits = new int[digitCount];

        for (int i = 0; i < digitCount; i++) {
            reverseDigits[i] = digits[digitCount - 1 - i];
        }

        System.out.print("Reversed Number: ");

        for (int i = 0; i < digitCount; i++) {
            System.out.print(reverseDigits[i]);
        }

        sc.close();
    }
}