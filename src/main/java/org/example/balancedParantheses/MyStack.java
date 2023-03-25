package org.example.balancedParantheses;

import org.example.unorderedList.UnorderedList;

public class MyStack<T extends Comparable<T>> {
    private final UnorderedList<T> list;

    public MyStack() {
        list=new UnorderedList<>();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void push(T charAt) {
        list.push(charAt);
    }

    public void pop() {
        list.pop();
    }
}
