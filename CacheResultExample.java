import java.lang.annotation.*;
import java.util.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CacheResult {
}

class Computation {
    private static HashMap<Integer, Integer> cache = new HashMap<>();

    @CacheResult
    int computeSquare(int n) {
        if (cache.containsKey(n)) return cache.get(n);
        int result = n * n;
        cache.put(n, result);
        return result;
    }
}

public class CacheResultExample {
    public static void main(String[] args) {
        Computation c = new Computation();
        System.out.println(c.computeSquare(5));
        System.out.println(c.computeSquare(5));
    }
}
