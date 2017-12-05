package com.nick.linkedlist;

//import com.nick.linkedlist.LinkedList;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
public class LinkedListTest {

    private static LinkedList newList;

    /**
      * Before each test is run we clear the list to have a blank state
      */
    @Before
    public void initLinkedList() {
        newList = new LinkedList();
    }

    /**
      * Test creation of LinkedList$
      */
    @Test
    public void testCreationLinkedList() {
        LinkedList emptyList = new LinkedList();
        assertTrue(emptyList.isEmpty());
        assertNull(emptyList.getHead());
    }

    /**
      * Test adding initial element
      */
    @Test
    public void testAddInitialElement() {
        assertTrue(newList.isEmpty());
        Node newNode = new Node("first");
        newList.addNode(newNode);
        assertTrue(newList.getSize() == 1);
        assertTrue(newList.getHead().getData().equals("first"));
    }

    /**
      * Add second element
      */
    @Test
    public void testAddSecondElement() {
        assertTrue(newList.isEmpty());
        Node newNode = new Node("first");
        newList.addNode(newNode);
        assertTrue(newList.getSize() == 1);
        assertTrue(newList.getHead().getData().equals("first"));
        
        newNode = new Node("second");
        newList.addNode(newNode);
        assertTrue(newList.getSize() == 2);
        assertTrue(newList.getHead().getData().equals("first"));
        assertTrue(newList.getHead().getNext().getData().equals("second"));
    }

    /**
      * Remove first node in list
      */
    @Test
    public void testRemoveHead() {
        assertTrue(newList.isEmpty());
        Node newNode = new Node("first");
        newList.addNode(newNode);
        assertTrue(newList.getSize() == 1);
        assertTrue(newList.getHead().getData().equals("first"));
        
        newNode = new Node("second");
        newList.addNode(newNode);
        assertTrue(newList.getSize() == 2);
        assertTrue(newList.getHead().getData().equals("first"));
        assertTrue(newList.getHead().getNext().getData().equals("second"));

        newList.removeHead();
        assertTrue(newList.getSize() == 1);
        assertTrue(newList.getHead().getData().equals("second"));
    }

    /**
      * Test toString method
      */
    public void testToString() {
        assertTrue(newList.toString().equals("Size of LinkedList is 0 " + "\n"));
        Node newNode = new Node("first");
        newList.addNode(newNode);
        System.out.println(newList.toString());
    }
}

