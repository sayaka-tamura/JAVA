/*
   Author : Sayaka Tamura
   Purpose: Guess color from multiple choice
*/


import java.util.Random;
import java.util.Scanner;
 
public class ESPgame 
{
      static int correct = 0; 
		static int incorrect = 0;
      
      static int redGuess = 0;
      static int greenGuess = 0; 
      static int blueGuess = 0; 
      static int orangeGuess = 0;
      static int yellowGuess = 0;
      
      static String userColor;
      static String comColor;

    public static void main(String[] args) 
    {

      //Announcement about ESP game       
		welcomeGamer();
      
      for(int i = 0; i<10; i++)
      {
         /**
         * Method should return the user's choice.
         * @return The user's choice of "Red","Blue","Green","Orange" or "Yelllow".
         */
   		userColor = inputColor();
         
         /**
         * Method should generate a computers random choice and then return the
         * value.
         * @return The computer's choice of "Red","Blue","Green","Orange" or "Yelllow".
         */		
         comColor = computerColor();
         
         /**
         * Method should compare user-color and computer's color, 
         * print the result and count color guess
         */	
         colorGuess(userColor,comColor);            
      }
      
      printCounter();

   }//end main method
  
	public static void welcomeGamer()
   {
 
		System.out.println("Welcome to the ESP Game."+
							"\nTry to guess the same color as the computer. There are 10 attempts.");
	}
 
	public static String inputColor()
   {
      
   	System.out.println("Please enter your choice of color: "+
   						"\nRed" +"/Green" + "/Blue" +	"/Orange" +	"/Yellow");
          
      Scanner keyboard = new Scanner(System.in);
    
   	userColor = keyboard.nextLine();
      
      return userColor;
	}
 
	public static String computerColor(){
      int computerNum; // for random number
      String comColor = " ";
      
      Random rand = new Random();
 
		computerNum = rand.nextInt(4);
 
   	if (computerNum == 0)
      {
   		comColor = "red";
		}
   	else if(computerNum == 1)
      {
   		comColor = "green";
		}
   	else if(computerNum == 2)
      {
   		comColor = "blue";
		}
   	else if(computerNum == 3)
      {
   		comColor = "orange";
		}
   	else if(computerNum == 4)
      {
   		comColor = "yellow";
		}
      
      return comColor;
	}
 
   public static void colorGuess(String userColor, String comColor) 
   {	
      	                                    
      System.out.println("Computer color is " + comColor);
      
      //Compare user-color and com-color, and print result
      judgeIfLucky(userColor,comColor);
      //count user color
      colorCounter(userColor);        

   } // end colorGuess method
   
   public static void judgeIfLucky(String uColor,String cColor)
   {
      if(uColor.equalsIgnoreCase(cColor))
      {
			System.out.println("Lucky! You guessed the same color as the computer.\n");
			correct ++;	
 		}
   	else 
      {
			System.out.println("Sorry! Guess again.\n");
		   incorrect ++;
		}      
   }
   
   public static void colorCounter(String uColor)
   {
         //count the number of your correct guess of each color
     		if(uColor.equalsIgnoreCase("red"))
         {           
     			redGuess ++;
     		}
     	   else if(uColor.equalsIgnoreCase("green"))
         {
     		   greenGuess ++;
     		}
     	   else if(uColor.equalsIgnoreCase("blue"))
         {
     		   blueGuess ++;
     	   }
     	   else if(uColor.equalsIgnoreCase("orange"))
         {
     		   orangeGuess ++;
     	   }
     	   else if(uColor.equalsIgnoreCase("yellow"))
         {
     		   yellowGuess ++;
     	   }
     	   else 
         {
     		   System.out.println("Invalid Color");
     	   }
   }
   
   public static void printCounter()
   {
      System.out.println("The Results of the game are in!"+
					"\nPlayer 1:"+
					"\nCorrect guesses: " + correct  +
					"\nIncorrect guesses: " + incorrect +
					"\nRed guesses: "	+ redGuess +								
					"\nGreen guesses: "	+	greenGuess +					
					"\nBlue guesses: "  + blueGuess +
					"\nOrange guesses: "  + orangeGuess +
					"\nYellow guesses: "  + yellowGuess );
   }

}
