/**
 * Created by Sayaka Tamura on 10/31/2016.
 */
public class Movie extends videoTape
{
	protected String director;
	protected String rating;

	public Movie( String ttl, int lngth, String dir, String rtng )
	{
		// use the super class's constructor
		super( ttl, lngth );
		// initialize what's new to Movie
		director = dir;
		rating = rtng;
	}

	public void show()
	{
		super.show();
		System.out.println( "dir: " + director + " " + rating );
	}

	public boolean isAvailable()
	{
		return avail;
	}

}