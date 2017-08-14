/*
 * @author Sayaka Tamura
 * 2014/03/10
 */
 
 import java.util.Scanner;
public class Bookpoints {
    
    public static void main(String[] args) {
      //Declare variable 
      int books;
      int points;
      
      //Create scanner object
      Scanner keyboard = new Scanner(System.in);
      
      //Ask user for the number of books purchased this month
      System.out.println("Enter the number of books purchased this month");
      
      //Accept the number
      books = keyboard.nextInt();
      
      //Testing the number for determining the award points
      
      if(books<1)
      points =0;
      else if(books==1) 
      points =5;
      else if(books==2) 
      points =15;
      else if (books==3)
      points =30;
      else 
      points =60;
      
      //display the number of points awarded
       System.out.println("You earn " + points +" points.");


    }
}