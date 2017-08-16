/**
   Created by Sayaka Tamura on 11/8/2016.
   file name: MultTable.java

	 Write a class called MultTable that will be used to print out
	 a simple multiplication table.
	 The class has a two-dimensional array as data member.
	 we will need the following methods :

	 MultTable(int, int) - This constructor will take two parameters,
		the number of rows and the number of columns that will be in our table,
		and the value in each slot is the row number times column number.
      
	 displayTable - This method will return a string that represents
		the printed version of our two dimensional array.
		Rows will be separated by new line characters,
		and columns will be separated by tabs.

	 MultTable table = new MultTable(3, 3)
*/

public class MultTable
{
	private int row;
	private int col;

	public MultTable()
	{
		this.row = 0;
		this.col = 0;
	}

	public MultTable(int r, int c)
	{
		this.row = r;
		this.col = c;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

}
