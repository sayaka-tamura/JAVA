/***
 * @author Sayaka Tamura
 */
import java.util.Scanner; // Needed for the Scanner class

public class scoreAverage {
    
    public static void main(String[] args) {
        //Declare variables
        double score1;
        double score2;
        double score3;
        double average;
        //Create scanner object
        Scanner keyboard = new Scanner(System.in);
        
        //Ask user for scores
        System.out.println("What's your first score1?");
        //Accept user for scores
        score1 = keyboard.nextInt();
        //Display user for scores
        System.out.println("Your first score is " + score1);
        
        //Ask user for scores
        System.out.println("What's your second score2?");
        //Accept user for scores
        score2 = keyboard.nextInt();
        //Display user for scores
        System.out.println("Your second score is " + score2);
        
        //Ask user for scores
        System.out.println("What's your third score3?");
        //Accept user for scores
        score3 = keyboard.nextInt();
        //Display user for scores
        System.out.println("Your third score is " + score3);
        
        //Calculate average
        average = score1 + score2 + score3 / 3;
        //Display average
        System.out.println("The average of Your scores" + average);
    }
}