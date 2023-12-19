public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("The Captain's Daughter", 1836, "Pushkin");
        Book b2 = new Book("The Master and Margarita", 1966, "Bulgakov");
        System.out.println("Before swapping: ");
        System.out.println("b1");
        b1.print();
        System.out.println("b2");
        b2.print();

        try {
            new Swap<>().exec(b1, b2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        b1.swap(b2);
        System.out.println("After swapping: ");
        System.out.println("b1");
        b1.print();
        System.out.println("b2");
        b2.print();
    }
}