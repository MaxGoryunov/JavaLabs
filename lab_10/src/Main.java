public class Main {
    public static void main(String[] args) {
        System.out.println("Doubles");
        Triple<Double> doubles = new Triple<>(2.7, 3.14, 10d);
        doubles.print();
        System.out.println("Min = " + doubles.min());
        System.out.println("Max = " + doubles.max());
        System.out.println("Mean = " + doubles.mean());

        System.out.println("Ints");
        Triple<Integer> ints = new Triple<>(2, 4, 8);
        ints.print();
        System.out.println("Min = " + ints.min());
        System.out.println("Max = " + ints.max());
        System.out.println("Mean = " + ints.mean());
    }
}