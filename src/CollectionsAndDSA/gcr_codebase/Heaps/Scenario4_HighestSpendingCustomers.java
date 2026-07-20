import java.util.*;

public class Scenario4_HighestSpendingCustomers {
    public static List<Integer> topKLargest(int[] transactions, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int amount : transactions) {
            if (minHeap.size() < k) {
                minHeap.offer(amount);
            } else if (amount > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(amount);
            }
        }
        return new ArrayList<>(minHeap);
    }

    public static void main(String[] args) {
        int[] transactions = {120, 50, 800, 450, 1000, 300, 2000};
        int k = 3;
        System.out.println("Transactions: " + Arrays.toString(transactions));
        System.out.println("Top " + k + " Transactions: " + topKLargest(transactions, k));
    }
}
