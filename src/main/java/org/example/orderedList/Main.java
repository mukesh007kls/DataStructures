package org.example.orderedList;


public class Main {
    public static void main(String[] args) {
        int[] numbers = {12, 21, 29, 2, 26, 30, 25};
        OrderedList<Integer> list = new OrderedList<>();
        for (Integer n : numbers) {
            list.add(n);
        }
        System.out.println(list);
        Integer n = 29;
        if (!list.search(n)) list.add(n);
        else list.remove(n);
        System.out.println(list);
    }
}
