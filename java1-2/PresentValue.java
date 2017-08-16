/*
   Author : Sayaka Tamura

   Purpose: invest calculator 
*/


import java.util.Scanner;
 
public class PresentValue {
 
	public static void main(String[] args) {

      //System.out.println("This program will determine present value.");
		double present;
      double rate;
      double future;
		double years;
 
		// create a scanner object for keyboard input
		Scanner keyboard = new Scanner(System.in);
 
		System.out.print("Please enter the annual interest rate: ");
		rate = keyboard.nextDouble();
      
      System.out.print("Please enter what you want the future value to be: ");
		future = keyboard.nextDouble();
        
		System.out
				.print("Please enter the amount of years you will keep money in account: ");
		years = keyboard.nextDouble();
      
      //Call method(presentValue)
      present = presentValue(rate, future, years);
  
		System.out.println("You will need to invest $" + present
				+ " to reach your desired future value.");
	}
 
	public static double presentValue(double r,double f,double y) {
      double P;
   
		double firstExp = (1 + r);
 
		double secondValue = Math.pow(firstExp, y);
 
		P = f / secondValue;
      
      return P;
      
	}
 
}