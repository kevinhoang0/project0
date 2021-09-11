public class DisplayArray 
{
   public static void main(String[] args)
   {
      int[] a1 = {1,3,5,6,9};
      printArray(a1,0);
      int[] a2 = {100};
      printArray(a2,0);
   }
   public static void printArray(int[] a, int index)
   {
      if (index >= a.length)
         System.out.println();
      else
      {
         System.out.print(a[index] + " ");
         printArray(a, index+1);
      }
   }
}
