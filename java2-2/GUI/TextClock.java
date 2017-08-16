import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

/**
 * Created by Sayaka Tamura on 12/12/2016.
 */
public class TextClock extends JFrame
{
	private JTextField timeField;

	public TextClock()
	{
		setTitle("Text Clock");

		createComponents();

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Timer t = new Timer(20, new TimerListener());
		t.start(); //Start timer
	}

	private void createComponents()
	{
		JPanel panel = new JPanel();
		timeField = new JTextField(15);
		timeField.setFont(new Font("sansserif",Font.PLAIN,48));
		panel.add(timeField);
		add(panel);
		pack();
	}

	private class TimerListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{

			Calendar now = Calendar.getInstance();
			int y = now.get(Calendar.YEAR);
			int mon = now.get(Calendar.MONTH)+1;
			int dayMonth = now.get(Calendar.DAY_OF_MONTH);
			int h = now.get(Calendar.HOUR);
			int m = now.get(Calendar.MINUTE);
			int s = now.get(Calendar.SECOND);
			int ms = now.get(Calendar.MILLISECOND);

			timeField.setText("" + y +" " + mon +"/" + dayMonth + " "
									+ h + ":" + m + ":" + s + ":" + ms);
		}
	}

	public static void main(String[] args)
	{
		TextClock clock = new TextClock();
	}
}
