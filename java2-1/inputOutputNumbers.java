/*
Modify the previous program to read in a list of integers 
from a file named “numbers.txt”. 
The program will find out the following and display the result 
to another file called “result.txt”.

the average of the values, 
the largest of the values,
The smallest of the values,
the range, that is the difference between the smallest and the largest.
*/

/*
   Author : Sayaka Tamura
   File name: inputOutputNumbers.java
   Result ex:
 5
 10
 15
 20
 25
 30
 35
 40
 45
 50
 55
 60
 52
 The total of integers in the list =442
 The numbers of integers in the list =13
 The average =34.0
 The largest number =60
*/

import java.util.*; //1.Scanner
import java.io.*; //2.import to IO package

public class inputOutputNumbers{
   public static void main(String[] args)throws IOException //3.IOException
   {
      //4. Create a file object and connect a Scanner with the file
      File numbersFile = new File("numbers.txt");
      Scanner inputFile = new Scanner(numbersFile);
            
      int firstNumber = inputFile.nextInt();
      
      int largestNumber = firstNumber;
      int smallestNumber = firstNumber;
      int total = 0;
      int numOfInt=0;
      
      PrintWriter outputFile = new PrintWriter("result.txt");
      
      outputFile.println("The list of integers:");
      System.out.println(firstNumber);
      outputFile.println(firstNumber);
      total+=firstNumber;
      numOfInt++;
            
      while(inputFile.hasNext()){
         
         int num = inputFile.nextInt();
         System.out.println(num);
         outputFile.println(num);
         
         total+=num;
         numOfInt++;
      
         if(largestNumber<num){
            largestNumber=num;
         }
         
         if(smallestNumber<num){
            smallestNumber=num;
         }

      }
      
      inputFile.close();
            
      System.out.println("The total of integers in the list ="+total);
      outputFile.println("The total of integers in the list ="+total);
      System.out.println("The numbers of integers in the list ="+numOfInt);
      outputFile.println("The numbers of integers in the list ="+numOfInt);

      double avg = (double)total/numOfInt;
      System.out.println("The average ="+avg);
      outputFile.println("The average ="+avg);
      
      //for print out largest number
      System.out.println("The largest number =" +largestNumber);
      outputFile.println("The largest number =" +largestNumber);
      
      outputFile.close();

      
   }
}