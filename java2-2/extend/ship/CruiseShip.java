/**
 * Created by Sayaka Tamura on 10/31/2016.
 */
public class CruiseShip extends Ship
{
	private int maxPassengers;

	public CruiseShip(String n, int y, int max)
	{
		super(n,y);
		this.maxPassengers = max;
	}

	//Getter
	public int getMaxPassengers() {
		return this.maxPassengers;
	}
	//Setter
	public void setMaxPassengers(int max) {
		this.maxPassengers = max;
	}

	public String toString()
	{
		String temp = super.toString();
		return temp+"\nMax number of passengers: "+maxPassengers;
	}

}
