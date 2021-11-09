public class ReferenceBasedQueue implements QueueInterface
{
   //attributes
   private IntegerNode front;
   private IntegerNode back;
   
   //Constructor - Create an empty queue.
   public ReferenceBasedQueue()
   {
      this.front = null;
      this.back = null;
   }
   
   //Determines if the queue is empty.
   @Override
   public boolean isEmpty()
   {
      return this.front == null;
   }
   
   //Adds an item to the back of the queue
   //dont have to worry about running out 
   //of space like arrayBasedQueue
   @Override
   public void enqueue(Integer newItem)
   {
      if (this.isEmpty())
      {
         this.front = new IntegerNode(newItem);
         this.back = this.front; //cant set back to new IntegerNode because that would create another new node
      } else {
         //Note: could have implemented it this way
         // IntegerNode newNode = newNode = new IntegerNode (newItem);
         // this.back.setNext(newNode);
         // this.back = newNode;
         this.back.setNext(new IntegerNode(newItem));
         this.back = this.back.getNext();
      }
   }
   
   //Retrieves and removes the item at the 
   //front of the queue.
   @Override
   public Integer dequeue() throws QueueException
   {
      if (this.isEmpty())
         throw new QueueException("Error: Attempt to dequeue an empty queue!");
      
      Integer rVal = this.front.getItem();
      
      this.front = this.front.getNext();
      if (this.isEmpty())
         this.back = null;
         
      return rVal;
   }
   
   //Removes all items from the queue.
   @Override
   public void dequeueAll()
   {
      this.front = null;
      this.back = null;
   }
   
   // Retrieves the item at the front of the queue.
   @Override
   public Integer peek() throws QueueException
   {
      if (this.isEmpty())
         throw new QueueException("Error: Attempt to peek at empty queue!");
      
      return this.front.getItem();
   }
}