/**
 * Created by Sayaka Tamura on 10/24/2016.
 */
public class MessageTest {

	public static void main(String[] args)
	{

		Message m = new Message("Alice","Bob");
		m.append("Happy Birthday!");
		System.out.println(m.toString());

		MailBox forSchool = new MailBox();
		forSchool.addMessage(m);
		System.out.println("Your message for school is: \n" + forSchool.getMessage(0));


		//using copy constructor
		Message n = new Message(m);
		System.out.println(n.toString());

		n.setSender("Sayaka");
		n.setRecipient("Reiko");
		n.setText("Thank you very much");
		System.out.println(n.toString());

		Message l = new Message("AIUEO","KAKIKU");
		l.append("Sorry...");
		System.out.println(l.toString());

		MailBox forOffice = new MailBox();
		forOffice.addMessage(n);
		forOffice.addMessage(l);
		System.out.println("Your message for office is: " + forOffice.getMessage(0));

		forOffice.deleteMessage(0);
		System.out.println("Your message for office is: " + forOffice.getMessage(0));

		forOffice.restoreMessage(0);
		System.out.println("Your message for office is: " + forOffice.getMessage(0));
		System.out.println("Your message for office is: " + forOffice.getMessage(1));


		if(m.equals(n))
			System.out.println("It's the same");
		else
			System.out.println("It's not the same");
	}
}
