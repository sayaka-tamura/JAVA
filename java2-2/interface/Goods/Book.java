/**
 * Created by Sayaka Tamura on 11/7/2016.
 */
public class Book extends Goods implements Taxable
{
	private String author;
	public Book(String des, double pr, String auth)
	{
		super(des, pr);
		author = auth ;
	}

	public void display()
	{
		super.display();
		System.out.println( "author: " + author );
	}

	public double calculateTax()
	{
		return price * taxRate;
	}
}

