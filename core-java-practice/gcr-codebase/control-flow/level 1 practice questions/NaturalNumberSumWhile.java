import java.util.Scanner;

class NaturalNumberSumWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if (number > 0) {
            int formulaSum = number * (number + 1) / 2;

            int whileSum = 0;
            int counter = 1;

            while (counter <= number) {
                whileSum += counter;
                counter++;
            }

            System.out.println("Sum using while loop = " + whileSum);
            System.out.println("Sum using formula = " + formulaSum);
            System.out.println("Both results are same = " + (whileSum == formulaSum));
        } else {
            System.out.println("The number is not a natural number");
        }

        input.close();
    }
}