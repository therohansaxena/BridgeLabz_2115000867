
import java.lang.reflect.*;

public class GetClassInfo {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("java.util.ArrayList");
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        Method[] methods = clazz.getDeclaredMethods();
        Field[] fields = clazz.getDeclaredFields();
        for (Constructor<?> c : constructors) System.out.println(c);
        for (Method m : methods) System.out.println(m);
        for (Field f : fields) System.out.println(f);
    }
}
