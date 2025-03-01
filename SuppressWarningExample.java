import java.util.ArrayList;

public class SuppressWarningExample {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(10);
        list.add(20);
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
