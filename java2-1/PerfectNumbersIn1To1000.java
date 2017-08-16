
/**
 * Created by Sayaka Tamura on 9/11/2016.
   File name: PerfectNumbersIn1To1000
   Result ex:
   
 */

public class PerfectNumbersIn1To1000 {
	public static void main(String[] args){

		System.out.println("A perfect numbers in 1 to 1000 are ");

		for(int i= 1; i<=1000; i++)
		{

			if(isPerfect(i))
				System.out.println(i);
		}

	}

	/*
	 This is to determine whether a number is a perfect number.
	 @param num an integer
	 @return whether a number is a perfect number.
	 */

	public static boolean isPerfect(int n)
	{
		/*
		A number is a perfect number if its factors,
		including 1 (but not the number itself), sum to the number.
		*/

		int sum=0;

		for(int i=1; i<n; i++)
		{
			if(n%i==0) // if num is divisible by i
			{
				sum+=i;
			}
		}

		if(sum==n)
			return true;
		else
			return false;
	}

}
