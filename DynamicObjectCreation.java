import java.lang.reflect.*;

class Student {
    public Student() {}
}

public class DynamicObjectCreation {
    public static void main(String[] args) throws Exception {
        Constructor<Student> c = Student.class.getDeclaredConstructor();
        Student s = c.newInstance();
        System.out.println(s);
    }
}
