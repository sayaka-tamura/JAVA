import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Sayaka Tamura on 12/10/2016.
 */


public class MyFrame extends JFrame
{
	private JPanel panel;

	public MyFrame(String title)
	{
		setTitle(title);
		setSize(200,150);

		createComponents();

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void createComponents()
	{
		panel = new JPanel();
		panel.setBackground(Color.PINK);

		ImageIcon icon = new ImageIcon("duke.gif");
		JButton button = new JButton("Click me!");
		button.setIcon(icon);
		button.addActionListener(new ButtonListener());

		panel.add(button);
		add(panel);
	}

	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(panel.getBackground()==Color.PINK)
				panel.setBackground(Color.YELLOW);
			else
				panel.setBackground(Color.PINK);
		}
	}

	public static void main(String[]args)
	{
		MyFrame frame = new MyFrame("TestFrame1");
	}
}
