/*
   Author : Sayaka Tamura

   Purpose: judge whether user-input is prime number or not 
*/

import java.util.Scanner; 
 // For the Scanner class 
 
 public class IsPrimeMethod
 { 
    public static void main(String[] args) 
    {
       int 	number;	// declare number as an int
		
		 Scanner keyboard	= new Scanner(System.in); // create a scanner object
       
       // ask user for the number to check for prime
		 System.out.println("Please enter a number and the computer will"  + 
					"\n determine if it is a prime number.\n");
		 System.out.println("We don't accept the number less than 2");
		 number = keyboard.nextInt();
       
       if(isPrime(number))   // check to see if method is true
   	    {
   		  System.out.println("Your number is prime");
   		 }
      	 else      // if method is false
      	 {
      		System.out.println("Your number is not prime");
      	 }
    }
          
    public static boolean isPrime(int number)  // method isPrime
    {
      int count=0;
      
   	for(int index = 2; index<number; index++)  // loop counter, to check if a number will divide into
   	{                                          // the input number, starting at two and going until one short of input number 
   	  if(number%index == 0)   // use mod operator to check if a number will divide into equally
   	  {
         count++;
        }
      }
      
      if(count==0)
      {
 	      return true;
	   }
      else
      {
         return false;
      }
    }
}
