package org.example.orderedList;

import org.example.Node;

public class OrderedList<T extends Comparable<T>> {
    private Node<T> head;
    private Node<T> tail;

    public OrderedList() {
        head = null;
        tail = null;
    }

    public void add(T data) {
        Node<T> node = new Node<>(data);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        if (data.compareTo(head.data) <= 0) {
            node.next = head;
            head = node;
            return;
        }
        if (data.compareTo(tail.data) > 0) {
            tail.next = node;
            tail = tail.next;
            return;
        }
        for (Node<T> c = head; c.next != null; c = c.next) {
            if (data.compareTo(c.next.data) <= 0) {
                node.next = c.next;
                c.next = node;
                break;
            }
        }
    }

    public boolean search(T n) {
        if (head == null) return false;
        for (Node<T> c = head; c != null; c = c.next) {
            if (c.data.equals(n)) return true;
        }
        return false;
    }

    public void remove(T n) {
        if (head == null) return;
        if (head.data.equals(n)) {
            head = null;
            return;
        }
        for (Node<T> c = head; c.next != null; c = c.next) {
            if (c.next.data.equals(n)) c.next = c.next.next;
        }
    }
    @Override
    public String toString(){
        if(head==null) return "Null";
        StringBuilder stringBuilder=new StringBuilder();
        for (Node<T> c=head;c!=null;c=c.next){
            stringBuilder.append(c.data).append("->");
        }
        stringBuilder.append("null");
        return stringBuilder.toString();
    }
}
