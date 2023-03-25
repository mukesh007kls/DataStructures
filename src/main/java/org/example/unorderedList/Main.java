package org.example.unorderedList;

public class Main {
    public static void main(String[] args) {
        String sentence="Hello im klsa nice to meet you";
        String[] words=sentence.split(" ");
        UnorderedList<String> list=new  UnorderedList<>();
        for (String word:words){
            list.add(word);
        }
        System.out.println(list);
        String word="nice";
        if ((!list.search(word))) {
            list.add(word);
        } else {
            list.remove(word);
        }
        System.out.println(list);
    }
}