public final class Book implements IBook {
    private String name;
    private Integer year;
    private String author;
    public Book() {
        this("No name", 0, "Noone");
    }

    public Book(String name, Integer year, String author) {
        this.name = name;
        this.year = year;
        this.author = author;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
