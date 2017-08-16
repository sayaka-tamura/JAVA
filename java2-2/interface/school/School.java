/**
 * Created by Sayaka Tamura on 12/9/2016.
 */
public class School
{
	public static void main(String[] args)
	{
		Person person01 = new Person();
		Person person02 = new Person();
		Person person03 = new Person("Sayaka","15234088");

		person02.setName("Kazuki");
		person02.setSSN("50880116");

		System.out.println("Person2 Name: "+person02.getName()+
							"\nSSN: "+person02.getSSN());

		Student student01 = new Student();
		Student student02 = new Student();
		Student student03 = new Student("Sayaka","15234088");
		Student student04 = new Student("Haru","15234088",4.5);

		student02.setName("Kazuki");
		student02.setGpa(3.5);

		student01.printData();
		student02.printData();
		student03.printData();
		student04.printData();

		Faculty faculty01 = new Faculty();
		Faculty faculty02 = new Faculty();
		Faculty faculty03 = new Faculty("Kevin","20160101");
		Faculty faculty04 = new Faculty("Dom","20100401",15,920.50);

		faculty02.setName("Amuro");
		faculty02.setSSN("19990214");

		faculty01.printData();
		faculty02.printData();
		faculty03.printData();
		faculty04.printData();


	}
}
