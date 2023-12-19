import java.lang.reflect.Field;

public class Swap<T> {
    public void exec(T left, T right) throws Exception {
        Field[] fields = left.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            Object tmp = field.get(left);
            field.set(left, field.get(right));
            field.set(right, tmp);
        }
    }
}
