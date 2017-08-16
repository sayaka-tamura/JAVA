/**
 * Created by Sayaka Tamura on 10/5/2016.
   file name: firstValueKeepChangingTwice.java
 *
 * Problem:
    Declare an array A of 10 rows and 20 columns of the type int.
    Initialize the array A to 1.
    Store 1 in the first row and 2 in the remaining rows
    Store 5 in the first column and make sure that the value in each subsequent column is twice the value in the previous column
    Print the array A one row per line
    Print the array A one column per line
 */

public class firstValueKeepChangingTwice
{
	public static void main(String[] args)
	{
		// Declare an array A of 10 rows and 20 columns of the type int.
		int [][] A = new int [10][20];

		//Initialize the array A to 1.
		/*
		for (int i=0; i<A.length;i++)
		{
			for(int j=0; j<A[0].length; j++)
			{
				A[i][j]=1;
			}
		}
		*/

		//Store 1 in the first row and 2 in the remaining rows
		for (int i=0; i<A.length;i++)
		{
			for(int j=0; j<A[0].length; j++)
			{
				if (i == 0)
				{
					A[i][j] = 1;
				}
            else
            {
					A[i][j] = 2;
				}
			}
		}
		/*
			Store 5 in the first column and make sure that
			the value in each subsequent column is twice the value
			in the previous column
		 */
		for(int i=0; i<A.length; i++)
		{
			for (int j = 0; j < A[0].length; j++)
         {
				A[i][j]=5*(int)Math.pow(2,j);
			}
		}

		displayTableByRow(A);
		displayTableByColumn(A);


	}

	// Print the array A one row per line
	public static void displayTableByRow(int[][] table)
	{
		for (int i=0; i<table.length; i++)
		{
			for (int j = 0; j < table[0].length; j++)
			{
				System.out.print(table[i][j] + "\t");
			}

			System.out.println();
		}
	}

	// Print the array A one column per line
	public static void displayTableByColumn(int[][] table)
	{
		for (int j = 0; j < table[0].length; j++)
		{
			for (int i=0; i<table.length; i++)
			{
				System.out.print(table[i][j] + "\t");
			}

			System.out.println();
		}
	}
}
