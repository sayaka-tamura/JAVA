/**
 * Created by Sayaka Tamura on 12/14/2016.
   file name: IndexPractice.java
   
   Sample Output(ArrayIndexOutOfBoundsException)
      Enter the data:8
      Enter the array index:10
      This is your problem: 10
      Here is where it happened:
         java.lang.ArrayIndexOutOfBoundsException: 10
         at IndexPractice.main(IndexPractice.java:18)
      Good-bye
   
   Sample Output(InputMismatchException):
      Enter the data:rats
      This is your problem: null
      Here is where it happened:
      java.util.InputMismatchException
         at java.util.Scanner.throwFor(Unknown Source)
         at java.util.Scanner.next(Unknown Source)
         at java.util.Scanner.nextInt(Unknown Source)
         at java.util.Scanner.nextInt(Unknown Source)
         at IndexPractice.main(IndexPractice.java:15)
      Good-bye
 */
 
import java.util.*;

public class IndexPractice
{
	public static void main ( String[] args )
	{
		Scanner scan = new Scanner( System.in );

		int data=0, slot=0;
		int[ ] value = new int[10];

		try
		{
			System.out.print("Enter the data: ");
			data = scan.nextInt();
			System.out.print("Enter the array index: ");
			slot = scan.nextInt();
			value[slot] = data;
		}
		catch (InputMismatchException ex)
		{
			System.out.println("This is your problem: " +ex.getMessage()
								+ "\nHere is where it happened:\n");
			ex.printStackTrace();
		}
		catch (IndexOutOfBoundsException ex )
		{
			System.out.println("This is your problem: " + ex.getMessage()
									+ "\nHere is where it happened:\n");
			ex.printStackTrace();
		}

		System.out.println("Good-bye" );
	}
}
