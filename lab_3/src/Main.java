public class Main {
    public static void main(String[] args) {
        System.out.println("Logical &&");
        System.out.println("1 && 1 => " + (true && true));
        System.out.println("1 && 0 => " + (true && false));
        System.out.println("0 && 1 => " + (false && true));
        System.out.println("0 && 0 => " + (false && false));

        System.out.println("Logical ||");
        System.out.println("1 || 1 => " + (true || true));
        System.out.println("1 || 0 => " + (true || false));
        System.out.println("0 || 1 => " + (false || true));
        System.out.println("0 || 0 => " + (false || false));

        System.out.println("Logical !");
        System.out.println("!1 => " + (!true));
        System.out.println("!0 => " + (!false));

        double x = Math.E;
        double y = Math.PI;
        System.out.println(x < y ? x : y);

        int a = 11; // 1011
        int b = 2;  // 0010
        System.out.println("Bit-wise &");
        System.out.println(a & b);

        System.out.println("Bit-wise |");
        System.out.println(a | b);

        System.out.println("Bit-wise Xor");
        System.out.println(a ^ b);

        System.out.println(Integer.toBinaryString(~b));

        System.out.println("a >> b " + (a >> b));
        System.out.println("b >> a " + (b >> a));
        System.out.println("a >>> b " + (a >>> b));
    }
}