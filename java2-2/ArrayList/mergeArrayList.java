/*
 Created by Sayaka Tamura on 11/15/2016.
*/

/*
 Write a method merge which takes two array lists as parameters.
 The method will merge the array lists,
 alternating elements from both array lists,
 and return the merged array list.
 If one is shorter than the other,
 then alternate as long as you can and then append the elements
 from the longer array list. For example,

 if  a is
 1, 4, 9, 16
 and b is 	 9, 7, 4, 9, 11, 15
 then the merge returns the array list
 1, 9, 4, 7,  9, 4, 16, 9, 11, 15

 */
 
import java.util.ArrayList;
import java.util.Scanner;

public class mergeArrayList
{
	public static void main(String[] args)
	{
		Scanner list1 = new Scanner(System.in);
		Scanner list2 = new Scanner(System.in);
		ArrayList<Integer> arraylist1 = new ArrayList<Integer>();
		ArrayList<Integer> arraylist2 = new ArrayList<Integer>();
		ArrayList<Integer> mergelist = new ArrayList<Integer>();

		System.out.println("Enter Array of numbers in First set, type 0 when finished");
		int in = list1.nextInt();

		while(in != 0)
		{
			arraylist1.add(in);
			in = list1.nextInt();
		}

		System.out.println("End of First Set");

		System.out.println("Enter Array of numbers in Second set, type 0 when finished");
		int in2 = list2.nextInt();

		while(in2 != 0)
		{
			arraylist2.add(in2);
			in2 = list2.nextInt();
		}

		System.out.println("End of Second Set");
      System.out.println("The marge list is...");

		//Merge list
		for(int i=0;i<Math.max(arraylist1.size(),arraylist2.size());i++)
		{
			if(i<arraylist1.size())
				mergelist.add(arraylist1.get(i));
			if(i<arraylist2.size())
				mergelist.add(arraylist2.get(i));
		}

		for (int i = 0; i < mergelist.size(); i++) {
			System.out.print(mergelist.get(i).toString() + " ");
		}
	}

}
