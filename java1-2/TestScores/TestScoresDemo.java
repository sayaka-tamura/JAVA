/*
   Author : Sayaka Tamura
   File name: RetailItem.java
   Result ex:
    Type your first score.
 90
 Type your secind score.
 82
 Type your first score.
 84
 Your average of all your tests is: 85.33333333333333
*/

import java.util.Scanner;

public class TestScoresDemo
{
   public static void main(String[] args)
   {  
      double score1;
      double score2;
      double score3;
       
      Scanner keyboard = new Scanner(System.in);
      
      TestScores scores = new TestScores();
                    
      System.out.println("Type your first score.");
      score1 = keyboard.nextDouble();
      
      System.out.println("Type your secind score.");
      score2 = keyboard.nextDouble();

      
      System.out.println("Type your first score.");
      score3 = keyboard.nextDouble();
      

      scores.setTestScore(score1,score2,score3);
      
		//Show the average for all 3 scores
		System.out.println("Your average of all your tests is: " + scores.getAverage());
   }
}