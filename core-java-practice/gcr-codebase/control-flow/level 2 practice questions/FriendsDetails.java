import java.util.Scanner;

class FriendsDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int amarAge = input.nextInt();
        int akbarAge = input.nextInt();
        int anthonyAge = input.nextInt();

        double amarHeight = input.nextDouble();
        double akbarHeight = input.nextDouble();
        double anthonyHeight = input.nextDouble();

        if (amarAge < akbarAge && amarAge < anthonyAge) {
            System.out.println("Youngest Friend is Amar");
        } else if (akbarAge < amarAge && akbarAge < anthonyAge) {
            System.out.println("Youngest Friend is Akbar");
        } else {
            System.out.println("Youngest Friend is Anthony");
        }

        if (amarHeight > akbarHeight && amarHeight > anthonyHeight) {
            System.out.println("Tallest Friend is Amar");
        } else if (akbarHeight > amarHeight && akbarHeight > anthonyHeight) {
            System.out.println("Tallest Friend is Akbar");
        } else {
            System.out.println("Tallest Friend is Anthony");
        }

        input.close();
    }
}