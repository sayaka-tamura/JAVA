/**
 * Created by Sayaka Tamura on 9/12/2016.
   File name: linearSearchAndSort.java
   Result ex:
   Found.
   2 18 23 34 45 99 100 
         
 */

import java.util.*;

public class linearSearchAndSort
{
   public static void main(String[] args)
   {
   
     int[] nums ={100, 2, 45, 23, 99, 34, 18};
     
     if(linearSearch(nums, 45))
      System.out.println("Found.");
     else
      System.out.println("Not found.");
      
     selectionSort(nums);
     //Arrays.sort(nums);
      
     for(int n:nums)
        System.out.print(n+" ");
     System.out.println();   
   }
   
        
   //search a number from the array
   /*
     check the array elements one by one, 
     and compare each element with the number 
     if there is a match display yes
    
     if after scanned the entire array, and there
     is no matching element, display no.
   */ 
   /**
     search a number from an array
     @param array  an array of integers
     @param target  
     @return found  whether the number is in the array or not 
   */
   public static boolean linearSearch(int[] array, int target)
   {
      
      for(int i=0; i<array.length; i++)
      {
         if(array[i] == target)
            return true;
      
      }
      
      return false;
    }
    
     /**
     Sort an array of integers from smallest to largest
     @param array  an array of integers
    */
   public static void selectionSort(int[] array)
   {
   
      for(int i=0; i<array.length-1; i++)
      {
         //1. find the smallest from the 
         //unsorted part of the array
         int minIdx = i;
         for(int j=i+1; j<array.length; j++)
         {
            if(array[j]<array[minIdx])
                  minIdx = j;
         }
         
         
         //2. place it to the right
         // position (swap)
         
         int temp =array[minIdx];
         array[minIdx]= array[i];
         array[i]=temp;
      }
   }
   
}