import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RoleAllowed {
    String value();
}

class AccessControl {
    @RoleAllowed("ADMIN")
    void adminAccess() {
        System.out.println("Admin access granted");
    }
}

public class RoleAccessExample {
    public static void main(String[] args) {
        String userRole = "USER";
        AccessControl ac = new AccessControl();
        if (!userRole.equals("ADMIN")) {
            System.out.println("Access Denied!");
        } else {
            ac.adminAccess();
        }
    }
}
