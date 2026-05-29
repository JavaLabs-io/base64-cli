import java.util.Base64;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        if (args.length == 0) {
            interactive();
            return;
        }

        if (args.length < 2) {
            printUsage();
            return;
        }

        String command = args[0].toLowerCase();
        String input = args[1];

        switch (command) {
            case "encode" -> encode(input);
            case "decode" -> decode(input);

            default -> {
                System.out.println("Unknown command: " + command);
            }
        }
    }

    static void encode(String input) {
        String encoded = Base64.getEncoder().encodeToString(input.getBytes());
        System.out.println("Encoded: " + encoded);
    }

    static void decode(String input) {
        try {
            byte[] decodedBytes = Base64.getDecoder().decode(input);
            System.out.println("Decoded: " + new String(decodedBytes));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: Invalid Base64 String");
        }
    }

    static void interactive() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Base64 cli - Interactive Mode");
        System.out.println("Choose action (encode/decode): ");
        String command = scanner.nextLine().trim().toLowerCase();

        System.out.println("Enter text: ");
        String input = scanner.nextLine().trim();

        switch (command) {
            case "encode" -> encode(input);
            case "decode" -> decode(input);
            default -> System.out.println("Unknown command: " + command);
        }
        scanner.close();
    }

    static void printUsage() {
        System.out.println("Usage:");
        ;
        System.out.println(" java Main encode \"your text\"");
        System.out.println(" java Main decode \"eW91ciB0ZXh0\"");
    }
}