public class Node<T>
{
    private int itemPriority;
    private T item;
    private Node<T> next;

    public Node(int priority, T newItem)
    {
        this.itemPriority = priority;
        this.item = newItem;
        this.next = null;
    }

    public int getPriority()
    {
        return this.itemPriority;
    }

    public T getItem()
    {
        return this.item;
    }

    public Node<T> getNext()
    {
        return this.next;
    }

    public void setNext(Node<T> nextNode)
    {
        this.next = nextNode;
    }
}
