package com.bridgelabz;
public class Stack {
    private Node top;
    public Stack() {
        this.top = null;
    }
    public boolean isEmpty() {
        return top == null;
    }
    public void push(int data) {
        Node newNode = new Node(data); // create a new Node with the given data
        if (isEmpty()) { // if the stack is empty
            top = newNode; // make the new Node the top of the stack
        } else {
            newNode.next = top; // set the new Node's next pointer to the current top of the stack
            top = newNode; // make the new Node the top of the stack
        }
    }

    public int pop() {
        if (isEmpty()) { // if the stack is empty
            return -1; // return an error value (or throw an exception)
        } else {
            int popped = top.data; // save the data of the current top of the stack
            top = top.next; // make the next Node the new top of the stack
            return popped; // return the saved data
        }
    }

    public int peek() {
        if (isEmpty()) { // if the stack is empty
            return -1; // return an error value (or throw an exception)
        } else {
            return top.data; // return the data of the current top of the stack
        }
    }
}