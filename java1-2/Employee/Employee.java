/*
   Author : Sayaka Tamura
   File name: Employee.java
   This makes constructor for each field and setter and getter
*/

public class Employee 
{ 
   private String employeeName; 
   private String employeeNo; 
   private String departmentCode; 
   private String positionCode; 
   
   
   public Employee( String name, String no, String dc, String pc ) 
   { 
      employeeName = name; 
      employeeNo = no; 
      departmentCode = dc; 
      positionCode = pc; 
   }
   
   public String getName() 
   { 
      return employeeName; 
   } 
     
   
   public String getIdNumber() 
   { 
      return employeeNo; 
   } 
   
   
   public String getDepartment() 
   { 
      return departmentCode; 
   } 
   
   
   public String getPosition() 
   { 
      return positionCode; 
   } 
} 
