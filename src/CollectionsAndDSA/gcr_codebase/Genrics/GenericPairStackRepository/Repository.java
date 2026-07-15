package Genrics.GenericPairStackRepository;

import java.util.ArrayList;

public class Repository<T> {

    ArrayList<T> list = new ArrayList<>();

    public void add(T item) {
        list.add(item);
    }

    public void display() {
        System.out.println(list);
    }
}
