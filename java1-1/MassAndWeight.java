/*
 * @author Sayaka Tamura 
 */
 
import java.util.Scanner;
 
public class MassAndWeight {
    
    public static void main(String[] args) {
               double mass;
               double weight;
        //Create scanner object
             Scanner keyboard = new Scanner(System.in);
        //Ask user for an object's mass
             System.out.println("Enter an object's mass in kilogram");
        //Accept the number
             mass = keyboard.nextDouble();

        //Calculate the object's weight
             weight = mass*9.8;
        //Display the result
              if (weight < 10) { 
              System.out.println("the object's weight is " + weight +"kg."); 
              System.out.println("the object is too light."); 
              } else if (weight > 1000) { 
              System.out.println("the object's weight is " + weight +"kg."); 
              System.out.println("the object is too heavy."); 
              } else { 
              System.out.println("the object's weight is " + weight +"kg."); 
              } 

    }
}