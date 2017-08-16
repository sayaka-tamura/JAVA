import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Sayaka Tamura on 12/9/2016.
 */

public class MyFrameChangeBG extends JFrame
{
	private JPanel panel;
	private JButton button;
	int width=400;
	int height=200;

	public MyFrameChangeBG(String title)
	{
		setTitle("MyFrame");
		setSize(width,height);

		panel=new JPanel();
		panel.setBackground(Color.RED);

		button = new JButton("Change Background Color");
		ButtonListener listener = new ButtonListener();
		button.addActionListener(listener);
		panel.add(button);

		add(panel);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(panel.getBackground()==Color.RED)
				panel.setBackground(Color.BLUE);
			else
				panel.setBackground(Color.RED);
		}
	}

	public static void main(String[]args)
	{
		MyFrameChangeBG Myframe = new MyFrameChangeBG("TestFrame");
	}
}
