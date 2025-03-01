import java.lang.reflect.*;

class HeavyTask {
    public void perform() {
        long sum = 0;
        for (int i = 0; i < 100000; i++) sum += i;
        System.out.println("Task completed");
    }
}

public class ExecutionTimer {
    public static void main(String[] args) throws Exception {
        HeavyTask h = new HeavyTask();
        Method m = HeavyTask.class.getDeclaredMethod("perform");
        long start = System.nanoTime();
        m.invoke(h);
        long end = System.nanoTime();
        System.out.println("Execution time: " + (end - start) + " nanoseconds");
    }
}
