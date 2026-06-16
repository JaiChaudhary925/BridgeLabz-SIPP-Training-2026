import java.util.Scanner;

public class VowelConsonantCount {

    public static String checkCharacter(char character) {

        if (character >= 'A' && character <= 'Z') {
            character = (char) (character + 32);
        }

        if (character == 'a' || character == 'e' ||
            character == 'i' || character == 'o' ||
            character == 'u') {
            return "Vowel";
        }

        if (character >= 'a' && character <= 'z') {
            return "Consonant";
        }

        return "Not a Letter";
    }

    public static int[] countVowelsConsonants(String text) {

        int vowels = 0;
        int consonants = 0;

        for (int index = 0; index < text.length(); index++) {

            String result = checkCharacter(text.charAt(index));

            if (result.equals("Vowel")) {
                vowels++;
            } else if (result.equals("Consonant")) {
                consonants++;
            }
        }

        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = scanner.nextLine();

        int[] result = countVowelsConsonants(text);

        System.out.println("Vowels = " + result[0]);
        System.out.println("Consonants = " + result[1]);

        scanner.close();
    }
}