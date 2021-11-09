

//aka Lesson 07

public class ArrayBasedList implements ListInterface
{
   private static final int MAX_LIST = 50;
   private Object[] items;
   private int numItems;
   
   
   //Create an empty list
   public ArrayBasedList()
   {
      this.items = new Object[MAX_LIST];
      this.numItems = 0;
   }
   
   
   //Determine whether a list is empty
   @Override
   public boolean isEmpty()
   {
      return this.numItems == 0;
   }
   
   
   //Determine the number of items on a list
   @Override
   public int size()
   {
      return this.numItems;
   }
   
   
   //Add an item at a given position on the list
   @Override
   public add(int index, Object item) throws ListException
   {
      if (this.numItems >= MAX_LIST)
         throw new ListException("List is Full");
      
      if ((index < 0) || (index > numItems))
         throw new ListException("Location is unavailable!");
      
      for (int position = this.numItems; position > index; position--)
         this.items[position] = this.items[position - 1];
         
      this.items[index] = item;
      this.numItems++;
   }
   
   
   //Remove an item at a given position on the list
   @Override
   public void remove(int index) throws ListException
   {
      if ((index < 0) || (index >= numItems))
         throws new ListException("Location is unavailable");
         
      for (int position = index + 1; position < this.numItems; position++)
         items[position -1] = this.items[position];
         
      numItems--;
   
   }
   
   
   //Remove all the items from the list
   @Override
   public void removeAll()
   {
      this.items = new Object[MAX_LIST];
      this.numItems = 0;
   }
   
   
   //Retrieve (get) the item at a given position on the list
   public object get(int index) throws ListException
   {
      if ((index < 0) || (index >= this.numItems))
         throw new ListException("Locations is unavailable!");
         
      return this.items[index];
   }
}