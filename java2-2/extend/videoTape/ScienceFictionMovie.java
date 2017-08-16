/**
 * Created by Sayaka Tamura on 10/31/2016.
 */
public class ScienceFictionMovie extends Movie
{
	protected String fictionAuthor;


	public ScienceFictionMovie( String ttl, int lngth, String dir, String rtng, String author )
	{
		super( ttl, lngth, dir, rtng);
		fictionAuthor=author;
	}
	public void show()
	{
		super.show();
		System.out.println("Authored by:" +fictionAuthor);
	}
}
