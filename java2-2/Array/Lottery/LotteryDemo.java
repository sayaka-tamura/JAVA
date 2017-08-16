/**
 * Created by Sayaka Tamura on 9/28/2016.
   File name: LotteryDemo.java
   Result ex:
   5 
   1 
   3 
   8 
   0 
   
   Please pick 5 single digit numbers
   5
   1
   3
   8
   0
   There are 5 matching pairs.
*/

import java.util.Scanner;

public class LotteryDemo {
	public static void main(String[] args) {
		Lottery lottery = new Lottery();

		int[] winningNums = lottery.getLotteryNumbers();

		for (int n : winningNums)
			System.out.println(n + " ");

		System.out.println();
		int[] picks = getUserPicks();
		int digits=lottery.matchDigits(picks);
		System.out.println("There are "+ digits + " matching pairs.");
	}

	public static int[] getUserPicks()
	{
		System.out.println("Please pick 5 single digit numbers");
		Scanner keyboard = new Scanner(System.in);

		int[] userPicks = new int[5];
		for(int i=0; i<userPicks.length; i++)
		{
			userPicks[i]=keyboard.nextInt();
		}
		return userPicks;
	}


}
