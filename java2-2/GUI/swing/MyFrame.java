import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame //2. construct a JFrame object
{
	private JPanel panel;
	private JButton button1;
	private JButton button2;
	private int cnt1 = 0;
	private int cnt2 = 0;


	public MyFrame(String title)
	{	
		setTitle(title); //3. set the title
		setSize(200,100); //4. 200 pixels wide, 100 pixels high

		panel=new JPanel(); // 5. construct a JPanel object
		panel.setBackground(Color.PINK);


		button1=new JButton("0");
		ButtonListener listener = new ButtonListener();
		button1.addActionListener(listener);
		panel.add(button1);


		button2=new JButton("0");
		//ButtonListener listener = new ButtonListener();
		button2.addActionListener(listener);
		panel.add(button2);


		//add panel to Frame
		add(panel);
		setVisible(true);
		//The setDefaultCoseOperation() method
		//exit the program when closing the window.
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

   private class ButtonListener implements ActionListener
   {
		public void actionPerformed(ActionEvent e)
		{

			if(e.getSource()==button1)
			{
				cnt1++;
				button1.setText(" " + cnt1);
			}
			else
			{
				cnt2++;
				button2.setText(" " + cnt2);
			}


			//JOptionPane.showMessageDialog(null, "Hi");
			//panel.setBackground(Color.BLUE);
		}
	}

	public static void main(String[] args)
	{
		MyFrame frame = new MyFrame("TestFrame"); //2-1. construct a JFrame object
	}

}
