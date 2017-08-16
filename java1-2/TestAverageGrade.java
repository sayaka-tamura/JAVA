/*
   Author : Sayaka Tamura
   Result example:     
   Enter your 1st score
   80
   Enter your 2nd score
   50
   Enter your 3rd score
   44
   Enter your 4th score
   60
   Enter your 5th score
   70
   Your grade is D
*/

import java.util.Scanner;

public class TestAverageGrade {
   public static void main(String[] args) {
   //Declare variables
      double s1;
      double s2;
      double s3;
      double s4;
      double s5;
      double t;
      char grade;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter your 1st score");
      s1 = keyboard.nextDouble();
      
      System.out.println("Enter your 2nd score");
      s2 = keyboard.nextDouble();
      
      System.out.println("Enter your 3rd score");
      s3 = keyboard.nextDouble();


      System.out.println("Enter your 4th score");
      s4 = keyboard.nextDouble();
      
      System.out.println("Enter your 5th score");
      s5 = keyboard.nextDouble();
      
      t = calAverage(s1, s2, s3, s4, s5);
      grade = determineGrade(t);
      showGrade(grade);
                      
   }
   
   public static double calAverage(double score1, double score2, double score3, double score4, double score5)
   {
      return (score1+score2+score3+score4+score5)/5.0;
   }
   
   public static char determineGrade(double t)
   {
      char grade = ' ';
      
      if(t>=90&&t<=100)
      {
         grade='A';
      }
      if(t>=80&&t<=89)
      {
         grade='B';
      }
      if(t>=70&&t<=79)
      {
         grade='C';
      }
      if(t>=60&&t<=69)
      {
         grade='D';
      }
      if(t<=59)
      {
         grade='F';
      }
      
      return grade; 
   }
   
   public static void showGrade(char grade)
   {
      System.out.println("Your grade is " + grade);
   }
  
}
