import java.util.*;
import java.util.stream.Collectors;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("UC9 - Group Bogies by Type");
        System.out.println("=================================\n");

        // Step 1: Create list (name + capacity)
        List<Map.Entry<String, Integer>> bogies = new ArrayList<>();

        bogies.add(new AbstractMap.SimpleEntry<>("Sleeper", 72));
        bogies.add(new AbstractMap.SimpleEntry<>("AC Chair", 56));
        bogies.add(new AbstractMap.SimpleEntry<>("First Class", 24));
        bogies.add(new AbstractMap.SimpleEntry<>("Sleeper", 70));
        bogies.add(new AbstractMap.SimpleEntry<>("AC Chair", 60));

        // Step 2: Print all bogies
        System.out.println("All Bogies:");
        for (Map.Entry<String, Integer> b : bogies) {
            System.out.println(b.getKey() + " -> " + b.getValue());
        }

        // Step 3: Group using Streams
        Map<String, List<Map.Entry<String, Integer>>> grouped =
                bogies.stream()
                        .collect(Collectors.groupingBy(Map.Entry::getKey));

        // Step 4: Print grouped output
        System.out.println("\nGrouped Bogies:\n");

        for (String type : grouped.keySet()) {
            System.out.println("Bogie Type: " + type);

            for (Map.Entry<String, Integer> b : grouped.get(type)) {
                System.out.println("Capacity -> " + b.getValue());
            }

            System.out.println();
        }

        System.out.println("UC9 grouping completed...");
    }
}