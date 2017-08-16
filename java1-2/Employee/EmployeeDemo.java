/*
   Author : Sayaka Tamura
   File name: EmployeeDemo.java
   Result:
    Employee #1
 Name: Susan Meyers
 ID Number: 47899
 Department: Accounting
 Position: Vice President
 
 Employee #2
 Name: Mark Jones
 ID Number: 39119
 Department: IT
 Position: Programmer
 
 Employee #3
 Name: Joy Rogers
 ID Number: 81774
 Department: Manufacturing
 Position: Engineer

*/


public class EmployeeDemo
{ 
   public static void main(String[] args) 
   { 
      // Create three instances of the Employee class. 
      Employee employee1 = new Employee("Susan Meyers","47899","Accounting","Vice President"); 
      Employee employee2 = new Employee("Mark Jones","39119","IT","Programmer"); 
      Employee employee3 = new Employee("Joy Rogers","81774","Manufacturing","Engineer"); 
      
      // Display the data for employee 1. 
      System.out.println("Employee #1"); 
      System.out.println("Name: " + employee1.getName()); 
      System.out.println("ID Number: " + employee1.getIdNumber()); 
      System.out.println("Department: " + employee1.getDepartment()); 
      System.out.println("Position: " + employee1.getPosition()); 
      System.out.println(); 
      
      // Display the data for employee 2. 
      System.out.println("Employee #2"); 
      System.out.println("Name: " + employee2.getName()); 
      System.out.println("ID Number: " + employee2.getIdNumber()); 
      System.out.println("Department: " + employee2.getDepartment()); 
      System.out.println("Position: " + employee2.getPosition()); 
      System.out.println(); 
      
      // Display the data for employee 3. 
      System.out.println("Employee #3"); 
      System.out.println("Name: " + employee3.getName()); 
      System.out.println("ID Number: " + employee3.getIdNumber()); 
      System.out.println("Department: " + employee3.getDepartment()); 
      System.out.println("Position: " + employee3.getPosition()); 
      System.out.println(); 
   } 
} 
