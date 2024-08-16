import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        int inserts = 0;

        for (int i = 0; i < input.length(); i++) {
            if ("aeiouy".contains(input.substring(i, i + 1))) {
                sb.append("V");
            } else {
                sb.append("C");
            }
        }

        for (int i = 0; i < sb.length(); i++) {
            if (i == 0 || i == sb.length() - 1) {
                continue;
            }

            if (sb.charAt(i) == sb.charAt(i - 1) && sb.charAt(i) == sb.charAt(i + 1)) {
                sb.insert(i + 1, "|");
            }
        }

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '|') {
                inserts++;
            }
        }
        System.out.println(inserts);
    }
}
