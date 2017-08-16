//Modify the previous program to read in a list of floating-point values. 
//The end of the input is indicated by the user entering a sentinel value -999. 
//The program will display the following:
//the average of the values, 
//the largest of the values,
//The smallest of the values,
//the range, that is the difference between the smallest and the largest.

/*
   Author : Sayaka Tamura
   File name: floatingValues.java
   Result ex:
 Please enter floating-point values as much as you want, type -999 to escape 
 125.25
 next floating-point value (-999 to quit)? 50.48
 next floating-point value (-999 to quit)? -999
 The largest number =125.25
 The smallest number =50.48
 The difference between the smallest and the largest =74.770004
*/

import java.util.*;

public class floatingValues
{
   public static void main(String[] args)
   {
      
      System.out. println("Please enter floating-point values as much as you want, type -999 to escape ");
      Scanner keyboard = new Scanner(System.in);
      
      //Set first typed Number to the largest and the smallest Number
      float firstNum = keyboard.nextFloat();
      
      float largestNumber = firstNum;
      float smallestNumber = firstNum;
      
      System.out.print("next floating-point value (-999 to quit)? "); 
      float num = keyboard.nextFloat();
            
      while(num != -999)
      {   
                     
         //For seaching a largest number
         if(largestNumber<num) {
            largestNumber=num;        
         }
                    
         //For searching a smallest number
         if(smallestNumber>num)
         {
            smallestNumber=num;   
         }
          
         System.out.print("next floating-point value (-999 to quit)? "); 
         num = keyboard.nextFloat(); 
                           
      }//End for loop
      
      //for print out largest number
      System.out.println("The largest number =" +largestNumber);
      
      //for print out smallset number
      System.out.println("The smallest number =" +smallestNumber); 
      
      //for print out the difference between smallest and largest
      System.out.println("The difference between the smallest and the largest ="+(largestNumber-smallestNumber));       
   }
}
