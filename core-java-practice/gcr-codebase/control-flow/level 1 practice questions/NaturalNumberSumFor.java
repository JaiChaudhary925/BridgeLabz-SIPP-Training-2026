import java.util.Scanner;

class NaturalNumberSumFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if (number > 0) {
            int formulaSum = number * (number + 1) / 2;

            int forSum = 0;

            for (int i = 1; i <= number; i++) {
                forSum += i;
            }

            System.out.println("Sum using for loop = " + forSum);
            System.out.println("Sum using formula = " + formulaSum);
            System.out.println("Both results are same = " + (forSum == formulaSum));
        } else {
            System.out.println("The number is not a natural number");
        }

        input.close();
    }
}