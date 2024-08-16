import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        int inputCount = scanner.nextInt();
        String output;

        if (inputCount >= inputString.length()) {
            output = inputString;
        } else {
            output = inputString.substring(inputCount, inputString.length()) + inputString.substring(0, inputCount);
        }
        System.out.println(output);
    }
}