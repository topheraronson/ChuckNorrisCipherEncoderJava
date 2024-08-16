package chucknorris;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please input operation (encode/decode/exit):");
            String menuChoice = scanner.nextLine();
            Cipher cipher = new Cipher();

            switch (menuChoice) {
                case "encode":
                    cipher.setDecodedString();
                    cipher.encode();
                    cipher.printEncoded();
                    break;
                case "decode":
                    try {
                        cipher.setEncodedString();
                        cipher.decode();
                    } catch (Exception e) {
                        System.out.println("Encoded string is not valid.");
                        break;
                    }

                    cipher.printDecoded();
                    break;
                case "exit":
                    System.out.println("Bye!");
                    return;
                default:
                    System.out.println("There is no '" + menuChoice + "' operation");
            }
        }
    }
}