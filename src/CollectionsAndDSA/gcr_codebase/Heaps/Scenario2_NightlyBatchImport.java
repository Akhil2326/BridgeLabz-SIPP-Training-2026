import java.util.*;

public class Scenario2_NightlyBatchImport {
    public static void buildHeap(int[] priorities) {
        int n = priorities.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            siftDown(priorities, i, n);
        }
    }

    public static void siftDown(int[] arr, int i, int size) {
        int smallest = i;
        int left = 2 * i + 1, right = 2 * i + 2;
        if (left < size && arr[left] < arr[smallest]) smallest = left;
        if (right < size && arr[right] < arr[smallest]) smallest = right;
        if (smallest != i) {
            int tmp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = tmp;
            siftDown(arr, smallest, size);
        }
    }

    public static void main(String[] args) {
        int[] priorities = {15, 20, 10, 8, 30, 5};
        System.out.println("Original array: " + Arrays.toString(priorities));
        buildHeap(priorities);
        System.out.println("After heapification (Min-Heap): " + Arrays.toString(priorities));
    }
}
