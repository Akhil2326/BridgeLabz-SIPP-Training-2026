import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Scenario4_SlidingWindowMaximum {
    public static int[] maxThroughputWindow(int[] readings, int k) {
        if (readings == null || readings.length == 0 || k <= 0) {
            return new int[0];
        }
        int n = readings.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new ArrayDeque<>(); // indices, decreasing values front-to-back
        
        for (int i = 0; i < n; i++) {
            // Remove indices that are out of the k-second trailing window
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }
            // Remove indices whose values are less than or equal to the current reading
            while (!deque.isEmpty() && readings[deque.peekLast()] <= readings[i]) {
                deque.pollLast();
            }
            // Add current element's index
            deque.offerLast(i);
            // Record maximum for valid windows
            if (i >= k - 1) {
                result[i - k + 1] = readings[deque.peekFirst()];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] readings = {12, 1, 78, 90, 57, 89, 56};
        int k = 3;
        int[] result = maxThroughputWindow(readings, k);
        System.out.println("Throughput readings: " + Arrays.toString(readings));
        System.out.println("Max in trailing " + k + "-second windows: " + Arrays.toString(result)); 
        // Expected: [78, 90, 90, 90, 89]
    }
}
