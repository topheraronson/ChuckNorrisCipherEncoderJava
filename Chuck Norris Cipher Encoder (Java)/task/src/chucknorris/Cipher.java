package chucknorris;

import java.util.Scanner;

public class Cipher {

    private String encodedString;
    private String decodedString;

    public void setDecodedString() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input string:");
        this.decodedString = scanner.nextLine();
    }

    public void setEncodedString() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input encoded string:");
        String tmp = scanner.nextLine();

        if (tmp.matches("[^0]+")) {
            throw new IllegalArgumentException();
        }

        this.encodedString = tmp;
    }

    public void printEncoded() {
        System.out.println("Encoded string:");
        System.out.println(encodedString);
    }

    public void printDecoded() {
        System.out.println("Decoded string:");
        System.out.println(decodedString);
    }

    public void encode() {
        String binary = convertToBinary(decodedString);
        String[] blocks = binary.split("(?<=(.))(?!\\1)");
        StringBuilder sb = new StringBuilder();

        for (String block : blocks) {
            sb.append(block.charAt(0) == '1' ? "0 " : "00 ");
            sb.append("0".repeat(block.length()));
            sb.append(" ");
        }

        this.encodedString = sb.toString();
    }

    public void decode() {

        String[] blocks = encodedString.split(" ");
        StringBuilder sb = new StringBuilder();

        if (blocks.length % 2 != 0) {
            throw new RuntimeException();
        }

        for (int i = 0; i < blocks.length; i += 2) {
            if (blocks[i].equals("0")) {
                sb.append("1".repeat(blocks[i + 1].length()));
            } else if (blocks[i].equals("00")){
                sb.append("0".repeat(blocks[i + 1].length()));
            } else {
                throw new RuntimeException();
            }
        }

        if (sb.length() % 7 != 0) {
            throw new RuntimeException();
        }

        this.decodedString = convertToDecimal(sb.toString().split("(?<=\\G.{7})"));
    }

    private String convertToDecimal(String[] characters) {
        StringBuilder sb = new StringBuilder();

        for (String character : characters) {
            char c = (char) Integer.parseInt(character, 2);
            sb.append(c);
        }

        return sb.toString();
    }

    private String convertToBinary(String input) {
        StringBuilder sb = new StringBuilder();

        for (char character : input.toCharArray()) {
            sb.append(String.format("%7s", Integer.toBinaryString(character)).replace(' ', '0'));
        }

        return sb.toString();
    }
}
