/**
 * Created by Sayaka Tamura on 11/8/2016.
   file name: MultTableDemo.java
   Result ex)
    *	0	1	2	
 -----------------
 0|	0	0	0	
 1|	0	1	2	
 2|	0	2	4
 */
 
public class MultTableDemo
{
	public static void main(String[] args)
	{
		int [][] table1 = new int [4][4];

		System.out.print("*"+"\t");
		//For row name
		for(int colName = 0; colName<table1.length-1;colName++)
			System.out.print(colName+"\t");

		System.out.println("\n-----------------");

		registerValue(table1);

		displayTable(table1);

	}

	private static void registerValue(int[][] table1)
	{
		//loop for rows
		for(int i = 1; i< table1.length;i++)
		{
			//loop for columns
			for (int j = 1; j < table1[0].length; j++)
			{
				if((i>0)&&(j>0))
					table1[i][j] = (i-1)*(j-1);
			}
		}
	}

	private static void displayTable(int[][] table1)
	{
		for(int i = 1; i< table1.length;i++)
		{
			System.out.print((i-1) + "|\t");

			for(int j=1; j<table1[0].length;j++)
			{
				System.out.print(table1[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
