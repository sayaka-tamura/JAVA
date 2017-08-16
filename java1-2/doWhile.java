/**
 *
 * @author Sayaka Tamura
 * @version 1.00 14/03/20
 */
import java.util.Scanner;
public class doWhile {
    
    public static void main(String[] args) {
        int number;

        Scanner keyboard = new Scanner(System.in);
                
        do
        {   
        	System.out.println("Enter a number in the range of 1 to 4");
        	number = keyboard.nextInt();
        } while(number<1||number>4);
         
        System.out.println("Your number is " + number + ". It's validate.");
    }
}