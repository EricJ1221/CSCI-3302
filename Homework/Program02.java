/******************************************************

 name: Eric Oliver

 section: CSCI 3302-002

 name of file: MyArrayList.java

 date of submission: 9/TBD/2021 !!!!!!!!!!DUE ON 9/23/2021 8:30 AM!!!!!!!!!!

 Description:

 *******************************************************/

public class Program02 {

public class MyArrayList {

    public String[] lstArray;
    public int size;

    //constructor that creates an empty array list
    //just need to hard code them and initialize
    public MyArrayList() {
        this.lstArray = new String[2];
        this.size = 0;

    }

    //Determines whether the list is empty
    public Boolean isEmpty() {
        //this cant be right because it returns false when size > 0
        return this.size == 0;
    }

    //returns the number of items stored in the list
    public int size() {

        return this.size;
    }

    //adds the specified element to the list
    //on each call to add, check to see if lstArray is full. If adding the new element would cause
    // the array to overflow then
    //create a new larger array that is twice the size of the original array
    //copy the contents of the original array to the new array
    //add the new element to the new array
    //and reassign lstArray to reference the new array
    public void add (String itemIn) throws MyArrayListException {
        String[] newLstArray;

        if(size >= lstArray.length) {
            newLstArray = new String[lstArray.length * 2];
            for (int index = 0; index < lstArray.length; index++) {
                newLstArray[index] = lstArray[index];
            }
            lstArray = newLstArray;
            lstArray[size] = itemIn;
            size++;
        }
        else {
            lstArray[size] = itemIn;
            size++;
        }
    }

    //removes the first occurrence of the specified
    //element from the list, if it is present
    public void remove (String itemOut) {
        for (int index = 0; index < lstArray.length; index++)
            if (lstArray[index] == itemOut) {
                size--;
                lstArray[index] = null;
            }

        String[] newLstArray;
        if (size <= (lstArray.length / 4)) {
            newLstArray = new String[lstArray.length / 2];
            for (int index = 0; index < newLstArray.length; index++) {
                newLstArray[index] = lstArray[index];
            }
            lstArray = newLstArray;
        }
    }

    //returns the element at the specified index from
    //the list. The list remains unmodified

    public String get (int index) {

        return this.lstArray[index];
    }

    //removes all items in the list
    public void removeAll () {
        String[] newLstArray = new String[2];
        this.lstArray = newLstArray;
        this.size = 0;
    }

    public int length()
    {
        return this.lstArray.length;
    }
}

}