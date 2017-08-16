/*
   Author : Sayaka Tamura
   File name: PerfectNumbers.java
   Result ex:
 The program will check whether the number you typed is a perfect number or not. Enter an integer:
 Enter an integer:
 6
 6 is a perfect number
*/


import java.util.*;

public class PerfectNumbers{
   public static void main(String[] args){
      System.out.println("The program will check whether the number you typed is a perfect number or not. Enter an integer:");
      System.out.println("Enter an integer:");
      Scanner keyboard = new Scanner(System.in);
      int num = keyboard.nextInt();
      
      if(isPerfect(num))
         System.out.println(num+" is a perfect number");
      else
         System.out.println(num+" is not a perfect number");
   }

   //find the factors of num
   //@param int n number = user-input   
         
   public static boolean isPerfect(int n)
   {
      int sum=0;
   
      for(int i=1; i<n; i++)
      {  
         if(n%i==0)
         {
            sum+=i;
         }
      }
         
      if(sum==n)
         return true;
      else 
         return false;   
   }
}