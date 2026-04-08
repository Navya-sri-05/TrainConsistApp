import java.util.LinkedHashSet;
import java.util.Set;

/**
 * UC5: Preserve Insertion Order of Bogies (LinkedHashSet)
 * This class simulates a train consist management system where
 * bogies are added in order and uniqueness is enforced.
 */
public class TrainConsistApp {
    public static void main(String[] args) {
        // Create a LinkedHashSet to represent the train formation
        // Key Concept: Maintains insertion order while enforcing uniqueness
        Set<String> trainFormation = new LinkedHashSet<>();

        System.out.println("--- Attaching Bogies to the Train ---");

        // 1. Attach bogies in sequence
        attachBogie(trainFormation, "Engine");
        attachBogie(trainFormation, "Sleeper");
        attachBogie(trainFormation, "Cargo");
        attachBogie(trainFormation, "Guard");

        // 2. Attempt to attach a duplicate bogie intentionally
        System.out.println("\nAttempting to re-attach duplicate: Sleeper...");
        attachBogie(trainFormation, "Sleeper");

        // 3. Display the final formation order
        System.out.println("\nFinal Train Formation (Preserving Insertion Order):");
        System.out.println(trainFormation);

        // Detailed Iteration to show order preservation [cite: 1]
        int position = 1;
        for (String bogie : trainFormation) {
            System.out.println("Position " + position + ": " + bogie);
            position++;
        }
    }

    /**
     * Helper method to add a bogie and provide feedback
     */
    private static void attachBogie(Set<String> formation, String bogie) {
        if (formation.add(bogie)) {
            System.out.println("Successfully attached: " + bogie);
        } else {
            System.out.println("Failed to attach: " + bogie + " (Duplicate detected and ignored)");
        }
    }
}