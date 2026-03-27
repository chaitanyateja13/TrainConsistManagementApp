import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        List<String> bogies = new ArrayList<>();

        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        System.out.println("After Adding Bogies: " + bogies);

        bogies.remove("AC Chair");

        System.out.println("After Removal: " + bogies);

        System.out.println("Contains Sleeper? " + bogies.contains("Sleeper"));
    }
}