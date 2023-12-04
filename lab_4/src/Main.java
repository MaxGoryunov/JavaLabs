public class Main {
    public static void main(String[] args) {
        Short s = 15000;
        Byte b = 126;
        Character c = 'M';
        Integer i = 100_000;
        // primitives for Short, Byte, Integer and Character are also okay
        switch(s) {
            case 10 -> System.out.println("s = 10");
            case 15000 -> System.out.println("s = 15000");
            default -> System.out.println("No matching branch for Short");
        }
        switch(b) {
            case 126 -> System.out.println("b = 126");
            case 26 -> System.out.println("b = 26");
            default -> System.out.println("Not matching branch for Byte");
        }
        switch(c) {
            case 'N' -> System.out.println("c = N");
            case 'M' -> System.out.println("c = M");
            default -> System.out.println("No matching branch for Character");
        }
        switch(i) {
            case 10 -> System.out.println("i = 10");
            case 100000 -> System.out.println("i = 100000");
            default -> System.out.println("No matching branch for Integer");
        }
    }
}