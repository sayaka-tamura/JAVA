/*
   Author : Sayaka Tamura
   File name: CalculateFactor.java
   Result ex:
   Enter an integer:
 10
 The factors of 10 are 
 1, 2, 5, 10.
*/


import java.util.*;

public class CalculateFactor{
   public static void main(String[] args){
      System.out.println("Enter an integer:");
      Scanner keyboard = new Scanner(System.in);
      int num = keyboard.nextInt();

      //find the factors of num
      
      System.out.println("The factors of "+num+ " are ");
      
      for(int i=1; i<num; i++)
      {
         if(num%i==0)
            System.out.print(i+", ");
      }
      
      System.out.print(num+".");

   }
}