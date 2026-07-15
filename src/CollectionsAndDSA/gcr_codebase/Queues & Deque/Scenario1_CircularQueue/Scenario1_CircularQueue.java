class PacketBuffer {
    private int[] data;
    private int front, count;

    PacketBuffer(int capacity) {
        data = new int[capacity];
        front = 0;
        count = 0;
    }

    boolean enqueue(int packetId) {
        if (count == data.length) return false; // buffer full: reject
        data[(front + count) % data.length] = packetId;
        count++;
        return true;
    }

    int dequeue() {
        if (count == 0) throw new RuntimeException("Buffer empty");
        int val = data[front];
        front = (front + 1) % data.length;
        count--;
        return val;
    }
}

public class Scenario1_CircularQueue {
    public static void main(String[] args) {
        PacketBuffer buffer = new PacketBuffer(3);
        System.out.println("Enqueue 101: " + buffer.enqueue(101));
        System.out.println("Enqueue 102: " + buffer.enqueue(102));
        System.out.println("Enqueue 103: " + buffer.enqueue(103));
        System.out.println("Enqueue 104 (should fail): " + buffer.enqueue(104));
        System.out.println("Dequeued: " + buffer.dequeue());
        System.out.println("Enqueue 104 (should succeed now): " + buffer.enqueue(104));
    }
}
