public class Node<S, T> {
    //Attributes, Data members
    private S key;
    private T value;
    //Storing address of next node
    private Node<S, T> next;

    // Constructor for a node.
    // Call setter to assign next.
    public Node(S newKey, T newValue) {
        this.key = newKey;
        this.value = newValue;
        this.next = null;
    }

    //Getter for key within the node
    public S getKey()
    {
        return this.key;
    }

    // Getter for value within node.
    public T getValue()
    {
        return this.value;
    }

    // Getter for the reference to the next node in the
    // list; if this is the last item, then next is null.
    public Node<S, T> getNext()
    {
        return this.next;
    }

    // Setter for the reference to the next node.
    public void setNext(Node<S, T> newNext)
    {
        this.next = newNext;
    }


}
