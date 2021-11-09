public class TreeNode<T>
{
   private T item; //item stored in this node
   private TreeNode<T> leftChild; //reference to the left subtree
   private TreeNode<T> rightChild; //reference to the right subtree
   
   //initialize tree node with item and no children
   public TreeNode (T newItem)
   {
      this.item = newItem;
      this.leftChild = null;
      this.rightChild = null;
   }
   
   //Initialize tree node with item and the left and 
   //right children references
   public TreeNode( T newItem, TreeNode<T> left, TreeNode<T> right)
   {
      this.item = newItem;
      this.leftChild = left;
      this.rightChild = right;
   }
   
   //Getter for item
   public T getItem()
   {
      return this.item;
   }
   
   //Setter for item
   public void setItem(T newItem)
   {
      this.item = newItem;
   }
   
   //Getter for leftChild
   public TreeNode<T> getLeftSubTree(TreeNode<T> left)
   {
      return this.leftChild;
   }
   
   //Setter for leftChild
   public void setLeftSubtree (TreeNode<T> left)
   {
      this.leftChild = left;
   }
     //Getter for rightChild
   public TreeNode<T> getRightSubTree(TreeNode<T> right)
   {
      return this.rightChild;
   }
   
   //Setter for rightChild
   public void setRightSubtree (TreeNode<T> right)
   {
      this.rightChild = right;
   }
   
   // This method returns a string representation of the 
   // binary tree.
   @Override
   public String toString()
   {
      if ((this.leftChild == null) && (this.rightChild == null))
         return "(" + this.item.toString() + ", null, null)";
         
      else if (this.leftChild == null)
         return "(" + this.item.toString() + ", null, " +
           this.rightChild.toString() + ")";
           
      else if (this.rightChild == null)
         return "(" + this.item.toString() + ", " +
            this.leftChild.toString() + ", null)";
            
      else
         return "(" + this.item.toString() + ", " +
          this.leftChild.toString() + ", " +
           this.rightChild.toString() + ")";
         
   }
}
