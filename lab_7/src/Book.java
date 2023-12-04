public class Book {
    private String title;
    private Integer year;
    private String author;
    public Book(String title, Integer year, String author) {
        this.title  = title;
        this.year   = year;
        this.author = author;
    }

    public void swap(Book other) {
        String title = other.title;
        Integer year = other.year;
        String author = other.author;
        other.title = this.title;
        other.year = this.year;
        other.author = this.author;
        this.title = title;
        this.year = year;
        this.author = author;
    }

    public void print() {
        System.out.println(this);
        System.out.println("title = " + this.title);
        System.out.println("year = " + this.year);
        System.out.println("author = " + this.author);
    }
}
