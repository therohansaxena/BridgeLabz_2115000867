import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField {
    String name();
}

class Person {
    @JsonField(name = "user_name")
    String name;

    Person(String n) {
        this.name = n;
    }
}

public class JsonFieldExample {
    public static void main(String[] args) {
        Person p = new Person("Ritik");
        System.out.println("{\"user_name\":\"" + p.name + "\"}");
    }
}
