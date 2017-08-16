/**
 * Created by Sayaka Tamura on 9/12/2016.
   File name: SortRandomNum.java
   Result ex:
   77 29 83 97 34 80 1 19 18 80 96 6 50 2 6 95 62 61 77 85 
   1 2 6 6 18 19 29 34 50 61 62 77 77 80 80 83 85 95 96 97  
 */


import java.util.*;

public class SortRandomNum
{
   public static void main(String[] args)
   {
      int[] numbers =generateRandomNums(20, 99, 0);
      displayArray(numbers);
      
      Arrays.sort(numbers);
      displayArray(numbers);

   }
   
   public static int[] generateRandomNums(int size, int high, int low)
   {
      int[] array = new int[size];
      
      Random rand = new Random();
      
      for(int i=0; i<array.length; i++)
      {
         array[i]=rand.nextInt(high-low+1)+low; 
      }
      
      return array;
   
   }
   
   public static void displayArray(int[] array)
   {
      for(int n: array)
         System.out.print(n+ " ");
      System.out.println();
   }
   
}