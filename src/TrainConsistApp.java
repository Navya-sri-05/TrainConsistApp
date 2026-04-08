import java.util.Arrays;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("UC19 - Binary Search for Bogie ID");
        System.out.println("==================================\n");

        // Step 1: Create array (can be unsorted)
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Step 2: Sort array (IMPORTANT for binary search)
        Arrays.sort(bogieIds);

        // Step 3: Print sorted IDs
        System.out.println("Sorted Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        System.out.println();

        // Step 4: Search key
        String searchId = "BG309";

        // Step 5: Binary Search
        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = searchId.compareTo(bogieIds[mid]);

            if (result == 0) {
                found = true;
                break;
            } else if (result < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        // Step 6: Output
        if (found) {
            System.out.println("Bogie " + searchId + " found using Binary Search.");
        } else {
            System.out.println("Bogie " + searchId + " NOT found.");
        }

        System.out.println("\nUC19 search completed...");
    }
}