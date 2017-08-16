/**
 * Created by Sayaka Tamura on 10/31/2016.
 */
public class ShipStore
{
	public static void main(String[] args)
	{
		Ship sp = new Ship("Microcosmos", 2010 );
		CruiseShip cs = new CruiseShip("Jaws", 2012, 350);

		System.out.println(sp);
		System.out.println(cs);
	}
}
