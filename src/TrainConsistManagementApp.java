// Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

public class TrainConsistManagementApp {

    public static void assignCargo(String bogieShape, String cargoType) {
        try {
            if (bogieShape.equalsIgnoreCase("rectangular") &&
                    cargoType.equalsIgnoreCase("petroleum")) {
                throw new CargoSafetyException("Unsafe cargo! Petroleum cannot be assigned to rectangular bogie.");
            }

            System.out.println("Cargo assigned successfully.");

        } catch (CargoSafetyException e) {
            System.out.println("ERROR: " + e.getMessage());

        } finally {
            System.out.println("Cargo assignment process completed.");
        }
    }

    public static void main(String[] args) {
        assignCargo("rectangular", "petroleum"); // will throw exception
        assignCargo("cylindrical", "petroleum"); // safe case
    }
}