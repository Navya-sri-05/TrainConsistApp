import java.util.*;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("UC7 - Sort Bogies by Capacity (Comparator)");
        System.out.println("===========================================\n");

        // Step 1: Create HashMap (Bogie → Capacity)
        Map<String, Integer> bogies = new HashMap<>();
        bogies.put("Sleeper", 72);
        bogies.put("AC Chair", 56);
        bogies.put("First Class", 24);
        bogies.put("General", 90);

        // Step 2: Print before sorting
        System.out.println("Before Sorting:");
        for (Map.Entry<String, Integer> entry : bogies.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Step 3: Convert to List for sorting
        List<Map.Entry<String, Integer>> list = new ArrayList<>(bogies.entrySet());

        // Step 4: Sort using Comparator (by value)
        list.sort(Comparator.comparingInt(Map.Entry::getValue));

        // Step 5: Print after sorting
        System.out.println("\nAfter Sorting by Capacity:");
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nUC7 sorting completed...");
    }
}