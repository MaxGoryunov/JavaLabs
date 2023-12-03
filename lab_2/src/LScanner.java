import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class LScanner {
    public static void main(String[] args) /*throws IOException*/ {
        String dir = System.getProperty("user.dir"); // каталог запуска
        System.out.println(dir);

        try {
            Scanner scanner = new Scanner(Paths.get(dir, "in.txt"), "UTF-8");
            StringBuilder message = new StringBuilder(new String(""));
            while(scanner.hasNext())
            {
                message.append(scanner.nextLine());
                System.out.println(message.toString());
            }
        } catch (NoSuchFileException e) {
            System.out.println("Exception 1: " + e);
        } catch (IOException e) {
            System.out.println("Exception 2: " + e);
        } catch (Exception e) {
            System.out.println("Exception 3: " + e);
        }

    }
}