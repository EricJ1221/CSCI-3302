public class ArrayBasedQueue implements QueueInterface
{
   //Attributes
   public final int MAX_QUEUE = 50;
   private Integer[] queueArray;
   private int back;
   
   //Constructor: creates an empty queue
   public ArrayBasedQueue()
   {
      this.queueArray = new Integer[this.MAX_QUEUE];
      this.back = -1;
   }
   
   // Determine if the queue is empty
   @Override
   public boolean isEmpty()
   {
      return -1 == this.back;
   }
   
   // Adds new item to the back of the queue
   @Override
   public void enqueue(Integer newItem) throws QueueException
   {
      if (this.back == this.MAX_QUEUE)
         throw new QueueException("Error: Queue is full!");
         
      this.queueArray[++this.back] = newItem;
   }
   
   // retrieves and removes the item at the front of
   // the queue
   @Override
   public Integer dequeue() throws QueueException
   {
      if (this.isEmpty())
         throw new QueueException("Error: Attempt to dequeue from empty queue!");
      
      Integer rVal = this.queueArray[0];
      
      // The dequeued item is removed by shifting all
      // items in the array left by 1.
      for (int i = 0; i < this.back; i++)
         this.queueArray[i] = this.queueArray[i + 1];
      this.back--;
      
      return rVal;
   }
   
   // Removes all items from the queue
   @Override
   public void dequeueAll ()
   {
      this.queueArray = new Integer[this.MAX_QUEUE];
      this.back = -1;
   }
   
   // Retrieves the item at the front of the queue
   @Override
   public Integer peek() throws QueueException
   {
      if (this.isEmpty())
         throw new QueueException("Error: Attempt to peek at empty queue!");
      
      return this.queueArray[0];
   }
}