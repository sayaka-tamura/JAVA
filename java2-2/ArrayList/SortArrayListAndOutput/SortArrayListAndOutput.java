/**
 * Created by Sayaka Tamura on 11/10/2016.
   File name: SortArrayListAndOutput.java
*/

import java.io.*;
import java.util.*;

/**
 Write a program that will read a text file containing names, //FileInput or Output
 and will make an alphabetical list of all the names in that file. //
 
 All names should be converted to upper case,
 and duplicates should be eliminated from the list.
 The list should be written to an output file selected by the user.
 Use a variable of type ArrayList<String> to store the words.
 */
public class SortArrayListAndOutput
{
	//3.IOException when u use io exception
	public static void main(String[]args) throws IOException
	{
		// Create a file object and connect a Scanner with the file
		File file = new File("nameList.txt");
		Scanner fileIn = new Scanner(file);

		//Array List for name list from a file
		ArrayList<String> nameList = new ArrayList<String>();


		//Read form the file using loop
		while(fileIn.hasNext())
		{
			//Read the first line from the file
			nameList.add(fileIn.nextLine());
		}

		//Sort the ArrayList alphabetically
		Collections.sort(nameList);

		//print out name list here and as doc
		printOutSortNameList(nameList);

		//Close the file
		fileIn.close();
	}

	private static void printOutSortNameList(ArrayList<String> nl) throws IOException
	{
		PrintWriter fileOut = new PrintWriter("nameList_sort.txt");
		int lineNumber = 1;

		for(int i=0;i<nl.size();i++)
		{
			//Display the line
			System.out.println("Name" + lineNumber + ": " + nl.get(i).toUpperCase());
			fileOut.println("Name" + lineNumber + ": " + nl.get(i).toUpperCase());
			lineNumber++;
		}

		fileOut.close();

	}

}
