public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("UC18 - Linear Search for Bogie ID");
        System.out.println("==================================\n");

        // Step 1: Array of Bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Step 2: Print all IDs
        System.out.println("Available Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        // Step 3: Search key
        String searchId = "BG309";

        System.out.println();

        // Step 4: Linear Search
        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                found = true;
                break; // stop early
            }
        }

        // Step 5: Result
        if (found) {
            System.out.println("Bogie " + searchId + " found in train consist.");
        } else {
            System.out.println("Bogie " + searchId + " NOT found.");
        }

        System.out.println("\nUC18 search completed...");
    }
}