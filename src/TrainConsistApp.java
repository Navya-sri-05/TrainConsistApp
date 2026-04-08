import java.util.TreeSet;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("UC4 - Maintain Ordered Bogie IDs");
        System.out.println("=================================\n");

        TreeSet<String> bogies = new TreeSet<>();

        bogies.add("B3");
        bogies.add("B1");
        bogies.add("B2");
        bogies.add("B1"); // duplicate (ignored)

        System.out.println("Bogie IDs after adding (Sorted & Unique):");
        System.out.println(bogies + "\n");

        System.out.println("First Bogie: " + bogies.first());
        System.out.println("Last Bogie: " + bogies.last());

        System.out.println("\nUC4 operations completed successfully...");
    }
}