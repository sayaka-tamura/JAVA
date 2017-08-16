/**
 * Created by Sayaka Tamura on 12/9/2016.
 */
public class Faculty extends Person implements Printable
{
	private double teachHours;
	private double salary;

	public Faculty(String n, String s, double t, double sal)
	{
		super(n,s);
		teachHours = t;
		salary = sal;
	}

	public Faculty(String n, String s)
	{
		super(n,s);

		teachHours = 0;
		salary = 0;
	}

	public Faculty() {
		this.teachHours = 0;
		this.salary = 0;
	}


//Setter
	public void setTeachHours(double teachHours) {
		this.teachHours = teachHours;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}

//Getter
	public double getTeachHours() {
		return teachHours;
	}

	public double getSalary() {
		return salary;
	}


	public void printData()
	{
		System.out.println("Name: "+name +"\n"+
				"SSN: "+SSN +"\n"+
				"Teaching hours per week: "+teachHours +"\n"+
				"Salary: " + salary+"\n");
	}
}
