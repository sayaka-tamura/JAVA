/**
 * Created by Sayaka Tamura on 11/7/2016.
 */
public class Toy extends Goods implements Taxable
{
	private int minimumAge;
	public Toy(String des, double pr, int min)
	{
		super(des, pr);
		minimumAge = min ;
	}

	public void display()
	{
		super.display() ;
		System.out.println("minimum age: " + minimumAge );
	}

	public double calculateTax()
	{
		return price * taxRate;
	}
}
