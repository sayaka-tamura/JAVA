/**
 * Created by Sayaka Tamura on 9/26/2016.
   File name:GpaHighestAndAveDemo.java
   Result ex:
   please enter student's information
   Name: sayaka
   GPA: 4.0
   Name: kaz
   GPA: 3.5
   Name: haru
   GPA: 3.2
   The average GPA is 3.5666666666666664
   The student has the highest GPA is: 
   Name: sayaka	GPA: 4.0
 */

import java.util.Scanner;

public class GpaHighestAndAveDemo {

	public static void main(String[] args)
	{
		/*
		//make array for names of student
		String[] names={"Susan","Jake","Mike","Mary"};

			/*
			System.out.println("There are " + names[0].length() +
								" characters in \""+ names[0] +"\"");

			//Output: There are 5 characters in "Susan"
			*/

		/*
		//Show the length of each name in the array
		for(int i=0;i<names.length;i++)
		{
			System.out.println("There are " + names[i].length() +
					" characters in \""+ names[i] +"\"");
		}

		//Try to show each variable of an array "course"
		String[] courses = new String[5];
		for(int i=0;i<courses.length;i++)
		{
			System.out.println(courses[i]);
		}

		//Try to show each variable of an array "numbers"
		int[] numbers=new int[10];
		for(int i=0;i<numbers.length;i++)
		{
			System.out.println(numbers[i]);
		}
		*/

		/*
		//Create new object named Student
		//Passing the value of name and gpa to "Student.java"
   		Student s = new Student("Tim","3.5");
   		s.displayInfo();
		*/

		/*
		//make an array of Object initialized.
		//each object passed "name" and "gpa" value
		Student[] stu = {new Student("Tim",3.5),new Student("Mike",3.8),
						new Student("Sue",3.7),new Student("Mark",3.2)};

		//Show "name" and "gpa" of each object
		for(int i= 0; i<stu.length;i++)
		{
			stu[i].displayInfo();
		}
		*/

		//Create new array
		Student[] students = new Student[3];

		Scanner keyboard = new Scanner(System.in);
		System.out.println("please enter student's information");

		for(int i =0;i<students.length;i++)
		{
			//System.out.println(student[i]);
			System.out.print("Name: ");
			String name = keyboard.nextLine();

			System.out.print("GPA: ");
			double gpa = keyboard.nextDouble();

			students[i] = new Student(name,gpa);

			keyboard.nextLine();

		}

		double sum=0;
		for(int i=0;i<students.length;i++)
		{
			sum += students[i].getGPA();
		}

		System.out.println("The average GPA is " +sum/students.length);

		/*#1
		//display the name of the student who has the highest gpa
		double highestGPA=students[0].getGPA();
		String name=students[0].getName();;

		for(int i=1;i<students.length;i++)
		{
			if(students[i].getGPA()>highestGPA)
			{
				highestGPA=students[i].getGPA();
				name = students[i].getName();
			}
		}
		System.out.println("The highest GPA is " +highestGPA);
		System.out.println("The name of the student is " +name);
		*/

		//#2
		//find out the positon in the array that holds the student with highest GPA
		int maxInd =0;
		for (int i=1;i<students.length;i++)
		{
			if(students[maxInd].getGPA()<students[i].getGPA())
				maxInd=i;
		}

		System.out.println("The student has the highest GPA is: ");
		students[maxInd].displayInfo();

	}

}
