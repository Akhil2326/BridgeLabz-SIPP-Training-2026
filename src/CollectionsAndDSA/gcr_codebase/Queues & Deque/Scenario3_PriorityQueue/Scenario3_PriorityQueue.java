import java.util.PriorityQueue;

class Patient {
    int priority;
    String name;

    Patient(int priority, String name) {
        this.priority = priority;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Patient{name='" + name + "', priority=" + priority + "}";
    }
}

public class Scenario3_PriorityQueue {
    private PriorityQueue<Patient> triageQueue = new PriorityQueue<>((a, b) -> a.priority - b.priority); // min-heap by priority

    public void admitPatient(Patient p) {
        triageQueue.offer(p);
    }

    public Patient callNextPatient() {
        if (triageQueue.isEmpty()) {
            return null;
        }
        return triageQueue.poll(); // always the most urgent (lowest priority number)
    }

    public static void main(String[] args) {
        Scenario3_PriorityQueue er = new Scenario3_PriorityQueue();
        er.admitPatient(new Patient(3, "John Doe"));
        er.admitPatient(new Patient(1, "Jane Smith (Critical)"));
        er.admitPatient(new Patient(5, "Bob Johnson"));
        er.admitPatient(new Patient(2, "Alice Brown"));

        System.out.println("Serving next patient: " + er.callNextPatient()); // Expected: Jane Smith (priority 1)
        System.out.println("Serving next patient: " + er.callNextPatient()); // Expected: Alice Brown (priority 2)
        System.out.println("Serving next patient: " + er.callNextPatient()); // Expected: John Doe (priority 3)
    }
}
