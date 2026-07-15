package Genrics.GenericPairStackRepository;

import java.util.Arrays;
import java.util.List;

public class MainG {

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Apeksha", 21);
        pair.display();
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        System.out.println("Popped : " + stack.pop());

        stack.display();
        Integer[] arr = {10, 25, 8, 90, 15};
        System.out.println("Maximum = " + Utility.findMax(arr));

        Repository<String> repo = new Repository<>();
        repo.add("Java");
        repo.add("Python");

        repo.display();

        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<String> list2 = Arrays.asList("A", "B", "C");
        Utility.printList(list1);
        Utility.printList(list2);
    }
}
