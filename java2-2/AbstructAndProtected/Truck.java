/**
 * Created by Sayaka Tamura on 11/29/2016.
 */
public class Truck extends Vehicle
{
	private int numberOfAxels;

	public Truck(String owner, String regNo, int axels)
	{
		super(owner,regNo);
		numberOfAxels = axels;
	}

	public void displayInfo()
	{
		System.out.println("Owner: " + owner +
							"\nRegistration No.: " + regNo +
							"\nNumber of Axcels: " + numberOfAxels);
	}
}
