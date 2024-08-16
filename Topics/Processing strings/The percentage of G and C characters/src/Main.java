import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double length = input.length();
        double symbols = 0;

        for (char character : input.toCharArray()) {
            if (Character.toLowerCase(character) == 'c' || Character.toLowerCase(character) == 'g') {
                symbols++;
            }
        }

        System.out.println((symbols / length) * 100);
    }
}