import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ImportantMethod {
    String level() default "HIGH";
}

class Process {
    @ImportantMethod(level = "HIGH")
    void criticalProcess() {
        System.out.println("Executing critical process");
    }
}

public class ImportantMethodExample {
    public static void main(String[] args) {
        Process p = new Process();
        p.criticalProcess();
    }
}
