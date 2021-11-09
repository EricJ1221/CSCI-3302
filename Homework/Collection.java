import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Collection {

    double[] collection;
    public int counter = 0;
    public int threshold;
    private int countAbove;
    private int countBelow;

    //constructor that opens and reads from text file specified
    // by filename and stores results in collection attribute
    Collection(String filename) throws IOException
    {

        File inFile = new File(filename);
        Scanner input = new Scanner(inFile);

        //instantiate collection array with first integer
        int collectionSize = input.nextInt();
        collection = new double[collectionSize];

        System.out.println("My array size is " + collectionSize);

        while (input.hasNextDouble()) {
            collection[counter] = input.nextDouble();
            System.out.println(collection[counter]);
            System.out.println(counter);
            counter++;

        }
        int index;
        for(index = 0; index < collection.length; index++)
            System.out.println(collection[index]);

    }
    //returns an int value for the number of elements in
    // collection that exceed the value of threshold,
    //it does this by calling a private helper method that
    // uses head recursion to iterate through collection
    int countAbove(double threshold)
    {
        //int countAbove = this.countAbove;
        return countAbove;
    }

    private int sortByHead()
    {
        return this.sortByHead();
    }
    //returns an int value for the number of elements in
    // collection that are below the value of threshold,
    //it does this by calling a private helper method that
    // uses tail recursion to iterate through collection
    public int countBelow(double threshold)
    {
        //int countBelow = this.countBelow;
        return countBelow;
    }

    private int sortByTail()
    {
        return this.sortByTail();
    }

}
