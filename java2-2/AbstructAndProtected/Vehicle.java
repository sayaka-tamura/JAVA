/**
 * Created by Sayaka Tamura on 11/3/2016.
 */
public abstract class Vehicle {

	protected String owner;
	protected String regNo;
	//protected int mileage;

	public Vehicle(String owner, String regNo)
	{
		this.owner = owner;
		this.regNo = regNo;
	}

	public abstract void displayInfo();

	public void transferOwnerShip(String newOwner)
	{
		owner = newOwner;
	}

	public void speedUp(){};

	public void brake(){};

	public void turnLeft(){};

}