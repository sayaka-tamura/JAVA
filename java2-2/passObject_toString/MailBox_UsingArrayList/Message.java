/**
 * Created by Sayaka Tamura on 10/20/2016.
 */
public class Message {
	private String recipient;
	private String sender;
	private String text;

	public Message(String r, String s)
	{
		this.recipient = r;
		this.sender = s;
		this.text = "";
	}

	//copy constructor
	public Message(Message msg)
	{
		this.recipient = msg.recipient;
		this.sender = msg.sender;
		this.text = msg.text;
	}


	public void setSender(String sender) {
		this.sender = sender;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public String getRecipient() {
		return recipient;
	}

	public String getSender() {
		return sender;
	}

	public String getText() {
		return text;
	}


	//appeend
	public void append(String str)
	{
		this.text += str;
	}

	public boolean equals (Message m)
	{
		if(recipient.equals(m.recipient)&&
			sender.equals(m.sender)&&
			text.equals(m.text))

			return true;

		return false;
	}

	public String toString()
	{
		return "From: "+this.sender+"\nTo: "+this.recipient+
				"\n"+this.text;

	}
}
