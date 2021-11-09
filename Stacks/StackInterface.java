public interface StackInterface
{

   //StackItemType is the type of the items stored in the stack.
   
   //+createStack()
   //creates an empty stack.
   //This operation with be the task of the constructor.
   
   //+isEmpty
   //Determines whether a stack is empty
   public abstract boolean isEmpty();

   //+push(in newItem: StackItemType)
   //Adds newItem to the top of the stack. Throws
   //StackException if the insertion is not successful.
   public abstract  void push(Integer newItem);
   
   //+pop() : StackItemType throws StackException
   //Retrieves and then removes the top of the stack {the
   //item that was added most recently). Throws
   //StackException if the deletion is not successful.
   public abstract Integer pop() throws StackException;
   
   //popAll()
   //Removes All items from the stack
   public abstract void popAll();
   
   // +peek() : StackItemType throws StackException
   // Retrieves the top of the stack. Throws 
   //StackException if the retrieval is not successful.
   public abstract Integer peek() throws StackException;
}