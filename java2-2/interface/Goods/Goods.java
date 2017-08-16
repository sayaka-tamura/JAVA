/**
 * Created by Sayaka Tamura on 11/7/2016.
 */
public class Goods {

	protected String description;
	protected double price;
	public Goods(String des, double pr )
	{
		description = des;
		price = pr;
	}
	public void display()
	{
		System.out.println( "item: " + description + "\nprice: " + price);
	}
}
