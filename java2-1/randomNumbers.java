//Modify the previous program. Let the program generate in a list of 100 random numbers between 1 to 1000. The program will display the following:
//the average of the values, 
//the largest of the values,
//The smallest of the values,
//the range, that is the difference between the smallest and the largest.

/*
   Author : Sayaka Tamura
   File name: randomNumbers.java
   Result ex:
   ...100 random numbers
 The average =498.51
 The largest number =990
 The smallest number =9
 The difference between the smallest and the largest =981
*/

import java.util.*;

public class randomNumbers{

   public static void main(String[] args){
   
      Random rand = new Random();
      int pickedFirstNumber = rand.nextInt(1000)+1;
            
      int largestNumber = pickedFirstNumber;
      int smallestNumber = pickedFirstNumber;
      int total = 0;
      
      for (int i=0; i<99; i++)
      {  
         int pickedNumber = rand.nextInt(1000)+1;
         
         
         System.out.println(pickedNumber);
         total+=pickedNumber;
         
         //For seaching a largest number in random
         if(largestNumber<pickedNumber)
         {
            largestNumber=pickedNumber;                 
         }
         
          //For searching a smallest number
         if(smallestNumber>pickedNumber)
         {
            smallestNumber=pickedNumber;
         }

      }//End for Loop
      
      double avg = (double)total/100;
      System.out.println("The average ="+avg);
      
      //for print out largest number
      System.out.println("The largest number =" +largestNumber);
      
      //for print out smallset number
      System.out.println("The smallest number =" +smallestNumber);
      
      //for print out the difference between smallest and largest
      System.out.println("The difference between the smallest and the largest ="+(largestNumber-smallestNumber));

   }
}
