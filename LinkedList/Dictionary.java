import java.io.*;

//abstract is implied when using an interface
public class Dictionary<S, T> implements IDictionary<S, T>
{
    //storing address of head
    Node<S, T> head;

    //parameterized constructor to assign values
    public Dictionary()
    {
        this.head = null;
    }

    /// Determines whether the dictionary is empty.
    @Override
    public boolean isEmpty()
    {
        return this.head == null;
    }


    // Adds the provided (key, item) pair to the dictionary.
    // If the key is already associated with a value, the
    // old key, value pairs are replaced.
    @Override
    public void add(S key, T value) {

        Node<S, T> newNode = new Node<S, T>(key, value);

        //could also use "if this.isEmpty();"
        //if there are no items in dictionary this will set first item
        if (this.head == null)
            this.head = newNode;
        //
        else if (key.equals(this.head.getKey()))
        {
            newNode.setNext(this.head.getNext());
            this.head = newNode;
        } else {
            Node<S, T> current = this.head;
            Node<S, T> previous = null;

            //this is how we would excise a node from the middle
            while (current != null && !key.equals(current.getKey()))
            {
                previous = current;
                current = current.getNext();
            }
            if(current == null)
            {
                newNode.setNext(head);
                head = newNode;
            }
            else {
                previous.setNext(newNode);
                newNode.setNext(current.getNext());
            }
        }
    }

    // Removes the (key, value) pair specified by the given
    // key from the dictionary. Throws an exception if the
    // (key, value) pair is not contained in the dictionary.
    @Override
    public void remove(Object key) throws DictionaryException
    {

        Node<S, T> current = this.head;
        Node<S, T> previous = null;

        if (key.equals(this.head.getKey())) {
            head = current.getNext();
            return;
        }

        if (this.head == null)
            throw new DictionaryException("No Items in Dictionary");

        while (current != null && !key.equals(current.getKey()))
        {
            previous = current;
            current = current.getNext();
        }
        if(current == null)
            throw new DictionaryException("Key value is not in the dictionary");

        previous.setNext(current.getNext());


    }
    // Returns the value associated with the given key
    // from the dictionary. Does not modify the dictionary.
    // Throws an exception if the (key, value) pair is not
    // contained in the dictionary.
    @Override
    public Object getValue(Object key) throws DictionaryException
    {
        if (this.head == null)
            throw new DictionaryException("No Items in Dictionary");

        Node<S, T> current = this.head;
        Node<S, T> previous = null;
        while (current != null && !key.equals(current.getKey()))
        {
            previous = current;
            current = current.getNext();
        }
        if(current == null)
            throw new DictionaryException("Key value is not in the dictionary");

        return current.getValue();
    }

    // Removes all (key, value) pairs in the dictionary.
    @Override
    public void clearDictionary()
    {
        this.head = null;
    }

    public void printList()
    {
        Node<S, T> current = head;
        System.out.print("HEAD --> ");
        while (current != null) {
            System.out.print(current.getKey() + " " + current.getValue());
            System.out.print(" --> ");
            current = current.getNext();
        }
        System.out.print(" null ");
    }
}
