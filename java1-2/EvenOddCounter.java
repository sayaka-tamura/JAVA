/*
   Author : Sayaka Tamura

   Purpose: Generate Random Number 100 times 
            and judge even or odd 
*/

import java.util.Random;

public class EvenOddCounter{
   public static void main(String[] args) {
       
       int evenNumberCount = 0; // # of even number
       int oddNumberCount = 0; // # of odd number
       
       int num; //random number
       boolean numberStatus;

       Random randomValue = new Random();

      
       // Generate 100 random numbers.
       for (int i = 1; i <= 100; i++) 
       {
           num = randomValue.nextInt(100);
           numberStatus = isEven(num);

           // Determine if the number was even or odd.
           if (numberStatus) 
           {
               evenNumberCount++;
           } 
           else 
           {
               oddNumberCount++;
           }
       }
   
       System.out.println("Number of even numbers: " + evenNumberCount);
       System.out.println("Number of odd numbers: " + oddNumberCount);
   
   }
   
   /**
    * @param num to check
    * @return true if the num is true otherwise false
    */
   public static boolean isEven(int num) {
       boolean isEvenNumber = false;
   
       if ((num % 2) == 0) {
           isEvenNumber = true;
       }
       return isEvenNumber;
   }
}