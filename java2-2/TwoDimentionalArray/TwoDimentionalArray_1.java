/**
 * Created by Sayaka Tamura on 9/29/2016.
   file name: TwoDimentionalArray_1.java
   Result ex:
 74	43	43	6	57	52	24	17	9	
 14	53	70	55	49	86	25	87	52	
 81	47	74	66	36	46	10	67	59	
 58	32	85	39	69	9	72	58	25	
 58	41	99	6	23	71	17	79	18	
 2	80	57	10	35	68	47	71	90	
 table.length=6
 table[0].length=9
 twoDArray.length=3
 twoDArray[0].length=4
 */

import java.util.*;

public class TwoDimentionalArray_1
{
   public static void main(String[] args)
   {
      int[][] table = new int[6][9]; 
      
      table[0][0]=13;
      table[0][1]=5; 
      table[0][2]=15;
      table[0][3]=7; 
      
      table[1][0]=8;
     
     Random rand = new Random();
     
     int rows= 6;
     int cols =9;
     
     //initialize the array by using random numbers 0-99
     for(int r=0; r<table.length; r++)
     {
         for(int c=0; c<table[0].length; c++)
            table[r][c]=rand.nextInt(100);
     }
     
     //display table     
     for(int r=0; r<rows; r++)
     {
         for(int c=0; c<cols; c++)
             System.out.print(table[r][c]+ "\t");  
        
         System.out.println();

     }

     System.out.println("table.length="+table.length);
     System.out.println("table[0].length="+table[0].length);
     

     
     int[][] twoDArray = {{3, 5, 2, 1},
                          {23, 4, 1,6},
                          {4, 8, 0, 2}};
     System.out.println("twoDArray.length="+twoDArray.length);
      System.out.println("twoDArray[0].length="+twoDArray[0].length);


      
     /*
      * * * *
      * * * *
      * * * *
    
     int cols =7;
     int rows =9;
     for(int r=0; r<rows; r++)
     {
         for(int c=0; c<cols; c++)
           System.out.print("* ");  
        
          System.out.println();
     }
     */
   }    

    
}