import java.util.*;
import java.util.stream.Collectors;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("UC10 - Count Total Seats in Train");
        System.out.println("====================================\n");

        // Step 1: Create list
        List<Map.Entry<String, Integer>> bogies = new ArrayList<>();

        bogies.add(new AbstractMap.SimpleEntry<>("Sleeper", 72));
        bogies.add(new AbstractMap.SimpleEntry<>("AC Chair", 56));
        bogies.add(new AbstractMap.SimpleEntry<>("First Class", 24));
        bogies.add(new AbstractMap.SimpleEntry<>("Sleeper", 70));

        // Step 2: Print bogies
        System.out.println("Bogies in Train:");
        for (Map.Entry<String, Integer> b : bogies) {
            System.out.println(b.getKey() + " -> " + b.getValue());
        }

        // Step 3: Calculate total using map + reduce
        int totalSeats = bogies.stream()
                .map(entry -> entry.getValue())   // extract capacity
                .reduce(0, Integer::sum);        // sum all values

        // Step 4: Print result
        System.out.println("\nTotal Seating Capacity of Train: " + totalSeats);

        System.out.println("\nUC10 aggregation completed...");
    }
}