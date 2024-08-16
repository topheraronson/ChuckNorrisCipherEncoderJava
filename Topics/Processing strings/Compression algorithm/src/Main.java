import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("(?<=(.))(?!\\1)");

        StringBuilder sb = new StringBuilder();

        for (String group : input) {
            sb.append(group.charAt(0));
            sb.append(group.length());
        }

        System.out.println(sb.toString());
    }
}