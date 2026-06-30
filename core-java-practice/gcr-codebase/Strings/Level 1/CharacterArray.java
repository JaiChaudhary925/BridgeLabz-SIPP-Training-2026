import java.util.Scanner;

public class CharacterArray {

    public static char[] getCharacters(String text) {

        char[] characters = new char[text.length()];

        for (int index = 0; index < text.length(); index++) {
            characters[index] = text.charAt(index);
        }

        return characters;
    }

    public static boolean compareArrays(char[] firstArray, char[] secondArray) {

        if (firstArray.length != secondArray.length) {
            return false;
        }

        for (int index = 0; index < firstArray.length; index++) {
            if (firstArray[index] != secondArray[index]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter String: ");
        String text = scanner.next();

        char[] userArray = getCharacters(text);
        char[] builtInArray = text.toCharArray();

        boolean result = compareArrays(userArray, builtInArray);

        System.out.println("Arrays are Equal: " + result);

        scanner.close();
    }
}