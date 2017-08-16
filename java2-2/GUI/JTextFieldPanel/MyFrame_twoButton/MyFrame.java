import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame
{
	private JPanel panel;
	private JButton redButton;
	private JButton greenButton;
	private ImageIcon icon1;

	public MyFrame(String title)
	{
		setTitle(title);
		setSize(300,150);

		createComponents();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void createComponents()
	{
		panel= new JPanel();
		panel.setBackground(Color.PINK);

		icon1=new ImageIcon("duke.gif");

		redButton=new JButton("Red");
		redButton.setIcon(icon1);
		redButton.addActionListener(new ButtonListener());

		greenButton=new JButton("Green");
		greenButton.setIcon(icon1);
		greenButton.addActionListener(new ButtonListener());

		panel.add(redButton);
		panel.add(greenButton);

		add(panel);
	}

	private class ButtonListener implements ActionListener
	{
		ImageIcon icon2=new ImageIcon("duke_waving.gif");

		public void actionPerformed(ActionEvent evt)
		{
			if(evt.getSource()==redButton)
			{
				//panel.setBackground(Color.RED);
				//redButton.setIcon(icon2);

				if(panel.getBackground()==Color.PINK)
				{
					panel.setBackground(Color.RED);
					redButton.setIcon(icon2);
				}
				else if(panel.getBackground()==Color.RED)
				{
					panel.setBackground(Color.PINK);
					redButton.setIcon(icon1);
				}
				else if(panel.getBackground()==Color.GREEN)
				{
					panel.setBackground(Color.RED);
					redButton.setIcon(icon2);
					greenButton.setIcon(icon1);
				}
			}
			else
			{
				//panel.setBackground(Color.GREEN);
				//greenButton.setIcon(icon2);

				if(panel.getBackground()==Color.PINK)
				{
					panel.setBackground(Color.GREEN);
					greenButton.setIcon(icon2);
				}
				else if(panel.getBackground()==Color.GREEN) {
					panel.setBackground(Color.PINK);
					greenButton.setIcon(icon1);
				}
				else if(panel.getBackground()==Color.RED)
				{
					panel.setBackground(Color.GREEN);
					greenButton.setIcon(icon2);
					redButton.setIcon(icon1);
				}
			}
		}
	}

	public static void main(String[]args)
	{
		MyFrame frame = new MyFrame("TestFrame1");
	}
}
