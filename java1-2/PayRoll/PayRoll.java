/*
   Author : Sayaka Tamura
   File name: PayRoll.java
   This makes constructor for each field and setter and getter
   and calculate grassPay
*/

public class PayRoll
{	
	//Fields
	private String name; 		//Employee name
	private int idNumber; 	//Employee's ID Number
	private int PayRate; 	//Employee pay rate
	private int hoursWorked; 	//Employee's hours worked   
   	
	public PayRoll()
	{
		name = "";
		idNumber = 0;
	}
	
	/**
	 	Constructor
	 	@param n The employee's name.
	 	@param id The employee's ID number.
	*/
	
	public PayRoll(String n, int id)  
	{
		name = n;
		idNumber = id;
	}  

	/**
	 	The setName method sets the employee's
	 	name.
	 	@param nam The employee's name.
	*/
	
	public void setName(String n)
	{
		name = n;
	}
	
	/**
	 	The setNumber method sets the employee's
	 	ID number.
	 	@param num The employee's ID number.
	*/
	
	public void setNumber(int id)
	{
		idNumber = id;
	}
	
	/**
	 	The setPayRate method set the 
	 	employee's hourly pay rate.
	 	@param hpr The employee's hourly pay rate.
	*/
	
	public void setPayRate (int p)
	{
		PayRate = p;
	}
	
	/**
	 	The setHoursWorked method sets the 
	 	employee's hours worked.
	 	@param hw The employee's hours worked.
	*/
	
	public void setHoursWorked (int h)
	{
		hoursWorked = h;
	}
	
	
	/**
	 	getName method
	 	@return The name of the employee.
	*/
	
	public String getName()
	{
		return name;
	}
	
	/**
	 	getIdNumber method
	 	@return The employee's ID number
	*/
	
	public int getIdNumber()
	{
		return idNumber;
	}
	
	/**
	 	getPayRate method
	 	@return The employee's pay rate.
	*/
	
	public int getPayRate()
	{
		return PayRate;
	}
	
	/**
	 	getHoursWorked method
	 	@return The employee's hours worked.
	*/
	
	public int getHoursWorked()
	{
		return hoursWorked;
	}
	
	/**
	 	getGrosPay method
	 	@return The employee's gross pay.
	*/
	
	public int getGrossPay()
	{
		return hoursWorked * PayRate;
	}
}//end class