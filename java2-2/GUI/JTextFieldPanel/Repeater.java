import javax.swing.*;
import java.awt.event.*;

/**
 * Created by Sayaka Tamura on 12/11/2016.
 */
public class Repeater extends JFrame
{
	private JTextField inText;
	private JTextField outText;
	private JPanel panel;

	public Repeater(String title)
	{
		setTitle(title);
		setSize(350,100);

		createPanel();
		add(panel);

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void createPanel()
	{
		panel = new JPanel();
		createInTextField();
		createOutTextField();
	}

	private void createInTextField()
	{
		JLabel inLabel = new JLabel("Enter your name: ");
		panel.add(inLabel);

		inText = new JTextField(15);
		inText.addActionListener(new TextListener());
		panel.add(inText);
	}

	private void createOutTextField()
	{
		JLabel inLabel = new JLabel("Here is your name: ");
		panel.add(inLabel);

		outText = new JTextField(15);
		outText.setEditable(false);
		panel.add(outText);
	}

	public class TextListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String name = inText.getText();
			outText.setText(name);
		}
	}


	public static void main(String[]args)
	{
		Repeater repeater = new Repeater("Repeat after me");
	}
}
