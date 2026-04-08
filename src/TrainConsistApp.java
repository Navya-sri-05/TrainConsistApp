public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("UC20 - Exception Handling During Search");
        System.out.println("========================================\n");

        // Step 1: Empty array (test case)
        String[] bogieIds = {};

        String searchId = "BG101";

        // Step 2: Fail-fast validation
        if (bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available in train. Cannot perform search.");
        }

        // Step 3: (Will not execute if empty)
        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Bogie found.");
        } else {
            System.out.println("Bogie NOT found.");
        }
    }
}