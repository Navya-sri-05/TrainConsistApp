import java.util.*;
import java.util.stream.Collectors;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("UC13 - Performance Comparison (Loops vs Streams)");
        System.out.println("================================================\n");

        // Step 1: Create large dataset
        List<Map.Entry<String, Integer>> bogies = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            bogies.add(new AbstractMap.SimpleEntry<>("Sleeper", 72));
            bogies.add(new AbstractMap.SimpleEntry<>("AC Chair", 56));
            bogies.add(new AbstractMap.SimpleEntry<>("First Class", 24));
            bogies.add(new AbstractMap.SimpleEntry<>("General", 90));
        }

        // ---------------- LOOP ----------------
        long startLoop = System.nanoTime();

        List<Map.Entry<String, Integer>> loopResult = new ArrayList<>();
        for (Map.Entry<String, Integer> b : bogies) {
            if (b.getValue() > 60) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // ---------------- STREAM ----------------
        long startStream = System.nanoTime();

        List<Map.Entry<String, Integer>> streamResult =
                bogies.stream()
                        .filter(b -> b.getValue() > 60)
                        .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // Output
        System.out.println("Loop Execution Time (ns): " + loopTime);
        System.out.println("Stream Execution Time (ns): " + streamTime);

        System.out.println("\nUC13 performance benchmarking completed...");
    }
}