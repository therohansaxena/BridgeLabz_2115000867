import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MaxLength {
    int value();
}

class User {
    @MaxLength(10)
    String username;

    User(String name) {
        if (name.length() > 10) throw new IllegalArgumentException("Exceeds max length");
        this.username = name;
    }
}

public class MaxLengthExample {
    public static void main(String[] args) {
        User u = new User("RitikSoni");
        System.out.println("User created: " + u.username);
    }
}
