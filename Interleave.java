public class Interleave
{
   public static void main(String[] args)
   {
      /*
      int[] a = {1, 2, 3};
      int[] b = {44, 55, 66, 77, 88};
      
      System.out.println("Output: ");
      int[] outputArray = interleave(a, b);
      displayArray(outputArray);
      System.out.println();
      */
      
      
   }
   
   
   public static int[] interleave(int[] a, int[] b)
   {
      //Complete this method as required in the homework description
      int[] arr = new int[a.length+b.length]; 
      boolean left = true;
      int indexa = 0;
      int indexb = 0;
      for(int i = 0; i < arr.length; i++)
      {
         
        
         if(left == true)
         {
            arr[i] = a[indexa];
            indexa++;
            left = false;
         }
         else
         {  
            
            arr[i] = b[indexb];
            indexb++;
            left = true;
           
         }
         
         if(indexa == a.length)
         {
            left = false;
         }
         if(indexb == b.length)
         {
            left = true;
         }
         
      
      }
     
     
     
      return arr;
   }
   
   
    
   public static void displayArray(int[] array)
   {
      for (int i = 0; i < array.length; i++)
         System.out.print(array[i] + " ");
      System.out.println();
   }

}