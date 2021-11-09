
public class IntegerNode
{
   // Attribute
   private Integer item;
   private IntegerNode next;
   
   // Constructor
   public IntegerNode(Integer newItem)
   {
      this.item = newItem;
      this.next = null;
   }
   
   // Overloaded constructor
   public IntegerNode (Integer newItem, IntegerNode newNext)
   {
      this.item = newItem;
      this.next = newNext;
   }
   
   // Getter for item
   public Integer getItem()
   {
      return this.item;
   }
   
   // Getter for next
   public IntegerNode getNext()
   {
      return this.next;
   }
   
   // Setter for next
   public void setNext (IntegerNode newNext)
   {
      this.next = newNext;
   }
}