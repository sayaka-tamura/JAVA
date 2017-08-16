//     uncompleted program      //

// Write a program implements a game: 
//There are three buttons in the frame. 
// Two of the buttons will cause the program to quit. 

// The remaining button will change the frame to green (a win!) 
// The winning button is different each time the game is played. 
// The easy way to do this (although it seems like cheating) is 
// to treat each button the same way.
 
// The ActionPerformed() method will not even check which button was clicked. 
// It will pick a random integer from 0 to 2 
// and if the integer happens to be 0 perform the "winning" action. 

// Otherwise, it will perform the "loosing" action. 
// This is similar to some electronic gambling devices in casinos, 
// where it appears to the user that there are "winning moves" 
// but in fact the machine actually ignores what the user has done 
// and just declares a "win" every now and then, according to pre-assigned odds. 


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class ThreebuttonGame extends JFrame 
{
    private JPanel panel;
    private JButton button1;
    private JButton button2;
    private JButton button3;

    public ThreebuttonGame(String title)
	{	
		setTitle(title);
		setSize(200,100);
  
        panel=new JPanel();

        button1 = new JButton("No.1");
        ButtonListener listener = new ButtonListener();
        button1.addActionListener(listener);
        panel.add(button1);

        button2 = new JButton("No.2");
        button2.addActionListener(listener);
        panel.add(button2);

        button3 = new JButton("No.3");
        button3.addActionListener(listener);
        panel.add(button3);

        add(panel);
		setVisible(true);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
	 }

    private class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String []cpuResult = {"No.1","No.2","No.3"};
            Random random = new Random();
            JButton resultButton = new JButton(cpuResult[random.nextInt(cpuResult.length)]);

            String result = (String) e.getSource();

            if(resultButton.equals(result))
            {
                button1.setText("A win!");
                button2.setText("You lose");
                button3.setText("You lose");
            }
            else if (result.equals(button2))
            {
                button2.setText("A win!");
                button1.setText("You lose");
                button3.setText("You lose");
            }
        }
    }

    public static void main ( String[] args )
    {
        ThreebuttonGame frame = new ThreebuttonGame("TestFrame");
    }
}

	