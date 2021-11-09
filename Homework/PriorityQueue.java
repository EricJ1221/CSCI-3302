/********************************************************

 name: Eric Oliver

 section: CSCI 3302-002

 name of file: PriorityQueue.java

 date of submission: 10/18/2021

 Description: This program contains methods to implement a priority queue of items.

 *******************************************************/

public class PriorityQueue<T> implements IPriorityQueue<T>
{
    Node<T> front;
    public PriorityQueue()
    {
        this.front = null;
    }
    //Determines whether the queue is empty or not
    @Override
    public boolean isEmpty()
    {
        return this.front == null;
    }

    //adds a new item to the collection
    //we will add the highest priority item to the beginning of the queue
    //I believe this will be easier, however a queue traversal will still
    //be necessary for determining the priority
    @Override
    public void add(int priority, T item)
    {
        Node<T> newNode = new Node<T>(priority, item);

        //if the queue is empty, point the front at first node
        if(this.front == null)
        {
            this.front = newNode;
            return;
        }

        Node<T> current = this.front;
        Node<T> previous = null;

        if(this.front.getPriority() > priority)
        {
            newNode.setNext(current);
            front = newNode;
            return;
        }
        //adds an item at later priority
        while (current != null && priority != current.getPriority())
        {
            previous = current;
            current = current.getNext();
        }
        if(current == null)
        {
            previous.setNext(newNode);
        }

        else if (priority == current.getPriority()) {
            while(current != null && priority == current.getPriority()) {

                previous = current;
                current = current.getNext();
            }
            if(current == null)
            {
                previous.setNext(newNode);
            }
            newNode.setNext(current);
            previous.setNext(newNode);
        }
    }

    //this method should remove the Node<T> with the highest priority
    //from the linked list and return the item associated with it
    //If a node has the same priority it should return the node that
    //has been in it the longest, first in, first out
    @Override
    public T removeTopPriority() throws PQException
    {
        if(front == null)
            throw new PQException("There are no items in the queue.");

        Node<T> current = this.front;
        Node<T> next = current.getNext();

        front = next;
        return current.getItem();

        //does return the item mean print the item out??????
    }

    //should return the corresponding item of the Node<T>
    // object with the highest priority without removing the
    //Node<T> object from the linked list
    @Override
    public T peekTopPriority() throws PQException
    {
        if(front == null)
            throw new PQException("There are no items in the queue.");

        return this.front.getItem();
    }

    public void printList()
    {
        Node<T> current = front;
        System.out.print("Front --> ");
        while (current != null) {
            System.out.print(current.getPriority() + " " + current.getItem());
            System.out.print(" --> ");
            current = current.getNext();
        }
        //System.out.print(" Back ");
    }
}
