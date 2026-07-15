package Genrics.GenericPairStackRepository;

import java.util.List;

public class Utility {

    // Generic Method
    public static <T extends Comparable<T>> T findMax(T[] arr) {

        T max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }

        return max;
    }

    // Wildcard Method
    public static void printList(List<?> list) {

        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
