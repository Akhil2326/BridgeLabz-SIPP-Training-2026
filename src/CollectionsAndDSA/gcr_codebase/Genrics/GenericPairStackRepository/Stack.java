package Genrics.GenericPairStackRepository;

import java.util.ArrayList;

public class Stack<T> {

    ArrayList<T> stack = new ArrayList<>();

    public void push(T item) {
        stack.add(item);
    }

    public T pop() {
        return stack.remove(stack.size() - 1);
    }

    public void display() {
        System.out.println(stack);
    }
}
