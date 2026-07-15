import java.util.ArrayDeque;
import java.util.Deque;

public class Scenario2_Deque {
    private Deque<Integer> printQueue = new ArrayDeque<>();

    public void submitJob(int jobId) {
        printQueue.addLast(jobId); // normal job: joins the back of the line
    }

    public void submitUrgentJob(int jobId) {
        printQueue.addFirst(jobId); // urgent job: jumps to the front
    }

    public int printNextJob() {
        if (printQueue.isEmpty()) {
            throw new RuntimeException("No print jobs waiting");
        }
        return printQueue.removeFirst(); // printer always takes from the front
    }

    public boolean isEmpty() {
        return printQueue.isEmpty();
    }

    public static void main(String[] args) {
        Scenario2_Deque printServer = new Scenario2_Deque();
        printServer.submitJob(1001); // Normal job
        printServer.submitJob(1002); // Normal job
        printServer.submitUrgentJob(9999); // Urgent job
        
        System.out.println("Processing next job: " + printServer.printNextJob()); // Expected: 9999 (Urgent)
        System.out.println("Processing next job: " + printServer.printNextJob()); // Expected: 1001
        System.out.println("Processing next job: " + printServer.printNextJob()); // Expected: 1002
    }
}
