import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Todo {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}

class Project {
    @Todo(task = "Implement authentication", assignedTo = "John")
    void authFeature() {
        System.out.println("Authentication in progress");
    }
}

public class TodoAnnotationExample {
    public static void main(String[] args) {
        Project p = new Project();
        p.authFeature();
    }
}
