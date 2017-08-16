//Author : Sayaka Tamura

import java.util.Scanner;

public class NestedLoops2 {
    
    public static void main(String[] args) {
    
      
      for(int x=0;x<=5;x++)
      {  
         System.out.print("#");
         
         for(int y=0;y<x;y++)
         {
            System.out.print(" ");
         }
         System.out.print("#");
         System.out.println();
      }
    }
}
