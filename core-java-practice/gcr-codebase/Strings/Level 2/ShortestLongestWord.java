import java.util.Scanner;

public class ShortestLongestWord {

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

    public static int[] findShortestLongest(String[][] table) {

        int shortest = 0;
        int longest = 0;

        for (int index = 1; index < table.length; index++) {

            int currentLength = Integer.parseInt(table[index][1]);

            if (currentLength < Integer.parseInt(table[shortest][1])) {
                shortest = index;
            }

            if (currentLength > Integer.parseInt(table[longest][1])) {
                longest = index;
            }
        }

        return new int[]{shortest, longest};
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = scanner.nextLine();

        String[] words = splitWords(text);

        String[][] table = createTable(words);

        int[] result = findShortestLongest(table);

        System.out.println("Shortest Word: " + table[result[0]][0]);
        System.out.println("Longest Word: " + table[result[1]][0]);

        scanner.close();
    }
}