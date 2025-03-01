import java.lang.reflect.*;

class Employee {
    public String name = "John";
    public int salary = 50000;
}

public class JSONConverter {
    public static void main(String[] args) throws Exception {
        Employee e = new Employee();
        System.out.print("{");
        Field[] fields = Employee.class.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            System.out.print("\"" + fields[i].getName() + "\":\"" + fields[i].get(e) + "\"");
            if (i < fields.length - 1) System.out.print(",");
        }
        System.out.println("}");
    }
}
