public class Lesson13
{
   public static void main(String[] args)
   {
      ArrayBasedQueue queue = new ArrayBasedQueue();
      
      for (int i = 0; i < 10; i++)
         queue.enqueue(i);
      
      for (int i = 0; i < 10; i++)
         System.out.println(queue.dequeue());
      
      try {
         queue.dequeue();
      } catch (QueueException e) {
         System.out.println("QueueException caught!");
      }
      
      for (int i = 10; i < 20; i++)
         queue.enqueue(i);
         
      while (!queue.isEmpty())
         System.out.println(queue.dequeue());
   }
}