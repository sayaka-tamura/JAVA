/**
 * Created by Sayaka Tamura on 12/5/2016.
 */
import java.util.*;
public class SquareUser
{
	public static void main ( String[] args )
	{
		Scanner scan = new Scanner(System.in);
		int num = 0;

		boolean goodData = false;

		while (!goodData)
		{
			System.out.print("Enter an integer: ");

			try
			{
				num = scan.nextInt();
				goodData = true;
			}
			catch (InputMismatchException ex)
			{
				System.out.println("You entered bad data.");
				System.out.println("Please try again.\n" );
				String flush = scan.nextLine();
			}
		}

		System.out.println("The square of " + num + " is " + num*num );

	}
}