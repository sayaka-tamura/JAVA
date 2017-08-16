/**
 *
 * @author Sayaka Tamura
 * @version 1.00 14/03/14
 */
// Needed for the Scanner class
import java.util.Scanner;

public class SumOfNumbers {
    
	public static void main(String[] args) {
		
	//Declare variables
	int number;
	int sum = 0;
	int X =1;
		
	//Create Scanner object
	Scanner keyboard = new Scanner(System.in);
		
	//Ask users for the number more than 0
	System.out.println("Enter a number more than 0");
	
	//Accept the number
	number = keyboard.nextInt();
	
	//Create while loop for culcurating the sum of all integers from 1 up to the number
	while (X<=number)
	{	
		System.out.println(sum + "+" + X);
		sum = sum + X;
		X++;
	}
	
	//Display the total sum
	System.out.print("The sum of all integers from 1 up to the number is " + sum);
	

    }
}