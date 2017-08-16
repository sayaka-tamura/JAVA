/**
 * Created by Sayaka Tamura on 9/12/2016.
   File name: MakeArray.java
   Result ex:
    Enter 5 items: 
    10
    505
    3
    48
    69
    The number in reverse order are: 
    69 48 3 505 10 
      
 */
 
import java.util.*;


public class MakeArray {
	public static void main(String[] args) {

		int[] items = new int[5];
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter 5 items: ");

		//input the values to the array
		for (int i = 0; i < items.length; i++) {
			items[i] = keyboard.nextInt();
		}
      
      //display the array in reversed order
		System.out.println("The number in reverse order are: ");
		for (int i = items.length-1; i >= 0; i--) {
			System.out.print(items[i] + " ");
		}

		System.out.println();
	}
}
