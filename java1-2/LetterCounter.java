/**
 *
 * @author Sayaka Tamura
 * @version 1.00 14/03/21
 */
 
//Needed for Scanner class
import java.util.Scanner;

public class LetterCounter
 {
   public static void main(String[] args)
   {
   	  //Declare variable
   	  int charCount = 0;
   	  String userString;
   	  String userChar;
   	  char userCharFirstC;
      
      //Create Scanner object
      Scanner keyboard = new Scanner(System.in);
            
      //Ask users string
      System.out.println("Please enter a string");
      //Accept the string
      userString = keyboard.nextLine();
      
      //Ask users character
      System.out.println("Please enter a character");
      //Ask users character
      userChar = keyboard.nextLine();
      userCharFirstC = userChar.charAt(0);
     
      //Check the condition to count the number of character in the word entered               
      for(int i= 0;i<userString.length();i++)
      {
              if (userString.charAt(i) == userCharFirstC)
                  {
                  charCount++;
                  }
      }
      System.out.println("The specified character " +"\"" + userChar +
                          "\" is inside the string " + userString +
                          " " + charCount +   " times.");            
    }
}