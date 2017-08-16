/**
 * Created by Sayaka Tamura on 11/3/2016.
 */
public class VehicleDemo
{
	public static void main(String[] args)
	{
		Car myCar = new Car("Amy", "100934",4);
		myCar.transferOwnerShip("Bob");
		myCar.displayInfo();

		Truck myTruck = new Truck("Tom","123456",5);
		myTruck.transferOwnerShip("Bob");
		myTruck.displayInfo();

		Motorcycle myMotorcycle = new Motorcycle("Bob","98765",true);
		myTruck.transferOwnerShip("Amy");
		myTruck.displayInfo();

	}
}
