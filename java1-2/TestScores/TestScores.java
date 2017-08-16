/*
   Author : Sayaka Tamura
   File name: RetailItem.java
   Purpose: initialize score 1 to score 3
          : make constructors for overload
          : make setter for all score 
          : make a method to calculate the average score
*/

public class TestScores
{
   private double score1;
   private double score2;
   private double score3;
      
   public TestScores()
   {
      score1 = 0;
      score2 = 0;
      score3 = 0;
   }

   public TestScores(double s1, double s2, double s3)
   {
      score1 = s1;
      score2 = s2;
      score3 = s3;
   }
   
   public void setTestScore(double s1,double s2,double s3)
   {
      score1 = s1;
      score2 = s2;
      score3 = s3;
   }
               
   public double getAverage()
   {
      double average;
      average = (score1+score2+score3)/3;
      return average;
   }

}
