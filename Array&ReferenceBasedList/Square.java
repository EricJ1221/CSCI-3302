public class Square
{
      private double sideLength;
      
      public Square(double s)
      {
         this.sideLength = s;
      }
      
      @Override
      public String toString()
      {
         return "Square with side length = " + this.sideLength;
      }
}