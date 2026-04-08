import java.util.ArrayList;
import java.util.List;

public class TrainConsistApp {




        public static void main(String[] args) {
            // 1. Print a welcome message
            System.out.println("=== Train Consist Management App ===");

            // 2. Initialize an empty List using ArrayList to store bogies dynamically
            // We use the List interface for abstraction
            List<String> trainConsist = new ArrayList<>();

            System.out.println("\nTrain initialized successfully...");

            // 3. Display the initial bogie count using size() [cite: 1]
            System.out.println("Initial Bogie Count : " + trainConsist.size());

            // 4. Display the current state of the consist [cite: 1]
            System.out.println("Current Train Consist : " + trainConsist);
        }
    }

