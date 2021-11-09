public class ArrayBasedStack implements StackInterface
{
   public final int MAX_STACK = 50;
   private Integer[] items;
   private int top;
   
   // Creates an empty stack
   public ArrayBasedStack()
   {
      this.items = new Integer[MAX_STACK];
      this.top = -1;
   }
   
   //Determines whether the stack is empty
   @Override
   public boolean isEmpty()
   {
      return this.top < 0;
   //could also return this.top == -1;
   }
   
   // Determines whether the stack is full.
   public boolean isFull()
   {
      return this.top == (MAX_STACK -1);
   }
   
   // Adds new item to the top of the stack. Throws StackException
   // if the insertion is not successful.
   @Override
   public void push(Integer newItem) throws StackException
   {
      if (this.isFull())
         throw new StackException("Error: Stack is full!");
         
      this.items[++this.top] = newItem;
   }
   
   // Retrieve and then remove the item at the top of 
   // the stack. Throws StackException if the deletion
   // is not successful.
   @Override
   public Integer pop() throws StackException
   {
      if (this.isEmpty())
         throw new StackException("Error: Stack is empty!");
         
      return this.items[this.top--];
   }
   
   // Removes all items from the stack
   @Override
   public void popAll()
   {
      this.top = -1;
   }
   
   // Retrieves the item at the top of the stack. Throws
   // Stack Exception if the retrieval is not successful
   @Override
   public Integer peek() throws StackException
   {
      if (this.isEmpty())
         throw new StackException("Error: Stack is empty!");
         
      return this.items[this.top];
   }
   
}