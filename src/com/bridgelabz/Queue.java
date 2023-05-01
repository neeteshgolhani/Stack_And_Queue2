package com.bridgelabz;

public class Queue {
    private Node front; // head of the queue
    private Node rear; // tail of the queue

    public Queue() {
        this.front = null; // initialize front and rear to null
        this.rear = null;
    }

    public boolean isEmpty() {
        return front == null; // return true if front is null (i.e., queue is empty)
    }

    public void enqueue(int data) {
        Node newNode = new Node(data); // create a new node with the given data
        if (isEmpty()) { // if the queue is empty
            front = newNode; // set both front and rear to the new node
            rear = newNode;
        } else { // if the queue is not empty
            rear.next = newNode; // add the new node to the end of the queue
            rear = newNode; // set the new node as the new rear
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            return -1; // or throw an exception if the queue is empty
        } else {
            int dequeued = front.data; // store the value of the front node
            front = front.next; // move the front pointer to the next node
            if (front == null) { // if front becomes null, the queue is now empty
                rear = null; // set rear to null as well
            }
            return dequeued; // return the value of the dequeued node
        }
    }

    public int peek() {
        if (isEmpty()) {
            return -1; // or throw an exception if the queue is empty
        } else {
            return front.data; // return the value of the front node
        }
    }
}
