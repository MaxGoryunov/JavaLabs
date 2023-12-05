import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Reflector {
    public void printClassname(Class<?> obj) {
        System.out.println("Classname = " + obj.getName());
    }

    public void printModifiers(Class<?> obj) {
        int modifiers = obj.getModifiers();
        System.out.println("Clsas modifiers");
        if (Modifier.isAbstract(modifiers)) {
            System.out.println("is abstract");
        }
        if (Modifier.isFinal(modifiers)) {
            System.out.println("is final");
        }
        if (Modifier.isPublic(modifiers)) {
            System.out.println("is public");
        }
        if (Modifier.isPrivate(modifiers)) {
            System.out.println("is private");
        }
        if (Modifier.isInterface(modifiers)) {
            System.out.println("is interface");
        }
    }

    public void printConstructors(Class<?> obj) {
        Constructor<?>[] ctors = obj.getConstructors();
        for (Constructor<?> ctor : ctors) {
            System.out.print("Ctor " + ctor.getName() + "(");
            Class<?>[] params = ctor.getParameterTypes();
            for (Class<?> param : params) {
                System.out.print(param.getName() + ", ");
            }
            System.out.println(")");
        }
    }

    public void printFields(Class<?> obj) {
        System.out.println("Fields");
        Field[] fields = obj.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getType().getName() + " " + field.getName());
        }
    }

    public void printMethods(Class<?> obj) {
        System.out.println("Methods");
        Method[] methods = obj.getMethods();
        for (Method method : methods) {
            System.out.print(method.getReturnType().getName() + " " + method.getName() + "(");
            Class<?>[] params = method.getParameterTypes();
            for (Class<?> param : params) {
                System.out.print(param.getTypeName() + ", ");
            }
            System.out.println(")");
        }
    }

    public void printInterfaces(Class<?> obj) {
        Class<?>[] interfaces = obj.getInterfaces();
        System.out.println("Interafces");
        for (Class<?> _interface : interfaces) {
            System.out.println(_interface.getName());
        }
    }

    public void printFullInfo(Class<?> obj) {
        this.printClassname(obj);
        this.printInterfaces(obj);
        this.printModifiers(obj);
        this.printConstructors(obj);
        this.printFields(obj);
        this.printMethods(obj);
    }
}
