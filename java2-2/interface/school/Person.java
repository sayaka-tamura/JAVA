public class Person
{
	protected String name;
	protected String SSN;
	
	public Person()
	{
		name="";
		SSN="N/A";

	}

	public Person(String n, String s)
	{

		name=n;
		SSN=s;
	}

	//Setter
	public void setName(String name) {
		this.name = name;
	}

	public void setSSN(String SSN) {
		this.SSN = SSN;
	}

	//Getter
	public String getName() {
		return name;
	}

	public String getSSN() {
		return SSN;
	}

}