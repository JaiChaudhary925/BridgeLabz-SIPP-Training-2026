import java.util.Scanner;

public class WordLengthTable {

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

    public static int findLength(String text) {

        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception exception) {
            return count;
        }
    }

    public static String[][] createTable(String[] words) {

        String[][] table = new String[words.length][2];

        for (int index = 0; index < words.length; index++) {
            table[index][0] = words[index];
            table[index][1] = String.valueOf(findLength(words[index]));
        }

        return table;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = scanner.nextLine();

        String[] words = splitWords(text);

        String[][] table = createTable(words);

        System.out.println("\nWord\tLength");

        for (int index = 0; index < table.length; index++) {
            System.out.println(
                    table[index][0] + "\t" + Integer.parseInt(table[index][1]));
        }

        scanner.close();
    }
}