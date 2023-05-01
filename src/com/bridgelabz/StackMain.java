package com.bridgelabz;

public class StackMain {
    public static void main(String[] args) {
        Stack stack = new Stack(); // create a new Stack
        stack.push(70); // push 70 onto the stack
        stack.push(30); // push 30 onto the stack
        stack.push(56); // push 56 onto the stack
        while (!stack.isEmpty()) {
        System.out.println(stack.peek()); // print the value at the top of the stack (should be 56)
            stack.pop();
        }
    }
}