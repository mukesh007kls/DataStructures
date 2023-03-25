package org.example;

public class UnorderedList<T extends Comparable<T>> {
    private Node<T> head;
    private Node<T> tail;

    public UnorderedList(){
        head=null;
        tail=null;
    }

    public void add(T word) {
        Node<T> node=new Node<>(word);
        if (head==null){
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        tail=node;
    }

    public boolean search(T word) {
        if (head==null) return false;
        for (Node<T> c=head;c!=null;c=c.next){
            if (c.data.equals(word)) return true;
        }
        return false;
    }

    public void remove(T word) {
        if (head==null) return;
        if (head.data.equals(word)){
            head=null;
            return;
        }
        for (Node<T> c=head;c.next!=null;c=c.next){
            c.next=c.next.next;
        }
    }

    @Override
    public String toString() {
        if (head==null) return "null";
        StringBuilder stringBuilder=new StringBuilder();
        for (Node<T> c=head;c!=null;c=c.next){
            stringBuilder.append(c.data).append("->");
        }
        stringBuilder.append("null");
        return stringBuilder.toString();
    }
}
