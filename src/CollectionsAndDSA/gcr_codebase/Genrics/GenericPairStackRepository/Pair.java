package Genrics.GenericPairStackRepository;

public class Pair<T, U> {

    T first;
    U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public void display() {
        System.out.println(first + " " + second);
    }
}