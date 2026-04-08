import java.util.Arrays;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("UC17 - Sort Bogie Names Using Arrays.sort()");
        System.out.println("============================================\n");

        // Step 1: Create array
        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        // Step 2: Print original
        System.out.println("Original Bogie Names:");
        System.out.println(Arrays.toString(bogieNames));

        System.out.println();

        // Step 3: Sort using Arrays.sort()
        Arrays.sort(bogieNames);

        // Step 4: Print sorted
        System.out.println("Sorted Bogie Names (Alphabetical):");
        System.out.println(Arrays.toString(bogieNames));

        System.out.println("\nUC17 sorting completed...");
    }
}