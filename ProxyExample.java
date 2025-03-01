import java.lang.reflect.*;

interface Greeting {
    void sayHello();
}

class GreetingImpl implements Greeting {
    public void sayHello() {
        System.out.println("Hello!");
    }
}

class LoggingProxy implements InvocationHandler {
    private Object target;
    public LoggingProxy(Object target) { this.target = target; }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Calling method: " + method.getName());
        return method.invoke(target, args);
    }
}

public class ProxyExample {
    public static void main(String[] args) {
        Greeting obj = (Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class[]{Greeting.class},
                new LoggingProxy(new GreetingImpl()));
        obj.sayHello();
    }
}
