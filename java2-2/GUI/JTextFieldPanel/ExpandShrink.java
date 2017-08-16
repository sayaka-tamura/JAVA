// Create a frame with two buttons, called Expand and Shrink. 
// When the Expand button is clicked, the frame expands by 10 percent. 
// When the Shrink button is clicked, the frame shrinks by 10 percent. 
// Do this in the actionPerformed() method by using setSize(). 
// Keep track of the current size of the frame 
// with two instance variables of type int. 
// When you increase them or decrease them by 10 percent, 
// you will have to use integer arithmetic or use a type cast. 


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExpandShrink extends JFrame
{
	private JPanel panel;
	private JButton expandButton;
	private JButton shrinkButton;
	int width=200;
	int height=100;

	public ExpandShrink(String title)
	{
		setTitle(title);
		setSize(width,height);

		createComponents();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void createComponents()
	{
		panel= new JPanel();
		panel.setBackground(Color.PINK);

		expandButton=new JButton("Expand");
		expandButton.addActionListener(new ButtonListener());

		shrinkButton=new JButton("Shrink");
		shrinkButton.addActionListener(new ButtonListener());

		panel.add(expandButton);
		panel.add(shrinkButton);

		add(panel);
	}

	private class ButtonListener implements ActionListener
	{

		public void actionPerformed(ActionEvent evt)
		{
			if(evt.getSource()==expandButton)
			{
				width = (int)(width*1.1);
				height = (int)(height*1.1);

				setSize(width,height);
			}
			else
			{
				width = (int)(width*0.9);
				height = (int)(height*0.9);

				setSize(width,height);
			}
		}
	}

	public static void main(String[]args)
	{
		ExpandShrink frame = new ExpandShrink("TestFrame1");
	}
}
