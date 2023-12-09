import modes.EncodedMode;

public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            throw new IllegalArgumentException("Not enough arguments");
        }
        try {
            switch (args[0]) {
                case "encode" -> {
                    new EncodedMode().encode(args[1]);
                }
                case "decode" -> {

                }
                case "info" -> {

                }
                default -> System.out.println("Illegal mode provided: choose encode, decode or info");
            }
        } catch (Exception e) {
            throw new RuntimeException("Program failed", e);
        }
    }
}