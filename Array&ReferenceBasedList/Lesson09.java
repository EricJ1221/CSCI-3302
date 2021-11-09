public class Lesson09
{
   public static void main(String[] args)
   {
      //ArrayBasedList l = new ArrayBasedList();
      //ObjectLinkedList l = new ObjectLinkedList();
      
      for (int x = 0; x < 5; x++)
      {
         for (int y = 0; y < 5; y++)
         {
            l.add(l.size(), new Circle(1.0 * x * y));
            System.out.println("Circle added.");
            l.add(l.size(), new Square(1.0 * x * y));
            System.out.println("Square added.");
         }
      }
      
      for (int i = 0; i < l.size(); i++)
         System.out.println(l.get(i).getItem().toString());
         
      for (int i = 0; i < l.size(); i++)
      {
         Object o = l.get(i);
         
         if (o instanceof Circle)
            System.out.println("Item " + i + "is a Circle.");
            
         if (o instanceof Square)
            System.out.println("Item " + i + "is a Square.");
      }

   }
}