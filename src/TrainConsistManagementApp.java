import java.util.regex.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== UC11: Regex Validation ===");

        String trainId = "TRN-1234";
        String cargo = "PET-AB";

        Pattern trainPattern = Pattern.compile("TRN-\\d{4}");
        Pattern cargoPattern = Pattern.compile("PET-[A-Z]{2}");

        System.out.println("Train Valid: " + trainPattern.matcher(trainId).matches());
        System.out.println("Cargo Valid: " + cargoPattern.matcher(cargo).matches());
    }
}