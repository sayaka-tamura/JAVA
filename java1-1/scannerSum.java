/**
 *
 * @author Sayaka Tamura
 */
import java.util.Scanner; // Needed for the Scanner class

public class ScannerSum {
    
    public static void main(String[] args) {
        //Declare variables
        int n1;
        int n2;
        int sum;
        //Create scanner object
        Scanner keyboard = new Scanner(System.in);
        //Ask user for first number
        System.out.println("What's first number?");
        //Accept first number
        n1 = keyboard.nextInt();
        //Ask user for second number
        System.out.println("What's second number?");
        //Accept second number
        n2 = keyboard.nextInt();
        //Calculate sum
        sum = n1+n2;
        //Display sum
        System.out.println("The sum is " + sum);
    }
}