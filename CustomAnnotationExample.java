import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface TaskInfo {
    String priority();
    String assignedTo();
}

class TaskManager {
    @TaskInfo(priority = "High", assignedTo = "Ritik")
    void completeTask() {
        System.out.println("Task completed");
    }
}

public class CustomAnnotationExample {
    public static void main(String[] args) {
        TaskManager t = new TaskManager();
        t.completeTask();
    }
}
