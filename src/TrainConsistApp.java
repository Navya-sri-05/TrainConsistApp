import java.util.HashMap;
import java.util.Map;

public class TrainConsistApp {
    public static void main(String[] args) {
        // 1. Create a HashMap to store bogie-capacity information
        // Key: Bogie Name (String), Value: Capacity (Integer)
        HashMap<String, Integer> bogieCapacities = new HashMap<>();

        // 2 & 3. Insert capacity values using the put() method
        bogieCapacities.put("Sleeper", 72);
        bogieCapacities.put("AC Chair", 56);
        bogieCapacities.put("First Class", 24);
        bogieCapacities.put("Rectangular Goods", 100); // Example load capacity
        bogieCapacities.put("Cylindrical Goods", 80);

        System.out.println("--- Bogie to Capacity Mapping ---");

        // 4 & 5. Iterate through the map using entrySet() to display details
        for (Map.Entry<String, Integer> entry : bogieCapacities.entrySet()) {
            String bogieName = entry.getKey();
            Integer capacity = entry.getValue();
            System.out.println("Bogie: " + bogieName + " | Capacity: " + capacity);
        }

        // 6. Fast Lookup Example (Demonstrating Key Benefit)
        String searchBogie = "Sleeper";
        if (bogieCapacities.containsKey(searchBogie)) {
            System.out.println("\nFast Lookup: The capacity of " + searchBogie +
                    " is " + bogieCapacities.get(searchBogie) + " seats.");
        }
    }
}