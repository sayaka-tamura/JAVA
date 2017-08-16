/**
 * Created by Sayaka Tamura on 10/31/2016.
 */
public class Ship
{
	private String name;
	private int year;

	public Ship(String n, int y)
	{
		this.name = n;
		this.year = y;
	}

	//Setter
	public void setName(String n)
	{
		this.name = n;
	}

	public void setYear(int y)
	{
		this.year = y;
	}

	//Getter
	public String getName()
	{
		return this.name;
	}

	public int getYear()
	{
		return this.year;
	}

	public String toString()
	{
		return("Name: " + this.name +"\nThe year of built: " + this.year);
	}
}
