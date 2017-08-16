/**
 * Created by Sayaka Tamura on 11/29/2016.
 */
public class Motorcycle extends Vehicle
{
	private boolean hasSidecar;

	public Motorcycle(String owner, String regNo, boolean sidecar)
	{
		super(owner,regNo);
		hasSidecar = sidecar;
	}

	public void displayInfo()
	{
		System.out.println("Owner: " + owner +
				"\nRegistration No.: " + regNo +
				"\nNumber of Axcels: " + hasSidecar);
	}
}
