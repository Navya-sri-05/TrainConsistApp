import java.util.regex.*;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("UC11 - Validate Train ID & Cargo Codes");
        System.out.println("========================================\n");

        // Sample inputs (you can change to test)
        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        // Regex patterns
        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        // Compile patterns
        Pattern trainRegex = Pattern.compile(trainPattern);
        Pattern cargoRegex = Pattern.compile(cargoPattern);

        // Create matchers
        Matcher trainMatcher = trainRegex.matcher(trainId);
        Matcher cargoMatcher = cargoRegex.matcher(cargoCode);

        // Validate using matches()
        boolean isTrainValid = trainMatcher.matches();
        boolean isCargoValid = cargoMatcher.matches();

        // Output
        System.out.println("Train ID: " + trainId);
        System.out.println("Is Train ID Valid? : " + isTrainValid);

        System.out.println("\nCargo Code: " + cargoCode);
        System.out.println("Is Cargo Code Valid? : " + isCargoValid);

        System.out.println("\nUC11 validation completed...");
    }
}