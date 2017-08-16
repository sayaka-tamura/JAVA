//Author : Sayaka Tamura

//Needed inport Scanner Class
import java.util.Scanner;

public class HotelOccupancy{
   public static void main(String[] args){
   //Declare variables
   int numberOfFloor; //the number of floor in the hotel
   int numberOfRooms; //the number of room on the floor
   int occupiedRooms; //the number of room are occupied on the floor
   int totalOccupied=0;
   int totalRooms=0;
   int totalVacant;
   double occupancyRate;//occupancy rate for the hotel
   
   
   //Create Scanner Object
   Scanner keyboard = new Scanner(System.in);
   
   //Check the condition is more than 1 or not       
   do
   {
      //Ask user the number of floor in the hotel
      System.out.println("Enter the number of floor in the hotel");
      System.out.println("We don't accept a value less than 1");

      //Accept the number
      numberOfFloor = keyboard.nextInt();
   }
   while(numberOfFloor<1);
   
   //Create loop for iterating once for each floor
   for(int floor=1;floor<=numberOfFloor;floor++){
      
      //Check the condition is more than 10 or not       
      do
      {
         //Ask user the number of floor in the hotel
         System.out.println("Enter the number of room in the floor_"+ floor);
         System.out.println("We don't accept a value less than 10");
      
         //Accept the number
         numberOfRooms = keyboard.nextInt();
      }
      while(numberOfRooms<10);
      
      //Ask user the number of room are occupied on the floor
      System.out.println("Enter the number of room are occupied on the floor_"+ floor);
      //Accept the number
      occupiedRooms = keyboard.nextInt();
      

      //Calculate total number of rooms in the hotel
      totalRooms+=numberOfRooms;
      //System.out.println("total number of rooms in the hotel is "+ totalRooms);

      //Calculate total occupied rooms in the hotel
      totalOccupied+=occupiedRooms;
      //System.out.println("total occupied rooms in the hotel is "+ totalOccupied);
      
   }
   
   //Calculate the total number of vacant rooms in the hotel
   totalVacant = totalRooms-totalOccupied;
   
   //Calculate the occupancy rate in the hotel
   occupancyRate = (double) totalOccupied/totalRooms*100;
   
   
   //Display the number of rooms the hotel has, the number of them that are occupied, the number that are vacant, and the occupancy rate for the hotel.
   System.out.println("The total number of rooms in the hotel is "+ totalRooms);
   System.out.println("The total number of rooms are occupied in the hotel is "+ totalOccupied);
   System.out.println("The total number of vacant rooms in the hotel is "+ totalVacant);
   System.out.println("The the occupancy rate in the hotel is "+ occupancyRate); ///////didn't work this line well
   
   }
}

