/*
   Write a Java program that shows that the order of exception handlers is important. 
   If you try to catch a superclass exception type before a subclass type, 
   the compiler should generate errors. Explain why these errors occur.
*/
/**
 * Created by Sayaka Tamura on 12/1/2016.
   file name: StringExceptionDemo.java
 */
public class StringExceptionDemo
{
	public static void main ( String[ ] args ) throws Exception
	{
		String courseName ="Computer Programming";
		try
		{
			for (int i = 0; i <= courseName.length(); i++)
				System.out.print(courseName.charAt(i));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("String Index out of exception.");
			e.printStackTrace();
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("Index out of exception.");
			e.printStackTrace();

		}
		catch(Exception e)
		{
			System.out.println("Exception");
			e.printStackTrace();
		}
	}
}
