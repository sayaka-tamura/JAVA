/*
1.Declare an array A of 15 components of the type int.
2.Initialize array A so that each component is equal to its index variable.
3.Output the value of the tenth component of the array A.
4.Set the value of the fifth component of the array A the sum of the sixth and thirteen components of the array A.
5.Set the value of the fourth component of array A to three times the value of the eighth component minus 57.
6.Output array A so that five components per line are printed.
*/

/**
 * Created by Sayaka Tamura on 9/12/2016.
   File name: components15Array2.java
   Result ex:
    The tenth component of the array A is 9
 0 1 2 -36 17 
 5 6 7 8 9 
 10 11 12 13 14 
 */

import java.util.*;
public class components15Array2{
   public static void main(String[] args){
      
      /*
      int[] array = new int[5];
      double[] temp = new double[7];
      String[] names = new String[27];
      char[] letters = new char[26];
      
      double[] grades;
      System.out.println(temp);
      */
      
      /*
      int[] list = new int [10];
      for(int i=0; i<=10; i++){
         list[0]=0;
         list[1]=0;
         list[2]=0;
         ....
         
         list[9]=0;
         list[10]out of bound    
      }
      */
      
      //1.Declare an array A of 15 components of the type int.
      
      int[] A = new int[15];
               
      //2.Initialize array A so that each component is equal to its index variable
      
      for(int i=0; i<A.length; i++)
      {
         A[i]= i;
      }
            
      //3.Output the value of the tenth component of the array A.
      System.out.println("The tenth component of the array A is "+A[9]);
      
      /*4.Set the value of the fifth component of the array A 
         the sum of the sixth and thirteen components of the array A.*/
      A[4] = A[5]+ A[12];

      /*5.Set the value of the fourth component of array A 
      to three times the value of the eighth component minus 57.*/
      A[3] = 3*A[7]-57;

      //6.Output array A so that five components per line are printed.
      for(int i=0; i<A.length; i++)
      {
         System.out.print(A[i]+" ");

         if ((i+1) % 5 == 0)
         {
            System.out.println();
         } 
      }
   }
}