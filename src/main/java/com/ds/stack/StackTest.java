package com.ds.stack;

public class StackTest {


    public static void main(String[] args) {
        Stack stack  = new Stack();
        stack.push("Anderson1");
        stack.push("Anderson2");
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);
    }
}
