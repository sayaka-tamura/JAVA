//Modify the previous program to read in a list of integers from a file named “numbers.txt”. 
//The program will find out the following and display the result to another file called “result.txt”.
//the average of the values, 
//the largest of the values,
//The smallest of the values,
//the range, that is the difference between the smallest and the largest.

/*
   Author : Sayaka Tamura
   File name: readNumbers.java
   Result ex:
   make 100 random numbers
   make a file written it
*/


import java.util.*;  //Needed for Scanner class 
import java.io.*; //Needed for File and IOExcepton 

public class readNumbers
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
      
      //System.out. println("Please Enter the name of a file : ");
      //Scanner keyboard = new Scanner(System.in);
      //String filename = keyboard.nextLine();
      
      //Open the file
      //File file = new File(filename);
      //Scanner inputFile = new Scanner(file);
      
      //Read the first line from the file
      //String line = inputFile.nextLine();
      
      //Display the line
      //System.out.println("The first line in the file is:");
      //System.out.println(line);
      
      //Close the file
      //inputFile.close();
             
   }
}
