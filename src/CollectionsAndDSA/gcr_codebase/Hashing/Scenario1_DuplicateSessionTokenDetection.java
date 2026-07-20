import java.util.*;

public class Scenario1_DuplicateSessionTokenDetection {
    public static boolean hasDuplicateToken(String[] tokens) {
        Set<String> seen = new HashSet<>();
        for (String token : tokens) {
            if (!seen.add(token)) { // add() returns false if already present
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] tokens1 = {"token1", "token2", "token3", "token1"};
        String[] tokens2 = {"tokenA", "tokenB", "tokenC"};
        System.out.println("Tokens: " + Arrays.toString(tokens1) + " -> Has Duplicate? " + hasDuplicateToken(tokens1));
        System.out.println("Tokens: " + Arrays.toString(tokens2) + " -> Has Duplicate? " + hasDuplicateToken(tokens2));
    }
}
