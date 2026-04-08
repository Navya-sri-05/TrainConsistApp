public class TrainConsistApp {

    // Custom Runtime Exception
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    // Method to assign cargo
    public static void assignCargo(String shape, String cargo) {

        try {
            // Unsafe condition
            if (shape.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe cargo assignment!");
            }

            // Safe case
            System.out.println("Cargo assigned successfully -> " + cargo);

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Cargo validation completed for " + shape + " bogie\n");
        }
    }

    public static void main(String[] args) {

        System.out.println("UC15 - Safe Cargo Assignment");
        System.out.println("=================================\n");

        // Safe case
        assignCargo("Cylindrical", "Petroleum");

        // Unsafe case
        assignCargo("Rectangular", "Petroleum");

        System.out.println("UC15 runtime handling completed...");
    }
}