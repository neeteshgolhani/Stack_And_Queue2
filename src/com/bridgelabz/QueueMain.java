package com.bridgelabz;

public class QueueMain {
    public static void main(String[] args) {
        Queue queue = new Queue(); // create a new queue
        queue.enqueue(56); // enqueue three elements onto the queue
        queue.enqueue(30);
        queue.enqueue(70);

        System.out.println("Print The Value Of Front Element Is ");
        System.out.println(queue.peek());
        while (!queue.isEmpty()) { // dequeue elements until the queue is empty
            System.out.println(queue.dequeue());
        }
    }
}