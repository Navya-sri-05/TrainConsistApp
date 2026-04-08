import java.util.*;
import java.util.stream.*;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("UC12 - Safety Compliance Check for Goods Bogies");
        System.out.println("==============================================\n");

        // Step 1: Create goods bogies (type + cargo)
        List<Map.Entry<String, String>> bogies = new ArrayList<>();

        bogies.add(new AbstractMap.SimpleEntry<>("Cylindrical", "Petroleum"));
        bogies.add(new AbstractMap.SimpleEntry<>("Open", "Coal"));
        bogies.add(new AbstractMap.SimpleEntry<>("Box", "Grain"));
        bogies.add(new AbstractMap.SimpleEntry<>("Cylindrical", "Coal")); // ❌ invalid

        // Step 2: Print bogies
        System.out.println("Goods Bogies in Train:");
        for (Map.Entry<String, String> b : bogies) {
            System.out.println(b.getKey() + " -> " + b.getValue());
        }

        // Step 3: Safety validation using allMatch
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.getKey().equals("Cylindrical") ||
                                b.getValue().equals("Petroleum")
                );

        // Step 4: Output result
        System.out.println("\nSafety Compliance Status: " + isSafe);

        if (isSafe) {
            System.out.println("Train formation is SAFE.");
        } else {
            System.out.println("Train formation is NOT SAFE.");
        }

        System.out.println("\nUC12 safety validation completed...");
    }
}