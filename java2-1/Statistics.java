/*
   Author : Sayaka Tamura
   File name: Statistics.java
   Result ex:
 Please enter 5 integers
 10
 15
 60
 33
 55
 TOTAL = 173
 average = 34.6
*/

import java.util.*;

public class Statistics
{
   public static void main(String[] args)
   {
      
      System.out.println("Please enter 5 integers");
      Scanner keyboard = new Scanner(System.in);
      
      int total=0;
            
      for (int i=0; i<5; i++)
      {
         int num = keyboard.nextInt();
         total += num; 
      }
      
      System.out.println("TOTAL = "+total);
      
      //double avg = (double)total/5.0; OR
      double avg = total;
      System.out.println("average = "+avg/5.0);   
   }
}