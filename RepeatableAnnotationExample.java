import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(BugReports.class)
@interface BugReport {
    String description();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReports {
    BugReport[] value();
}

class Software {
    @BugReport(description = "Fix UI bug")
    @BugReport(description = "Fix performance issue")
    void execute() {
        System.out.println("Executing software");
    }
}

public class RepeatableAnnotationExample {
    public static void main(String[] args) {
        Software s = new Software();
        s.execute();
    }
}
