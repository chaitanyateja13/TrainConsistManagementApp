import java.util.Arrays;

public static void sortBogieNames() {
    String[] bogies = {"Sleeper", "AC", "General", "Luxury"};

    Arrays.sort(bogies);

    System.out.println("Sorted Bogie Names:");
    System.out.println(Arrays.toString(bogies));
}

void main() {
    sortBogieNames();
}