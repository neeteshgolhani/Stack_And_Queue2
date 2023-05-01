package com.bridgelabz;
/*In this implementation, we first define a Node class to represent a single node in the linked list.
Then we define the Stack class which has a top attribute to keep track of the top node in the stack.

The isEmpty method checks whether the stack is empty by checking if the top attribute is null.

The push method takes a new data value and creates a new Node object to represent it. If the stack is empty,
we set the top attribute to this new node. Otherwise, we set the next attribute of
the new node to the current top node, and then set the top attribute to the new node.
This effectively adds the new node to the top of the stack.

The pop method removes the top node from the stack and returns its data value. If the stack is empty,
it returns -1 (or throws an exception).

The peek method returns the data value of the top node without removing it. If the stack is empty,
it returns -1 (or throws an exception).

Finally, we create a new stack object and use the push method to add the values 70, 30, and 56 in that order.
We then use the peek method to check that the top value of the stack is indeed 56.*/
public class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
