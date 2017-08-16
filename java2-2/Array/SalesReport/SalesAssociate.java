/**
 * Created by Sayaka Tamura on 10/8/2016.
   File name: SalesAssociate.java
  // Class for sales associate records.   
*/
 
import java.util.Scanner;

public class SalesAssociate
{
	private String name;
	private double sales;

	public SalesAssociate( )
	{
		name = "No record";
		sales = 0;
	}

	public SalesAssociate(String initialName,
						  double initialSales)
	{
		name = initialName;
		sales = initialSales;
	}

	public void set(String newName, double newSales)
	{
		name = newName;
		sales = newSales;
	}

	public void readInput( )
	{
		System.out.print("Enter name of sales associate: ");
		Scanner keyboard = new Scanner(System.in);
		name = keyboard.nextLine( );

		System.out.print("Enter associate’s sales: $");
		sales = keyboard.nextDouble( );
	}

	public void writeOutput( )
	{
		System.out.println("Sales associate: " + name);
		System.out.println("Sales: $" + sales);
	}

	public String getName( )
	{
		return name;
	}

	public double getSales( )
	{
		return sales;
	}
}


