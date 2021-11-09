
//write the method "contains" for the Node class below. 
//This method should return either True or False depending on whether or not the value assigned to "otherItem" is found
//within the linked-list starting from the current Node object. (Hint: use head recursion).

public class Node {
   
   private int item;
   private Node next;
   
   public Node(int newItem)
   {
      this.item = newItem;
      this.next = null;
   }
   
   public int getItem()
   {
      return this.item;
   }
   
   public Node getNext()
   {
      return this.next;
   }
   
   public void setNext(Node nextNode)
   {
      this.nextNode;
   }
   
   @override
   public boolean contains(int otherItem)
   {
      //Write this method
      Node currentNode = node;
      
      // base case; if this node is null, return false       //pretty sure this shit will not work, but then again we weren't shown an example of how to do this in the first fucking place
      if(currentNode == null) {
           return false;
      }
      if(currentNode.data == aData) {
        return true;
     }else {
        return contains(otherItem);
        }
    }
}

public boolean contains(int aData, Node node)
{
    Node currentNode = node;
    // base case; if this node is null, return false
    if(currentNode == null) {
        return false;
    }
    // if this node contains the data, return true, otherwise, check next nodes.
    if(currentNode.data == aData) {
        return true;
    } else {
        return contains(aData, currentNode.next);
    }
}