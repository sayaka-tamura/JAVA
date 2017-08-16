/*
   Author : Sayaka Tamura
   Result example:  
  Enter an item's wholesale cost
  50
  Enter an item's markup percentage in the range of 1 through 100.
  3
  Your retail price is 51.5   
*/

import java.util.Scanner;

public class WholeSale {
   public static void main(String[] args) {
   //Declare variables
      double wholeSaleCost;
      double markup;
      double retail;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter an item's wholesale cost");
      wholeSaleCost = keyboard.nextDouble();
      
      do{
      System.out.println("Enter an item's markup percentage in the range of 1 through 100.");
      markup = keyboard.nextDouble();
      }
      while(markup<0||markup>100);
      
      retail = CalculateRetail(wholeSaleCost,markup);
      System.out.println("Your retail price is "+ retail);
                
   }
   
   public static double CalculateRetail(double wholeSaleCost, double markup) {
      double retail;
      retail = wholeSaleCost + (wholeSaleCost*(markup/100));
      return retail;
   }
  
}
