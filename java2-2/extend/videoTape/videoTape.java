/**
 * Created by Sayaka Tamura on 10/31/2016.
 */
public class videoTape
{
	protected String title; // name of the item
	protected int length; // number of minutes
	protected boolean avail; // is the tape in the store?

	public videoTape(String ttl )
	{
		title = ttl;
		length = 90;
		avail = true;
	}
	public videoTape(String ttl, int lngth )
	{
		title = ttl;
		length = lngth;
		avail = true;
	}
	public void show()
	{
		System.out.println( title + ", " + length + " min. available:" + avail );
	}
}
