package com.nick.linkedlist;
/**
 * @author Nick Wilson
 * @version 12.5.17
 *
 * LinkedList.java Class models a singly linkedlist of Nodes.
 */


public class LinkedList {

    /* the start of the list, first node */
    private Node head;

    /* how many nodes are in the list */
    private int size;


    /* Constructor for the class, it initializes the classes fields */
    public LinkedList() {
        head = null;
        size = 0;
    }

    /* This method returns an int representing the size of the linkedlist */
    public int getSize() {
        return size;
    }

    /* This method adds a node to the linkedlist.
     * @param node type Node that will be added to the end of the linkedlist */
    public void addNode(Node node) {
        // two possibilities list is empty or not
        // empty list
        if (size == 0) {
            head = node;
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(node);
        }
        size++;
    }

    /* Method removes the first node of the linkedlist. */
    public void removeHead() {
        head = head.getNext();
        size--;
    }

    public String toString() {
        String str = "Size of LinkedList is " + size + "\n";
        Node temp = head;
        str += temp.getData() + ", ";
        while (temp.getNext() != null) {
            temp = temp.getNext();
            str += temp.getData();
        }
        return str;
    }

    /* Method returns a boolean that is true if the linkedlist is empty and
     * false if the linkedlist contains at least one node.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    public Node getHead() {
        return head;
    }
}
