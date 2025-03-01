import java.lang.reflect.*;
import java.util.*;

class User {
    public String name;
    public int age;
}

public class ObjectMapper {
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) throws Exception {
        T obj = clazz.getDeclaredConstructor().newInstance();
        for (Field f : clazz.getDeclaredFields()) {
            if (properties.containsKey(f.getName())) {
                f.setAccessible(true);
                f.set(obj, properties.get(f.getName()));
            }
        }
        return obj;
    }

    public static void main(String[] args) throws Exception {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "Ritik");
        map.put("age", 22);
        User u = toObject(User.class, map);
        System.out.println(u.name + " " + u.age);
    }
}
