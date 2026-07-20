import java.util.*;

public class Scenario6_MergeSortedLogs {
    public static class LogEntry {
        public int timestamp;
        public String message;

        public LogEntry(int timestamp, String message) {
            this.timestamp = timestamp;
            this.message = message;
        }

        @Override
        public String toString() {
            return "[" + timestamp + "]: " + message;
        }
    }

    public static List<LogEntry> mergeKSortedLogs(List<List<LogEntry>> sources) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
            (a, b) -> sources.get(a[0]).get(a[1]).timestamp -
                      sources.get(b[0]).get(b[1]).timestamp
        );
        for (int i = 0; i < sources.size(); i++) {
            if (!sources.get(i).isEmpty()) {
                minHeap.offer(new int[]{i, 0}); // {sourceIndex, elementIndex}
            }
        }
        List<LogEntry> merged = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            int[] top = minHeap.poll();
            int sourceIdx = top[0], elemIdx = top[1];
            merged.add(sources.get(sourceIdx).get(elemIdx));
            if (elemIdx + 1 < sources.get(sourceIdx).size()) {
                minHeap.offer(new int[]{sourceIdx, elemIdx + 1});
            }
        }
        return merged;
    }

    public static void main(String[] args) {
        List<LogEntry> server1 = Arrays.asList(
            new LogEntry(10, "Server 1 Started"),
            new LogEntry(30, "Server 1 processed request A")
        );
        List<LogEntry> server2 = Arrays.asList(
            new LogEntry(15, "Server 2 Started"),
            new LogEntry(25, "Server 2 database connected"),
            new LogEntry(40, "Server 2 received request B")
        );
        List<LogEntry> server3 = Arrays.asList(
            new LogEntry(5, "DNS resolved"),
            new LogEntry(50, "Maintenance script completed")
        );

        List<List<LogEntry>> logs = Arrays.asList(server1, server2, server3);
        List<LogEntry> mergedTimeline = mergeKSortedLogs(logs);

        System.out.println("Merged Log Timeline:");
        for (LogEntry entry : mergedTimeline) {
            System.out.println(entry);
        }
    }
}
