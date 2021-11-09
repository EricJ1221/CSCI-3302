public class ObjectNode
{
   private Object item;
   private ObjectNode next;
   
   public ObjectNode(Object newItem)
   {
      this.item = newItem;
      this.next = null;
   }
   
   public Object getItem()
   {
      return this.item;
   }
   
   public Object getNext()
   {
      return this.next;
   }
   
   public void setNext(ObjectNode nextNode)
   {
      this.next = nextNode;
   }
   
   public ObjectNode find(int position)
   {
      if (position == 0)
         return this;
      else
         return this.next.find(position - 1);
   }
   
   @Override
   public String toString()
   {
      if (this.next == null)
         return "(" + this.item + ", null)";
      else
         return "(" + this.item + ", " + this.next.toString() + ")";
   }
}