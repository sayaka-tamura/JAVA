/**
 * Created by Sayaka Tamura on 10/31/2016.
 */
public class TapeStore
{
	public static void main ( String args[] )
	{
		videoTape vd = new videoTape("Microcosmos", 90 );
		Movie mv = new Movie("Jaws", 120, "Spielberg", "PG" );
		ScienceFictionMovie sf =  new ScienceFictionMovie("Terminator",120,"James Cameron","R (N/A)","Harlan Ellison");

		vd.show(); // call the show() method defined in VideoTape.
		mv.show(); //call the show() method defined in Movie.
		sf.show();

	}
}
