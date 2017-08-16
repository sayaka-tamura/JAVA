/**
 * Created by Sayaka Tamura on 9/14/2016.
   File name: CellphoneDemo.java
   Result ex:
 Enter the manufacturer: verizon
 Enter the model number: 111
 Enter the retail price: 90
 
 Here is the data that you provided:
 Manufacturer: verizon
 Model number: 111
 Retail price : 90.0
 */

import java.util.Scanner;
	/*
		This program runs a simple test of the CellPhone class.
	*/

public class CellphoneDemo {

	public static void main(String[] args)
	{
		String testMan; // To hold a manufacturer
		String testMod; // To hold a model number
		double testPrice; // To hold a price

		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Get the manufacturer name.
		System.out.print("Enter the manufacturer: ");
		testMan = keyboard.nextLine();

		// Get the model number.
		System.out.print("Enter the model number: ");
		testMod = keyboard.nextLine();

		// Get the retail price.
		System.out.print("Enter the retail price: ");
		testPrice = keyboard.nextDouble();

		// Create an instance of the Cellphone class.
		// passing the data that was entered as arguaents
		//to the constructor.

		CellPhone phone = new CellPhone(testMan, testMod, testPrice);

		// Get the data from the phone and display it.
		System.out.println();
		System.out.println("Here is the data that you provided:");
		System.out.println("Manufacturer: " + phone.getManufact());
		System.out.println("Model number: " + phone.getModel());
		System.out.println("Retail price : " + phone.getRetailPrice());
	}
}
