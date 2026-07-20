import java.util.*;

public class Scenario5_CategorizingSupportTickets {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars); // canonical signature
            groups.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(groups.values());
    }

    public static void main(String[] args) {
        String[] tickets = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println("Support Tickets (Anagrams): " + Arrays.toString(tickets));
        System.out.println("Grouped Tickets: " + groupAnagrams(tickets));
    }
}
