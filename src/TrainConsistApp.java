import java.util.HashSet;
import java.util.Set;

public class TrainConsistApp {
    public static void main(String[] args) {
        // Create a HashSet for unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        System.out.println("--- Train Consist Management System ---");
        System.out.println("Scenario: Adding Bogie IDs to the Train (UC3)");

        // Adding unique and duplicate bogie IDs
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG101"); // Duplicate - will be ignored
        bogieIds.add("BG103");
        bogieIds.add("BG102"); // Duplicate - will be ignored

        // Display the final set of unique bogie IDs
        System.out.println("\nFinal List of Unique Bogie IDs:");
        System.out.println(bogieIds);

        // Verification logic
        System.out.println("\nNotice: Duplicate IDs like 'BG101' and 'BG102' were automatically removed.");
        System.out.println("Total Unique Bogies: " + bogieIds.size());
    }
}