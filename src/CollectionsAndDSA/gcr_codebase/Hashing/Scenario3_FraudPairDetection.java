import java.util.*;

public class Scenario3_FraudPairDetection {
    public static int[] findFraudPair(int[] amounts, int target) {
        Map<Integer, Integer> seen = new HashMap<>(); // amount -> index
        for (int i = 0; i < amounts.length; i++) {
            int complement = target - amounts[i];
            if (seen.containsKey(complement)) {
                return new int[]{seen.get(complement), i};
            }
            seen.put(amounts[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] amounts = {1000, 4500, 3000, 5000, 7000};
        int target = 8000;
        int[] result = findFraudPair(amounts, target);
        System.out.println("Amounts: " + Arrays.toString(amounts) + ", Target: " + target);
        System.out.println("Fraud Pair Indices: " + Arrays.toString(result));
    }
}
