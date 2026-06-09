import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base in inches: ");
        double base = scanner.nextDouble();

        System.out.print("Enter height in inches: ");
        double height = scanner.nextDouble();

        double areaInSquareInches = 0.5 * base * height;
        double areaInSquareCentimeters = areaInSquareInches * 6.4516;

        System.out.println("Area in square inches = " + areaInSquareInches);
        System.out.println("Area in square centimeters = " + areaInSquareCentimeters);

        scanner.close();
    }
}