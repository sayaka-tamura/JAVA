/**
 Prepare a sales report showing
 	#which sales associate has the highest sales
 	#how each associate’s sales compare to the average.
 needed for each associate
 	#name
 	#sales figures
 tasks
 	#obtain the data (getFigures)
 	#display the results (displayResults –highest sale, average sale, associates’ performance comparing to the average)
 The program uses an array to keep track of the data for all sales associates.
 */
 
/**
 * Created by Sayaka Tamura on 10/8/2016.
   File name: SalesReport.java
   Result ex:
   
 */

import java.util.Scanner;

public class SalesReport
{
	private double highest;
	private double average;
	private SalesAssociate[] record; //The array object is created in getFigures.
	private int numberOfAssociates; //Same as record.length

	public void getFigures( )
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter number of sales associates:");
		numberOfAssociates = keyboard.nextInt( );
		record = new SalesAssociate[numberOfAssociates];
		int i;
		for (i = 0; i < numberOfAssociates; i++)
		{
			record[i] = new SalesAssociate( );
			System.out.println("Enter data for associate " + (i + 1));
			record[i].readInput();
			System.out.println();
		}
	}

	/**
	 Computes the average and highest sales figures.
	 Precondition: There is at least one salesAssociate.
	 */
	public void update()
	{
		int i;
		double currentSales = record[0].getSales( );
		highest = currentSales;
		double sum = currentSales;

		for (i = 1; i < numberOfAssociates; i++)
		{
			currentSales = record[i].getSales( );
			sum = sum + currentSales;

			if (currentSales > highest)
				highest = currentSales; //highest sales
										// figure so far.
		}

		average = sum/numberOfAssociates;
	}

	/**
	 Displays sales report on console screen.
	 */
	public void displayResults()
	{
		System.out.println("Average sales per associate is $" + average);
		System.out.println("The highest sales figure is $" + highest);

		System.out.println();

		int i;
		System.out.println("The following had the highest " + "sales:");
		for (i = 0; i < numberOfAssociates; i++)
		{
			double currentSales = record[i].getSales();

			if (currentSales == highest)
			{
				record[i].writeOutput( );
				System.out.println("$" + (currentSales - average) + " above the average.");
				System.out.println( );
			}
		}

		System.out.println("The rest performed as follows:");
		for (i = 0; i < numberOfAssociates; i++)
		{
			double currentSales = record[i].getSales( );
			if (record[i].getSales( ) != highest)
			{
				record[i].writeOutput( );
				if (currentSales >= average)
					System.out.println("$" + (currentSales - average) + " above the average.");
				else
					System.out.println("$" + (average - currentSales)+ " below the average.");

				System.out.println( );
			}
		}
	}

	public static void main(String[] args)
	{
		SalesReport clerk = new SalesReport();
		clerk.getFigures( );
		clerk.update( );
		clerk.displayResults( );
	}

}
