/*
   Author : Sayaka Tamura
   File name: CarDemo.java
   Result: 
 Current status of the sports car:
 Year model: 2004
 Make: Porsche
 Speed: 0
 Current status of the other car:
 Year model: 2002
 Make: Ford Focus
 Speed: 0
 
 Accelerating...
 Now the sport car speed is 25
 Now the other car speed is 10
 
 Braking...
 Now the sport car speed is 10
 Now the other car speed is 5

*/


public class CarDemo
{
   public static void main(String[] args)
   {
      Car sportsCar = new Car(2004, "Porsche");
      Car slowCar = new Car(2002, "Ford Focus");

      // Display the current status.

      System.out.println("Current status of the sports car:");
      System.out.println("Year model: " + sportsCar.getYearModel());
      System.out.println("Make: " + sportsCar.getMake());
      System.out.println("Speed: " + sportsCar.getSpeed());

      System.out.println("Current status of the other car:");
      System.out.println("Year model: " + slowCar.getYearModel());
      System.out.println("Make: " + slowCar.getMake());
      System.out.println("Speed: " + slowCar.getSpeed());

      // Accelerate the sports car five times, the slowCar twice.

      System.out.println("\nAccelerating...");
      sportsCar.accelerate();
      sportsCar.accelerate();
      sportsCar.accelerate();
      sportsCar.accelerate();
      sportsCar.accelerate();

      slowCar.accelerate();
      slowCar.accelerate();

      // Display the speed.

      System.out.println("Now the sport car speed is " + sportsCar.getSpeed());
      System.out.println("Now the other car speed is " + slowCar.getSpeed());

      // Brake the sports car three times, the slowCar once

      System.out.println("\nBraking...");
      sportsCar.brake();
      sportsCar.brake();
      sportsCar.brake();

      slowCar.brake();

      // Display the speed.

      System.out.println("Now the sport car speed is " + sportsCar.getSpeed());
      System.out.println("Now the other car speed is " + slowCar.getSpeed());
   }
}

