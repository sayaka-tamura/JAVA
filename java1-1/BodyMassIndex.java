/*
 * @author Sayaka Tamura
*/
 
import java.util.Scanner; 
public class BodyMassIndex {
    
    public static void main(String[] args) {

               double weight;
               double height;
               double BMI;
        //Create scanner object
             Scanner keyboard = new Scanner(System.in);
        //Ask user for a personÅfs weight
             System.out.println("Enter a personÅfs weight by pounds");
        //Accept the number
             weight = keyboard.nextDouble();

        //Ask user for a personÅfs weight
             System.out.println("Enter a personÅfs height by inches");
        //Accept the number
             height = keyboard.nextDouble();

        //Calculate a person's BMI
             BMI = (weight*703) / (height*height);
        //Display the result
              if (BMI < 18.5) { 
              System.out.println("The parson's weight is underweight"); 
              } else if (BMI >= 18.5 && BMI <= 25) { 
              System.out.println("The parson's weight is optimal weight"); 
              } else if (BMI > 25) { 
              System.out.println("The parson's weight is overweight"); 
              } 
    }
}
