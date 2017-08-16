// it has four buttons: one for red, 
// one for green, one for blue, and one for gray. 
// Clicking on a button changes the frame to the corresponding color. 
// The GUI will look like this after the green button has been clicked: 

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FourButtons extends JFrame
{
	private JPanel panel;
	private JButton redButton;
	private JButton greenButton;
	private JButton blueButton;
	private JButton greyButton;

	public FourButtons(String title)
	{
		setTitle(title);
		setSize(350,150);

		createComponents();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void createComponents()
	{
		panel= new JPanel();
		panel.setBackground(Color.PINK);


		redButton=new JButton("Red");
		redButton.addActionListener(new ButtonListener());

		greenButton=new JButton("Green");
		greenButton.addActionListener(new ButtonListener());

		blueButton=new JButton("Blue");
		blueButton.addActionListener(new ButtonListener());

		greyButton=new JButton("Grey");
		greyButton.addActionListener(new ButtonListener());

		panel.add(redButton);
		panel.add(greenButton);
		panel.add(blueButton);
		panel.add(greyButton);

		add(panel);
	}

	private class ButtonListener implements ActionListener
	{

		public void actionPerformed(ActionEvent evt)
		{
			if(evt.getSource()==redButton)
			{
				if(panel.getBackground()==Color.PINK)
				{
					panel.setBackground(Color.RED);
				}
				else if(panel.getBackground()==Color.RED)
				{
					panel.setBackground(Color.PINK);
				}
				else if(panel.getBackground()==Color.GREEN)
				{
					panel.setBackground(Color.RED);
				}
				else if(panel.getBackground()==Color.BLUE)
				{
					panel.setBackground(Color.RED);
				}
				else if(panel.getBackground()==Color.GRAY)
				{
					panel.setBackground(Color.RED);
				}
			}
			else if(evt.getSource()==greenButton)
			{
				if(panel.getBackground()==Color.PINK)
				{
					panel.setBackground(Color.GREEN);
				}
				else if(panel.getBackground()==Color.GREEN) {
					panel.setBackground(Color.PINK);
				}
				else if(panel.getBackground()==Color.RED)
				{
					panel.setBackground(Color.GREEN);
				}
				else if(panel.getBackground()==Color.BLUE)
				{
					panel.setBackground(Color.GREEN);
				}
				else if(panel.getBackground()==Color.GRAY)
				{
					panel.setBackground(Color.GREEN);
				}
			}
			else if(evt.getSource()==blueButton)
			{
				if(panel.getBackground()==Color.PINK)
				{
					panel.setBackground(Color.BLUE);
				}
				else if(panel.getBackground()==Color.BLUE) {
					panel.setBackground(Color.PINK);
				}
				else if(panel.getBackground()==Color.RED)
				{
					panel.setBackground(Color.BLUE);
				}
				else if(panel.getBackground()==Color.GREEN)
				{
					panel.setBackground(Color.BLUE);
				}
				else if(panel.getBackground()==Color.GRAY)
				{
					panel.setBackground(Color.BLUE);
				}
			}
			else if(evt.getSource()==greyButton)
			{
				if(panel.getBackground()==Color.PINK)
				{
					panel.setBackground(Color.GRAY);
				}
				else if(panel.getBackground()==Color.GRAY) {
					panel.setBackground(Color.PINK);
				}
				else if(panel.getBackground()==Color.RED)
				{
					panel.setBackground(Color.GRAY);
				}
				else if(panel.getBackground()==Color.GREEN)
				{
					panel.setBackground(Color.GRAY);
				}
				else if(panel.getBackground()==Color.BLUE)
				{
					panel.setBackground(Color.GRAY);
				}
			}
		}
	}

	public static void main(String[]args)
	{
		FourButtons frame = new FourButtons("TestFrame1");
	}
}
