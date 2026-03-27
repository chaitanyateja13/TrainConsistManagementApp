import java.util.*;

public class TrainConsistManagementApp {

    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("=== UC10: Total Capacity ===");

        List<Bogie> bogies = List.of(
                new Bogie("Sleeper", 72),
                new Bogie("AC", 60),
                new Bogie("First", 30)
        );

        int total = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        System.out.println("Total Capacity: " + total);
    }
}