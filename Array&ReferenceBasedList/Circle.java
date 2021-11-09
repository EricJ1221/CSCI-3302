public class Circle      
{
private double radius;
      
      public Circle(double r)
      {
         this.radius = r;
      }
      
      @Override
      public String toString()
      {
         return "Circle with radius = " + this.radius;
      }
}