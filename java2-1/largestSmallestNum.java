//Write a program to read in a list of 10 integers. The program will display the following:
//the average of the values, 
//the largest of the values,
//The smallest of the values,
//the range, that is the difference between the smallest and the largest.

/*
   Author : Sayaka Tamura
   File name: largestSmallestNum.java
   Result ex:
    Please enter 5 positive integers
 10
 50
 30
 110
 33
 The largest number =110
 The smallest number =10
 The difference between the smallest and the largest =100

*/

import java.util.*;

public class largestSmallestNum
{
   public static void main(String[] args)
   {
      System.out.println("Please enter 5 positive integers");
      
      Scanner keyboard = new Scanner(System.in);     
      int firstNum = keyboard.nextInt();
      
      int largestNumber=firstNum;
      int smallestNumber=firstNum;
      
      int num = keyboard.nextInt();      
      
      for(int i=0; i<3; i++){
         if(num>0)
         {  
            num = keyboard.nextInt();
         }  
         
         //For seaching a largest number
         if(largestNumber<num&&(num>0))
         {
            largestNumber=num;
         }
         
         //float, long, short
                    
         //For searching a smallest number
         if(smallestNumber>num&&(num>0))
         {
            smallestNumber=num;  
         }
      }//End for loop
      
      //for print out largest number
      System.out.println("The largest number =" +largestNumber);
      
      //for print out smallset number
      System.out.println("The smallest number =" +smallestNumber); 
      
      //for print out the difference between smallest and largest
      System.out.println("The difference between the smallest and the largest ="+(largestNumber-smallestNumber));       
   }
}

//want to make vaild user input loop 