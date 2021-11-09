public class Lesson17
{
   public static void main(String[] args)
   {
      TreeNode<Integer> t1 = new TreeNode<Integer>(11);
      TreeNode<Integer> t2 = new TreeNode<Integer>(22);
      TreeNode<Integer> t3 = new TreeNode<Integer>(33);
      
      TreeNode<Integer> t4 = new TreeNode<Integer>(44, t1, t2);
      TreeNode<Integer> t5 = new TreeNode<Integer>(55, t4, t3);
      System.out.println(t5);
   }
}