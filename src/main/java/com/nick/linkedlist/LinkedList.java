package com.nick.linkedlist;
/**
 * @author Nick Wilson
 * @version 12.5.17
 *
 * LinkedList.java Class models a singly linkedlist of Nodes.
 */


public class LinkedList {

    private Node head;

    private int size;


    public LinkedList() {
        head = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

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

    public boolean isEmpty() {
        return size == 0;
    }
    
    public Node getHead() {
        return head;
    }
}
