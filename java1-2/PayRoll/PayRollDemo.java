/*
   Author : Sayaka Tamura
   File name: PayRollDemo.java
   Result ex:
 Enter an employee's name: john
 Enter the employee's ID number: 1234
 Enter john's hourly pay rate: 10
 Enter the hours worked by john: 8
 john's Gross Pay is $ 80
*/

import java.util.Scanner;

public class PayRollDemo 
{
	public static void main(String[] args)
	{
		//Create Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);
		
		//Get employee name
		System.out.print("Enter an employee's name: ");
		String testNam = keyboard.nextLine();
		
		//Get employee ID number
		System.out.print("Enter the employee's ID number: ");
		int testNum = keyboard.nextInt();
      
      //Create an instance of the Payroll class,
		//passing the data that was entered as arguments
		//to the constructor.
      PayRoll pay = new PayRoll(testNam, testNum);
		
		//Get employee hourly pay rate
		System.out.print("Enter " + testNam + "'s hourly pay rate: ");
		int testPayRate = keyboard.nextInt();
		
		//Get employee's hours worked
		System.out.print("Enter the hours worked by " + testNam + ": ");
		int testHoursWorked = keyboard.nextInt();
		
      //modify hour and hourly pay rate for the emplyeeInfo 
		pay.setHoursWorked(testHoursWorked);
		pay.setPayRate(testPayRate);			
		
		//Display the data
		System.out.println(testNam + "'s Gross Pay is $ " + pay.getGrossPay());

	}
}//end class