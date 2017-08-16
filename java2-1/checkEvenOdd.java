/*
   Author : Sayaka Tamura
   File name: checkEvenOdd.java
   
   Result ex:
 Please Type a integer
 40
 a integer you typed is even number
 
 1 lb = 16 ozs
 40 ounces are equal to 2 lb(s) and 8ozs
 
 40 cookies are equal to 1 jar(s) and 10 cookies
 Each jar can hold 30 cookies.
 2 jars are needed!!

*/


import java.util.*;

public class checkEvenOdd{
   public static void main(String[] args)
   {
   
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Please Type a integer");
      
      int userInt = keyboard.nextInt();
      
      if((userInt%2)==0) //use % (modulus)to find out the remainder
      {
         System.out.println("a integer you typed is even number\n");   
      }
      else
      {
         System.out.println("a integer you typed is odd number\n");
      }
      
      //convert ozs to lbs and ozs
      //20ozs = 1 lb 4ozs
      int ounces = userInt;
      int lbs = ounces/16;
      int remainder = ounces%16;
      System.out.println("1 lb = 16 ozs");
      System.out.println(ounces+" ounces are equal to "+lbs+" lb(s) and "+remainder+"ozs\n");  
      
      // There are 100 cookies to be put into cookies jars 
      //Each jar can hold 30 cookies.
      //how many jars do i need at least?
      int cookies = userInt;
      int jar = 30;
      int numOfJars = cookies/jar;
      int leftoverCookies = cookies%jar;
      System.out.println(cookies+" cookies are equal to "+numOfJars+" jar(s) and "+leftoverCookies+" cookies");  
      System.out.println("Each jar can hold 30 cookies.");
      
      if(leftoverCookies!=0)
      {
         numOfJars++;
         System.out.println(numOfJars+ " jars are needed!!");  
      }
      else
      {
         System.out.println(numOfJars+ " jars are needed!!");  
      }
   }

}