package org.example.balancedParantheses;

public class Main {
    public static void main(String[] args) {
        String exp="(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
        MyStack<Character> stack=new MyStack<>();
        for (int i=0;i<exp.length();i++){
            if (stack.isEmpty()&&exp.charAt(i)==')'){
                System.out.println("not balanced");
                return;
            }
            if (exp.charAt(i)=='(') stack.push(exp.charAt(i));
            else if(exp.charAt(i)==')') stack.pop();
        }
        if (stack.isEmpty()) System.out.println("is balanced");
        else System.out.println("not balanced");
    }
}
