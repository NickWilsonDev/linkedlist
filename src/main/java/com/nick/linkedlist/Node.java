/**
 * @author Nick Wilson
 * @version 12.5.17
 *
 * Node.java - class models a node that will be used to build a linkedlist
 */

public class Node {

    /* points to the next Node in the list */
    private Node next;

    /* data contained by the node, may change to generics in the future */
    private String data;

    /* basic constructor initializes the classes fields
       @param data - type string that represents data stored in the node
    */
    public Node(String data) {
        next = null;
        this.data = data;
    }

    /* getters and setters */

    public Node getNext() {
        return next;
    }

    public void setNext(Node node) {
        next = node;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

}
