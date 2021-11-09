public interface QueueInterface
{

   // QueueItemType is the type of the items stored in the queue.
   
   // +createQueue()
   // Creates an empty queue
   // Differed to the implementations constructor
   
   
   // +isEmpty() : Boolean
   // Determines whether the queue is empty
   public abstract boolean isEmpty();
   
   // +enqueue (in newItem : QueueItemType) throws QueueException
   // Adds newItem to the back of the queue. Throws
   // QueueException if the insertion is not successful.
   public abstract void enqueue(Integer newItem) throws QueueException;
   
   // +dequeue() : QueueItemType throws QueueException
   // Retrieves and them removes the item at the front 
   // of the queue. Throws QueueException if the deletion
   // is not successful
   public abstract Integer dequeue() throws QueueException;

   // +dequeueAll()
   // Removes all items from the queue.
   public abstract void dequeueAll();
   
   // +peek() : QueueItemType throws QueueException
   // Retrieves the item at the front of the queue 
   public abstract Integer peek() throws QueueException;
}