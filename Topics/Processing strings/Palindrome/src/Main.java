import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] characters = input.split("");
        StringBuilder reversed = new StringBuilder();

        for (int i = characters.length; i > 0; i--) {
            reversed.append(characters[i - 1]);
        };

        System.out.println(input.equals(reversed.toString()) ? "yes" : "no");
    }
}