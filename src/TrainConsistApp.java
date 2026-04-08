public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("UC16 - Manual Sorting using Bubble Sort");
        System.out.println("========================================\n");

        // Step 1: Create array
        int[] capacities = {72, 56, 24, 70, 60};

        // Step 2: Print original
        System.out.println("Original Capacities:");
        for (int c : capacities) {
            System.out.print(c + " ");
        }

        System.out.println("\n");

        // Step 3: Bubble Sort
        int n = capacities.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (capacities[j] > capacities[j + 1]) {
                    // swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        // Step 4: Print sorted
        System.out.println("Sorted Capacities (Ascending):");
        for (int c : capacities) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nUC16 sorting completed...");
    }
}