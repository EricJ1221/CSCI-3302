public class bullshitTestQuestionAddLinkedList

public class Node {
   
   private int item;
   private Node next;
   
}  //end Node class

public class IntegerList {

   private Node head;
   private int numItems;
   
   public IntegerList() {
      numItems = 0;
      head = null;
   }   
   
   public void add(int index, int item) throw ListException {
      //write this method
      if((index < 0) || (index > this.numItems))
         throw new ListException("Index is out of bounds!");
         
      Node = newNode = new Node(item);
      
      if (index == 0)
      {
         newNode.setNext(this.head);
         this.head = newNode;   
      } else {       ///really have no ide if this.head.add(index-1, item) is how to do this bullshit
         Node previous = this.head.add(index - 1, item);//although I'm not even sure whats going on
         newNode.setNext(previous.getNext());//or how the fuck I'm supposed to do it without the 
         previous.setNext(newNode);//find function, what a fucking cock sucker nix
      }
      this.numItems++;
   }
}