/*
   Author : Sayaka Tamura
   File name: Die.java
   ///The Die class simulates a six-sided and a 12-sided die
*/

import java.util.Random;

public class Die
{
   private int sides; // Number of sides
   private int value ; // The die's value
 
   /* 
      The conatructor performs an initial roll of the die.
      @param numSide a The number of sides for this die 
   */
   
   public Die(int numSides)
   {
      sides = numSides;
      roll();
   }
    
   /** 
      The roll method simulates the rolling of the die. 
   */
   
   public void roll()
   {
      // Creat e a Random object.
      Random rand = new Random(); 
      
      // Get a random value for the die.
      value = rand.nextInt(sides) + 1 ; 
   }
   
   /* getSide s method
      @return The number of sides for this die
   */
    
   public int getsides()
   {
      return sides;
   }
   
   /* getValue method 
      @return The value of the die 
   */
   
   public int getValue()
   {

      return value;
   } 
} 
   