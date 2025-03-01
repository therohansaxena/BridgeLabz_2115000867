import java.lang.reflect.*;

class MathOperations {
    public int add(int a, int b) { return a + b; }
    public int subtract(int a, int b) { return a - b; }
    public int multiply(int a, int b) { return a * b; }
}

public class DynamicMethodInvocation {
    public static void main(String[] args) throws Exception {
        MathOperations m = new MathOperations();
        Method method = MathOperations.class.getDeclaredMethod("add", int.class, int.class);
        System.out.println(method.invoke(m, 10, 5));
    }
}
