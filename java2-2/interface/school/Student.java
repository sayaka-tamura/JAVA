public class Student extends Person implements Printable
{
	private double gpa;

	public Student(String n, String s, double g)
	{
		super(n,s);
		//super();
		gpa=g;
	}

	public Student(String n, String s) {
		super(n,s);
		gpa = 0;
	}

	public Student()
	{
		gpa = 0;
	}

	//Getter
	public void setGpa(double gpa)
	{
		this.gpa = gpa;
	}

	//Getter
	public double getGpa() {
		return gpa;
	}

	public void printData()
	{
		System.out.println("Name: "+name +"\n"+
								"SSN: "+SSN +"\n"+
								"GPA: "+gpa +"\n");
	}
	
}