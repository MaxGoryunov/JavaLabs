import modes.DecodedMode;
import modes.EncodedMode;
import modes.InfoMode;

public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            throw new IllegalArgumentException("Not enough arguments");
        }
        try {
            switch (args[0]) {
                case "encode" -> {
                    new EncodedMode(args[1], args[1] + ".encoded.txt").encode();
                }
                case "decode" -> {
                    new DecodedMode(args[1]).decode();
                }
                case "info" -> {
                    new InfoMode().info(args[1]);
                }
                default -> System.out.println("Illegal mode provided: choose encode, decode or info");
            }
        } catch (Exception e) {
            throw new RuntimeException("Program failed", e);
        }
    }
}