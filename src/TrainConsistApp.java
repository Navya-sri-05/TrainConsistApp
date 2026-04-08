import java.util.*;
import java.util.stream.Collectors;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("UC8 - Filter Passenger Bogies Using Streams");
        System.out.println("===========================================\n");

        // Step 1: Create list of bogies (name + capacity)
        Map<String, Integer> bogies = new LinkedHashMap<>();
        bogies.put("Sleeper", 72);
        bogies.put("AC Chair", 56);
        bogies.put("First Class", 24);
        bogies.put("General", 90);

        // Step 2: Display all bogies
        System.out.println("All Bogies:");
        bogies.forEach((name, capacity) ->
                System.out.println(name + " -> " + capacity));

        // Step 3: Filter using Stream (capacity > 60)
        List<Map.Entry<String, Integer>> filtered =
                bogies.entrySet()
                        .stream()
                        .filter(entry -> entry.getValue() > 60)
                        .collect(Collectors.toList());

        // Step 4: Display filtered bogies
        System.out.println("\nFiltered Bogies (Capacity > 60):");
        filtered.forEach(entry ->
                System.out.println(entry.getKey() + " -> " + entry.getValue()));

        System.out.println("\nUC8 filtering completed...");
    }
}