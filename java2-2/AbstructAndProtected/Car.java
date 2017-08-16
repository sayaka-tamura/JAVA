/**
 * Created by Sayaka Tamura on 11/3/2016.
 */
public class Car extends Vehicle
{
	private int numOfDoors;

	public Car(String owner, String regNo, int doors)
	{
		super(owner,regNo);
		numOfDoors = doors;
	}

	public void displayInfo()
	{
		System.out.println("Owner: "+ owner +
							"\nRegistration No."+ regNo +
							"\nNumber of doors: " + numOfDoors);
	}
}
