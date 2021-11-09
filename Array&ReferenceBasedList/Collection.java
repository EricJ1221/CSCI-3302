

public class Collection
{
   private double[] collection;


//________________________________File Io___________________________________ 
//__________________________________________________________________________  
      public Collection(String filename) throws IOException
      {
         File inFile = new File(filename);
         Scanner input = new Scanner(inFile);
         
         int numValues = input.nextInt();
         this.collection = new double[numValues];
         
         for (int i = 0; i < collection.length; i++)
            collection[i] = input.nextDouble();
            
            input.close();
      }
        
      
//____________________________Head Recursion________________________________   
//__________________________________________________________________________      
      public int countAbove (double threshold)
      {
         return this.countAbove(threshold, 0);
      }
      
      //uses head recursion
      privtae int countAbove(double threshold, int index)
      {
         if (index >= this.collection.length)
            return 0;
         else {
            int countSoFar = this.countAbove(threshold, index + 1);
            if (this.collection[index] > threshold)
               return countSoFar + 1;
            else
               return countSoFar;
         }
      }
//__________________________________________________________________________   

     
     
//____________________________Tail Recursion________________________________   
//__________________________________________________________________________      
      public int countBelow(double threshold)
      {
         return this.countBelow(threshold, 0, 0);
      }
      
      //uses tail recursion
      private int countBelow(double threshold, int index, int countSoFar)
      {
         if (index >= this.collection.length)
            return countSoFar;
         else {
            if (this.collection[index] < threshold)
               countSoFar++;
            return this.countBelow(threshold, index + 1, countSoFar);
            }
        }
}