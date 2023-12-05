import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        try {
            Class<?> name = Book.class;
            Constructor<?> ctor = name.getConstructor(String.class, Integer.class);
            Book book = (Book) ctor.newInstance("The Captain's Daughter", 1836);
            Method getTitle = name.getMethod("getTitle");
            System.out.println(getTitle.invoke(book));
            Method setTitle = name.getMethod("setTitle", String.class);
            setTitle.invoke(book, "The Master and Margarite");
            System.out.println("New title = " + book.getTitle());
        } catch (NoSuchMethodException
                | InstantiationException
                | IllegalAccessException
                | InvocationTargetException e
        ) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}