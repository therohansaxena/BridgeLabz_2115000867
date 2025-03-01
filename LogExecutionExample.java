import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime {
}

class Performance {
    @LogExecutionTime
    void runTask() {
        long start = System.nanoTime();
        for (int i = 0; i < 1000000; i++);
        long end = System.nanoTime();
        System.out.println("Execution time: " + (end - start) + " nanoseconds");
    }
}

public class LogExecutionTimeExample {
    public static void main(String[] args) {
        Performance p = new Performance();
        p.runTask();
    }
}
