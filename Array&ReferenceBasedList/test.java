public static void main(String[] args) {

   foo = new foo(7);

   public static int foo(int x)
   {
      if (x <= 0)
         return 1;
      else
         return 2 * foo(x - 1) + 1;
   }
}