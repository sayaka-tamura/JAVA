/**
 * Created by Sayaka Tamura on 9/29/2016.
   file name: TwoDimentionalArray_2.java
   Result ex:
   7	32	90	1	25	44	55	87	36	
   59	82	29	84	44	78	10	12	12	
   77	51	27	62	74	35	16	44	98	
   65	91	37	4	59	51	95	5	81	
   33	53	2	74	79	31	51	43	79	
   87	68	84	67	13	3	46	5	6	

   table.length = 6
   table.length[0] = 9
   The average of the table is 47.83
   The largest one is 98
 */
 
import java.util.*;

public class TwoDimentionalArray_2
{
	public static void main(String[] args)
	{

		int[][] table = new int[6][9];

		table = getTable(6,9);

		//display table
		displayTable(table);

		System.out.println("table.length = "+ table.length);
		System.out.println("table.length[0] = "+ table[0].length);

		//find the average of the table
		//calculate average as total/the number of elements
		System.out.printf("The average of the table is %.2f\n",
				findAverage(table));


		System.out.println("The largest one is " + findLargest(table));

	}

	public static void displayTable(int[][] array)
	{
		for (int r=0; r<array.length; r++)
		{
			for (int c = 0; c<array[0].length; c++)
			{
				System.out.print(array[r][c]+ "\t");
			}
			System.out.println();
		}
	}

	public static double findAverage(int[][]array)
	{
		//initialize an accumulator total as 0
		int total=0;

		//access each element of the table and add it to the total
		for (int r=0; r<array.length; r++)
		{
			for (int c = 0; c < array[0].length; c++)
			{
				total+=array[r][c];
			}

		}

		return (double)total/(array.length*array[0].length);
	}

   //This method generates Random number for two dimentional array
	public static int[][] getTable(int rows, int cols)
	{
		Random rand = new Random();
		int[][] array = new int[rows][cols];

		//initialize the array by random numbers 0-99
		for (int r=0; r<array.length; r++)
		{
			for (int c = 0; c < array[0].length; c++)
			{
				array[r][c]=rand.nextInt(100);
			}
		}

		return array;
	}
   
	public static int findLargest(int[][] array)
	{
		//find the largest element of the table
		//assume the first element is the largest one
		int largest = array[0][0];
		//compare the largest with each element of the array
		for (int r=0; r<array.length; r++)
		{
			for (int c = 0; c < array[0].length; c++)
			{
				//if any element is greater than the current largest one
				//update the largest as that element

				if(largest<array[r][c])
				{
					largest = array[r][c];
				}
			}
         
		}
		return largest;
	}
}


