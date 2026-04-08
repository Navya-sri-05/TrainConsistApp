public class TrainConsistApp {

    // Custom Exception
    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    // Bogie class
    static class Bogie {
        String name;
        int capacity;

        public Bogie(String name, int capacity) throws InvalidCapacityException {

            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }

            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("UC14 - Handle Invalid Bogie Capacity");
        System.out.println("=====================================\n");

        try {
            // Valid bogie
            Bogie b1 = new Bogie("Sleeper", 72);
            System.out.println("Created Bogie: " + b1.name + " -> " + b1.capacity);

            // Invalid bogie
            Bogie b2 = new Bogie("AC Chair", 0); // ❌ triggers exception

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nUC14 exception handling completed...");
    }
}