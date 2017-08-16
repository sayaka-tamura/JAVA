import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Sayaka Tamura on 12/1/2016.
 */
public class FileInput {
	static void main (String[] args) throws Exception
	{
		File file = new File("input.java");
		Scanner fileIn = new Scanner(file);

		try
		{
			while(fileIn.hasNext())
			{
				int num = fileIn.nextInt();
				System.out.println(num);
			}
			fileIn.close();
		}
		catch (InputMismatchException e)
		{
			System.out.println("   ");
		}
		catch (IOException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
