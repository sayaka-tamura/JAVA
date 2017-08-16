/**
 * Created by Sayaka Tamura on 9/12/2016.
   File name: components15Array.java
   Result ex:
   The tenth component of the array A is 9
   0 1 2 -36 17 5 6 7 8 9 10 11 12 13 14 
 */

import java.util.*;
public class components15Array
{
   public static void main(String[] args)
   {  
      /*
        Scanner keyboard = new Scanner(System.in);
       
       /*System.out.println("How many elements do you have?");
       int size =keyboard.nextInt();
       */
       /*
       System.out.println("Enter the items:");
       
       int[] items = new int[100];
       
       //input the values to the array
       for(int i=0;  i<items.length; i++)
         items[i] = keyboard.nextInt();
      
       //display the content of the array
       for(int i=0;  i<5; i++)
          System.out.println(items[i]);
      
      //display the array in reversed order
       
      for(int i=items.length-1; i>=0 ; i--)   
       System.out.print(items[i]+" ");
     
     System.out.println();
      */
      
      //Declare an array A of 15 components of the type int.

      int[] A = new int[15];
      
      //Initialize array A so that each component is equal to its index variable
      for(int i=0; i<A.length; i++)
         A[i]=i;
      
      //Output the value of the tenth component of the array A.
       System.out.println("The tenth component of the array A is "+A[9]);

      //Set the value of the fifth component of the array A 
      //the sum of the sixth and thirteen components of the array A.
      A[4] = A[5] + A[12];
      
      //Set the value of the fourth component of array A to 
      //three times the value of the eighth component minus 57.
      A[3] = 3 * A[7] - 57;
      
      //Output array A so that five components per line are printed.
      for(int i=0; i<A.length; i++)
         System.out.print(A[i]+" ");       
             
   }
}