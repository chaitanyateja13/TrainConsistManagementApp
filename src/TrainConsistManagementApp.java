import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== UC13: Performance ===");

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }

        long start = System.nanoTime();

        list.stream().filter(x -> x % 2 == 0).toList();

        long end = System.nanoTime();

        System.out.println("Time: " + (end - start));
    }
}