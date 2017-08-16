/*
   Author : Sayaka Tamura
   Purpose: find prime numbers from user input

   Result ex:
   Type a number
 The program going to find prime numbers in it, and print 
 20
 2
 3
 5
 7
 11
 13
 17
 19

*/


import java.util.Scanner; 
 // For the Scanner class 
 import java.io.*;
 
 public class PrimeNumberList
 { 
    public static void main(String[] args) throws IOException
    {
       int 	userInput;	// declare number as an int
		 
       PrintWriter outputFile = new PrintWriter("PrimeNumberList.txt");
       
       System.out.println("Type a number" 
                           + "\nThe program going to find prime numbers in it, and print ");

		 Scanner keyboard	= new Scanner(System.in); // create a scanner object
       userInput = keyboard.nextInt();
      
       for(int currentNumber = 1; currentNumber <=userInput; currentNumber++)
       {
         if(isPrime(currentNumber))
         {
            System.out.println(currentNumber);
            outputFile.println(currentNumber);
         }
       }
       outputFile.close();
    }
          
    public static boolean isPrime(int userNumber) // method isPrime
    {
      int evenDivisions = 0;
      
      if(userNumber < 1)
         return false;
         
      for(int currentDivision = 1; currentDivision <= userNumber ; currentDivision++)
      {  
      	  if(userNumber % currentDivision == 0)   // use mod operator to check if a number will divide into equally
      	  {
              evenDivisions += 1;
              
              if((evenDivisions >2) || (userNumber == 1))
                 return false;
           }
      }
      return true;
    }
}
