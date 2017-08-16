import java.util.ArrayList;

/**
 * Created by Sayaka Tamura on 10/24/2016.
 */
public class MailBox
{
	private ArrayList<Message> inbox; //aggregation
	private ArrayList<Message> trash;

	public MailBox()
	{
		inbox = new ArrayList <Message>();
		trash = new ArrayList <Message>();
	}

	public void addMessage(Message m)
	{
		inbox.add(m);
	}

	/**	delete a message from inbox inbox
	and add it to trash*/

	public void deleteMessage(int position)
	{
		Message m = inbox.remove(position);
		trash.add(m);
	}

	/**delete a message at hte specified position
	from inbox and add it to trash */
	public void deleteMessage(Message m)
	{
		inbox.remove(m);
	}

/**	removme a message from trash
	and add it back to inbox*/

	public void restoreMessage(int positon)
	{
		Message m = trash.remove(positon);
		inbox.add(m);
	}

	public Message getMessage(int positon)
	{
		return inbox.get(positon);
	}
}
