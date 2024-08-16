import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("");
        
        for (String character : input) {
            System.out.print(character + character);
        }

        System.out.println();
    }
}
