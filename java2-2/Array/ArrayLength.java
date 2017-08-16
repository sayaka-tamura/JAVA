/**
 * Created by Sayaka Tamura on 9/12/2016.
   File name: ArrayLength.java
   
   Result ex:
    There are 9 elements in this array.
    The first array item is 8
    The last array item is 100
    x[x.length-1]=100
    8 4 5 21 7 9 18 2 100 
    x[0]=8
    x[1]=4
    x[2]=5
    x[3]=21
    x[4]=7
    x[5]=9
    x[6]=18
    x[7]=2
    x[8]=100
    
    x[8]=100
    x[7]=2
    x[6]=18
    x[5]=9
    x[4]=7
    x[3]=21
    x[2]=5
    x[1]=4
    x[0]=8

 */

public class ArrayLength
{
   public static void main(String[] args)
   {
      //Create an array x of doubles with an initializer list
      // that contains 8, 4, 5, 21, 7, 9, 18, 2, and 100.
      int[] x = {8, 4, 5, 21, 7, 9, 18, 2, 100};
            
      //Print the number of items in the array by using x.length.
      System.out.println("There are "+x.length + " elements in this array.");
      
      //Print the first array item.
      System.out.println("The first array item is "+x[0]);
      
      //Print the last array item. 
       System.out.println("The last array item is "+x[8]);

      
      //Print the expression x[x.length – 1]. 
      //Why is this value the same as in previous step?
        System.out.println("x[x.length-1]="+x[x.length-1]);

      //Use a for loop to print all the values in the array
      for(int v: x) 
         System.out.print(v+ " ");
      System.out.println();
      
      //Use a for loop to print all the values in the array with indexes.
      for(int i=0; i<x.length; i++) 
         System.out.println("x["+i+"]="+ x[i]);
      System.out.println();

      
      //Use a for loop to print all the values in the array
      // in reverse order with indexes to indicate what each element is.
      
       for(int i=x.length-1; i>=0; i--) 
         System.out.println("x["+i+"]="+ x[i]);
      System.out.println();


   }
}
   
   
 