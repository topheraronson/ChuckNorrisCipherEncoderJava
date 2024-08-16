import java.util.*;

public class Main {
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWERCASE = UPPERCASE.toLowerCase();
    private static final String NUMBERS = "0123456789";
    private static final String SYMBOLS = "!@#$%^&*()_+";

    private static enum Character {
        UPPER,
        LOWER,
        NUMBER,
        EXTRA
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfUpper = scanner.nextInt();
        int numberOfLower = scanner.nextInt();
        int numberOfNumber = scanner.nextInt();
        int totalLength = scanner.nextInt();
        int extra = totalLength - (numberOfNumber + numberOfLower + numberOfUpper);
        StringBuilder sb = new StringBuilder();

        sb = passwordAppend(sb, numberOfUpper, Character.UPPER);
        sb = passwordAppend(sb, numberOfLower, Character.LOWER);
        sb = passwordAppend(sb, numberOfNumber, Character.NUMBER);
        sb = passwordAppend(sb, extra, Character.EXTRA);

        System.out.println(sb.toString());
    }

    private static StringBuilder passwordAppend(StringBuilder sb, int characterCount, Character characterSet) {

        Random rand = new Random();
        int lastSelection = 0;
        int character = 0;

        for (int i = 0; i < characterCount; i++) {

            switch (characterSet) {
                case UPPER:
                    while (character == lastSelection) {
                        character = rand.nextInt(10);
                    }
                    sb.append(UPPERCASE.charAt(character));
                    lastSelection = character;
                    break;
                case LOWER:
                    while (character == lastSelection) {
                        character = rand.nextInt(10);
                    }
                    sb.append(LOWERCASE.charAt(character));
                    lastSelection = character;
                    break;
                case NUMBER:
                    while (character == lastSelection) {
                        character = rand.nextInt(10);
                    }
                    sb.append(NUMBERS.charAt(character));
                    lastSelection = character;
                    break;
                case EXTRA:
                    while (character == lastSelection) {
                        character = rand.nextInt(10);
                    }
                    sb.append(SYMBOLS.charAt(character));
                    lastSelection = character;
                    break;
            }
        }

        return sb;
    }
}