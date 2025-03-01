import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Inject {}

class Service {
    public void execute() {
        System.out.println("Service executed");
    }
}

class Client {
    @Inject
    public Service service;
}

public class DependencyInjection {
    public static void main(String[] args) throws Exception {
        Client c = new Client();
        for (Field f : Client.class.getDeclaredFields()) {
            if (f.isAnnotationPresent(Inject.class)) {
                f.setAccessible(true);
                f.set(c, new Service());
            }
        }
        c.service.execute();
    }
}
