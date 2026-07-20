import java.util.*;

public class Scenario5_AdmissionScoreCutoff {
    public static int findKthLargest(int[] scores, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int score : scores) {
            if (minHeap.size() < k) {
                minHeap.offer(score);
            } else if (score > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(score);
            }
        }
        return minHeap.peek(); // the k-th largest, after processing everything
    }

    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 88, 95, 90, 81};
        int k = 3;
        System.out.println("Applicant scores: " + Arrays.toString(scores));
        System.out.println(k + "-th largest score (Cutoff): " + findKthLargest(scores, k));
    }
}
