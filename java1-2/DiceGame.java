//Author : Sayaka Tamura

import java.util.Scanner;
import java.util.Random;

/* This program simulates the rolling of dice.*/
public class DiceGame {
   public static void main(String[] args) {
   //Declare variables
      int userDie; // To hold the value of userDie 
      int comDie; // to hold the value of comDie
      int userWin=0;
      int comWin=0;
      
      // Create a Scanner object to read keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Create a Random object to generate random numbers.
      Random rand = new Random();
      
      // Create Loop for rolling the dice 10 times.
      for (int times=1;times<=10;times++)
      {
         System.out.println("Rolling the dice ...");
         //Make random number in the range of 1 through 6 for user and computer
         userDie = rand.nextInt(6) + 1;
         comDie = rand.nextInt(6) + 1;
         
         //Display the result of random number
         System.out.println("Their values are:");
         System.out.println(userDie + " vs " + comDie);
         
         //Compare the value of dice for deciding which is a winner
         if(userDie > comDie)
         {
            //Display the result that user win
            System.out.println("User win!");
            //count the number of win for user
            userWin++;
         }
         else if(userDie < comDie)
         {
            //Display the result that computer win
            System.out.println("Computer win!");
            //count the number of win for computer
            comWin++;
         }
         else
         {
            //Display the result of draw
            System.out.println("Draw, no winner.");
         } 
      }
      
      //Compare the number of win for deciding who is the grand winner
      if(userWin > comWin)
      {
         //Display the result that the user is the grand winner
         System.out.println("The grand winner is the user.");
      }
      else if(userWin < comWin)
      {
         //Display the result that the computer is the grand winner
         System.out.println("The grand winner is the computer.");
      }
      else
      {
         //Display the result of draw
         System.out.println("The result is draw. No grand winner.");
      }
      
   }
}
