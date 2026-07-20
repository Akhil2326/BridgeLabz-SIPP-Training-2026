import java.util.*;

public class Scenario4_RollingRevenueWindowMatching {
    public static int subarraySumEqualsK(int[] revenueChanges, int k) {
        Map<Integer, Integer> prefixCount = new HashMap<>();
        prefixCount.put(0, 1);

        int runningSum = 0, answer = 0;
        for (int change : revenueChanges) {
            runningSum += change;
            answer += prefixCount.getOrDefault(runningSum - k, 0);
            prefixCount.merge(runningSum, 1, Integer::sum);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] revenueChanges = {10, -5, 5, 0, 5};
        int k = 5;
        System.out.println("Revenue Changes: " + Arrays.toString(revenueChanges) + ", Target Sum: " + k);
        System.out.println("Number of sub-arrays: " + subarraySumEqualsK(revenueChanges, k));
    }
}
