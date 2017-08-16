/**
 * Created by Sayaka Tamura on 9/26/2016.
   File name: Student.java
   Purpose: make a constructor for student
            and make setters for each field
 */
public class Student {
	private String name;
	private double gpa;

	//Constructor
	public Student(String n, double g)
	{
		name=n;
		gpa=g;
	}

	public String getName()
	{
		return name;
	}

	public double getGPA()
	{
		return gpa;
	}

	public void displayInfo()
	{
		System.out.println("Name: "+name+"\tGPA: "+gpa);
	}

}
