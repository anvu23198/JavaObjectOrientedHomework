public class Linearize
{
   public static void main(String[] args)
   {
      /*
      int[][] x = {{13, 29, 31, 40},
                   {2, 44, 87},
                   {43, 36, 90, 23},
                   {33}};
                   
      int[] y = linearize(x);
      displayArray(y);
      */
   
   
   }
   
   public static int[] linearize(int[][] arr)
   {
      //Complete this method as required in the homework description
      int count = 0;
      for(int row = 0; row < arr.length; row++)
      {
         for(int col = 0; col < arr[row].length; col++)
         {
            count++;
         }
      }
      
      int[] a = new int[count];
      int index = 0;
      for(int row = 0; row < arr.length; row++)
      {
         for(int col = 0; col < arr[row].length; col++)
         {
            a[index] = arr[row][col];
            index++;
         }
      }
      
      return a;
   }
   
   public static void displayArray(int[] array)
   {
      for (int i = 0; i < array.length; i++)
         System.out.print(array[i] + " ");
      System.out.println();
   }
}