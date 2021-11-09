public class ReferenceBasedStack implements StackInterface
{
   // Reference to the top of the stack
   private IntegerNode top;
   
   // Constructor to create an empty stack
   public ReferenceBasedStack()
   {
      this.top = null;
   }
   
   // Determine if the stack is empty
   @Override
   public boolean isEmpty()
   {
      return this.top == null;
   }
   
   // Add an item to the top of the stack
   @Override
   public void push(Integer newItem)
   {
      //version 1
      //IntegerNode newNode = new IntegerNode (newItem);
      //newNode.setNext(this.top);
      //this.top = newNode;
      
      //version 2
      //IntegerNode newNode = new IntegerNode (newItem, this.top);
      //this.top = newNode;
      
      
      //version 3 "Most elegant"
      this.top =new IntegerNode (newItem, this.top);
      
   }
}