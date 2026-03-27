import java.util.*;
import java.util.stream.*;

public class TrainConsistManagementApp {

    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {

        System.out.println("=== UC9: Grouping Bogies ===");

        List<Bogie> bogies = List.of(
                new Bogie("Sleeper", 72),
                new Bogie("AC", 60),
                new Bogie("Sleeper", 70)
        );

        Map<String, List<Bogie>> grouped =
                bogies.stream().collect(Collectors.groupingBy(b -> b.name));

        System.out.println(grouped);
    }
}