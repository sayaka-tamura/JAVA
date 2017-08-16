//Author : Sayaka Tamura

import java.util.Scanner;

public class LoopYesNo{
   public static void main(String[] args){
   
        String reply;
        
        Scanner keyboard = new Scanner(System.in);
        
        do
        {
         System.out.println("Enter <yes> or <no>");
         reply = keyboard.nextLine();
        }
        while(!(reply.equals("yes"))&&!(reply.equals("no")));
        
        System.out.println("Your answer is " + reply);
   
   }

}
