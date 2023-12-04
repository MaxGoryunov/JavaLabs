public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println((i + 1) + "th Arg = " + args[i]);
        }
        if (args.length == 0) {
            System.out.println("No args given");
        }
    }
}