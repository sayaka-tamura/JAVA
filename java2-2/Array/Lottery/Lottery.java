/*
	Write a Lottery class that simulates a lottery.
	The class should have an array of five integers named lotteryNumbers.
	The class should have:
	*A constructor that uses the Random class to generate a random number
		in the range of 0 though 9 for each element in the array.
	*A method that accepts an array of five integers that represent a person’s lottery picks.
		This method is to compare the corresponding elements in the two arrays
		and return the number of digits that match.
	*A method return a copy of the lotteryNumbers array.
	*
	Demonstrate the class in the program that asks the user to enter five numbers.
	The program should display the number of digits that match the randomly generated lottery numbers.
	If all of the digits match, display a message proclaiming the user a grand prize winner.
*/
/**
 * Created by Sayaka Tamura on 9/28/2016.
   File name: Lottery.java
   Purpose: make a constructor used random method
            and make setter for it
            make matchDigits method
 */
 
import java.util.Random;

public class Lottery {

//	//	The class should have an array of five integers named lotteryNumbers.
	private int[] lotteryNumbers = new int[5];

	public Lottery()
	{
		Random rand = new Random();
		//repeat 5 times

		//generate a random integer between 0-9
		//insert the random number to lotteryNumbers array
		for(int i=0; i<lotteryNumbers.length; i++)
		{
			lotteryNumbers[i] = rand.nextInt(10);
		}

	}

	public int[] getLotteryNumbers()
	{
		return lotteryNumbers;
	}

	public int matchDigits(int[] userPicks)
	{
		//Compare userPicks with LotteryNumbers
		//find out the number of matching digits
		int matchingPairs=0;

		if(lotteryNumbers.length==userPicks.length)
		{
			for(int i=0; i<lotteryNumbers.length; i++)
			{
				if (lotteryNumbers[i] == userPicks[i])
					matchingPairs++;
			}
		}

		return matchingPairs;
	}

}

