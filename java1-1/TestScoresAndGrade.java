<<<<<<< HEAD
/*
 * @author Sayaka Tamura
*/

// Needed for the Scanner class
import java.util.Scanner; 
public class TestScoresAndGrade {
    
    public static void main(String[] args) {
               int t1;
               int t2;
               int t3;
               double average;

        //Create scanner object
             Scanner keyboard = new Scanner(System.in);
        //Ask user for first score
             System.out.println("Enter first score");
        //Accept first score
             t1 = keyboard.nextInt();

        //Ask user for second score
             System.out.println("Enter second score");
        //Accept second score
             t2 = keyboard.nextInt();

        //Ask user for third score
             System.out.println("Enter third score");
        //Accept third score
             t3 = keyboard.nextInt();

        //Calculate the average of the test scores
             average = (t1+t2+t3) / 3;
        //Display the result
              if (average< 60) { 
              System.out.println("Your grade is F"); 
              } else if (average >= 60 && average <= 69) { 
              System.out.println("Your grade is D"); 
              } else if (average >= 70 && average <= 79) { 
              System.out.println("Your grade is C");  
              } else if (average >= 80 && average <= 89) { 
              System.out.println("Your grade is B"); 
              } else if (average >= 90 && average <= 100) { 
              System.out.println("Your grade is A"); 
              } 
    }
=======
/*
 * @author Sayaka Tamura
*/

// Needed for the Scanner class
import java.util.Scanner; 
public class TestScoresAndGrade {
    
    public static void main(String[] args) {
               int t1;
               int t2;
               int t3;
               double average;

        //Create scanner object
             Scanner keyboard = new Scanner(System.in);
        //Ask user for first score
             System.out.println("Enter first score");
        //Accept first score
             t1 = keyboard.nextInt();

        //Ask user for second score
             System.out.println("Enter second score");
        //Accept second score
             t2 = keyboard.nextInt();

        //Ask user for third score
             System.out.println("Enter third score");
        //Accept third score
             t3 = keyboard.nextInt();

        //Calculate the average of the test scores
             average = (t1+t2+t3) / 3;
        //Display the result
              if (average< 60) { 
              System.out.println("Your grade is F"); 
              } else if (average >= 60 && average <= 69) { 
              System.out.println("Your grade is D"); 
              } else if (average >= 70 && average <= 79) { 
              System.out.println("Your grade is C");  
              } else if (average >= 80 && average <= 89) { 
              System.out.println("Your grade is B"); 
              } else if (average >= 90 && average <= 100) { 
              System.out.println("Your grade is A"); 
              } 
    }
>>>>>>> f593ca5e163d1d71ee6cb2534f0366eef0b14678
}