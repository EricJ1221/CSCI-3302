public class Lesson11
{
   public static void main(String[] args)
   {
      ArrayBasedStack stack = new ArrayBasedStack();
      
      int num = 13;
      while (!stack.isFull()){
         stack.push(Integer.valueOf(num));
         num += 2;
      }   
      while (!stack.isEmpty())
         System.out.println(stack.pop());
   }
}