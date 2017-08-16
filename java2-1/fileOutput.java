/*
   Author : Sayaka Tamura
   File name: fileOutput.java
   Result: Generate 100 numbers
           print the 100 numbers.
           make file named "out.txt" written the 100 numbers.
*/

import java.util.*;  //Needed for Scanner class 
import java.io.*; //Needed for File and IOExcepton 

//Generate 100 random integersbetween 0 to 100 and then save the integers to a file called "numbers.txt" 

public class fileOutput
{
   public static void main(String[] args)throws IOException //2.
   {  
      //3.create a PrintWriter object
      PrintWriter fileOut = new PrintWriter("out.txt");
      
      //create a rondom object
      Random rand = new Random();

      for(int i=1;i<100;i++){
                  
         int randomNumber = rand.nextInt(100)+1;
         
         //4. write to the file
         fileOut.println(randomNumber);
         System.out.println(randomNumber);

      }
      
      //5. close the file
      fileOut.close(); 
             
   }
}
