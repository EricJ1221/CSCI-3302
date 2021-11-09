public interface ListInterface
{

   //create an empty list
   // this is deferred to the implementation's constructor
   
   //determine whether a list is empty
   public boolean isEmpty();
   
   //Determine the number of items on a list
   public int size();
   
   //add an item at a given position on the list
   public void add(int index, Object item) throws ListException;
   
   //Remove an item at agive position on the list
   public void remove(int index) throws ListException;
   
   //Remove all the items from the list
   public void removeAll();
   
   //Retrieve (get) the item at a given position on the list
   public Object get(int index) throws ListException;
}