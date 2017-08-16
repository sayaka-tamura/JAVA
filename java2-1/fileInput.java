import java.util.*;//1. Scanner
import java.io.*; //2. import to IO package

/**
   Author : Sayaka Tamura
   File name: fileInput.java
   Result: Read from "fileOutput.java" 
           and insert a line number in front of each line
*/

public class fileInput
{
   public static void main(String[] args)throws IOException //3.IOException when u use io exception
   {  
      //System.out. println("Please Enter the name of a file : ");
      //Scanner keyboard = new Scanner(System.in);
      //String filename = keyboard.nextLine();
      
      //Open the file
      //File file = new File(filename);

      //4. Open the file / create a file object and connect a Scanner with the file
      File file = new File("fileOutput.java");
      Scanner fileIn = new Scanner(file);
      PrintWriter fileOut = new PrintWriter("output.txt"); 
            
      int lineNumber = 1;
      
      //5. read from the file using a loop
      while(fileIn.hasNext()) // till end the contents of a file
      {  
         //Read the first line from the file
         String line = fileIn.nextLine();
         
         //Display the line
         System.out.println(lineNumber+"  "+line.toUpperCase());
         fileOut.println(lineNumber+"  "+line.toUpperCase());  
         lineNumber++;
      }
      
      fileOut.close();
      
      //Close the file
      fileIn.close();

   }
}

  
