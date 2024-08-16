import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] sentence = scanner.nextLine().split(" ");
        int longestWord = 0;

        for (int i = 0; i < sentence.length; i++) {
            if (i == 0) {
                continue;
            }

            if (sentence[i].length() > sentence[longestWord].length()) {
                longestWord = i;
            }
        }

        System.out.println(sentence[longestWord]);
    }
}