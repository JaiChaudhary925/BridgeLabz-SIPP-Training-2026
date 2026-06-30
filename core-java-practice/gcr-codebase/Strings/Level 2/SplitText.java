import java.util.Scanner;

public class SplitText {

    public static String[] splitWords(String text) {

        int wordCount = 1;

        for (int index = 0; index < text.length(); index++) {
            if (text.charAt(index) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];

        int start = 0;
        int wordIndex = 0;

        for (int index = 0; index <= text.length(); index++) {

            if (index == text.length() || text.charAt(index) == ' ') {

                String word = "";

                for (int i = start; i < index; i++) {
                    word += text.charAt(i);
                }

                words[wordIndex] = word;
                wordIndex++;
                start = index + 1;
            }
        }

        return words;
    }

    public static boolean compareArrays(String[] firstArray, String[] secondArray) {

        if (firstArray.length != secondArray.length) {
            return false;
        }

        for (int index = 0; index < firstArray.length; index++) {
            if (!firstArray[index].equals(secondArray[index])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = scanner.nextLine();

        String[] userWords = splitWords(text);
        String[] builtInWords = text.split(" ");

        boolean result = compareArrays(userWords, builtInWords);

        System.out.println("Arrays Equal: " + result);

        scanner.close();
    }
}