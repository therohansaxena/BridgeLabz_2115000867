import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String name();
}

@Author(name = "Ritik Soni")
class Book {}

public class RetrieveAnnotations {
    public static void main(String[] args) throws Exception {
        Annotation a = Book.class.getAnnotation(Author.class);
        System.out.println(((Author) a).name());
    }
}
