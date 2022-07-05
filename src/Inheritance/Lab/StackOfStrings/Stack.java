package Inheritance.Lab.StackOfStrings;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Stack {
    private ArrayList<String> data;

    public Stack() {
        this.data = new ArrayList<>();
    }

    public void push(String e) {
        data.add(e);
    }

    public String pop() {
        return data.remove(data.size() - 1);
    }

    public String peek() {
        return data.get(data.size() - 1);
    }
}
