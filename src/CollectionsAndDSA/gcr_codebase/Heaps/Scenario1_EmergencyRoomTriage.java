import java.util.*;

public class Scenario1_EmergencyRoomTriage {
    public static class Patient {
        public String name;
        public int severity;

        public Patient(String name, int severity) {
            this.name = name;
            this.severity = severity;
        }

        @Override
        public String toString() {
            return name + "(severity: " + severity + ")";
        }
    }

    private static PriorityQueue<Patient> triageQueue =
        new PriorityQueue<>((a, b) -> b.severity - a.severity); // max-heap by severity

    public static void addPatient(Patient p) {
        triageQueue.offer(p); // O(log n)
    }

    public static Patient treatNext() {
        return triageQueue.poll(); // O(log n) — always the most severe
    }

    public static void main(String[] args) {
        addPatient(new Patient("Alice", 3));
        addPatient(new Patient("Bob", 8));
        addPatient(new Patient("Charlie", 5));

        System.out.println("Treating next patient: " + treatNext());
        System.out.println("Treating next patient: " + treatNext());
        addPatient(new Patient("David", 10));
        System.out.println("Treating next patient: " + treatNext());
        System.out.println("Treating next patient: " + treatNext());
    }
}
