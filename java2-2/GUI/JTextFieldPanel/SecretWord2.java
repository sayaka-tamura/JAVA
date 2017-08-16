// only when the button is clicked, 
// the bottom field either says "correct" or "wrong!" 
// After three wrong guesses, exit the program. 
// The listener will listen for a Button event. 
// When it gets one, it checks if the guess is right or wrong.

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SecretWord2 extends JFrame 
{
   private JPanel panel;
   private JTextField textField1;
   private JTextField textField2;
   private int cnt;
   private String secret = "c";
   
   public SecretWord2(String title)
	{	
		setTitle(title);
		setSize(200,150);
     
      panel=new JPanel();
      createComponents();
                           
      add(panel);     
		setVisible(true);
      
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	 }
    
    public void createComponents()
    {
      textField1  = new JTextField(10);
      textField1.addActionListener(new TextListener());
      
      textField2 = new JTextField(10);
      textField2.setEditable(false);
  
      JLabel label1 = new JLabel("Guess the secret word:");
     
      //JLabel label1 = new JLabel("Ender your name:");
      //JLabel label2 = new JLabel("Ender your password:");
      //JButton button = new JButton("log on");
      
      panel.add(label1);
      panel.add(textField1);
      panel.add(textField2);
   }
  
   private class TextListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         String input = textField1.getText();
        
        if(input.equals(secret))
            textField2.setText("Correct!");
        else
        {
           textField2.setText("Wrong!");
           cnt++;
           
        }
        if(cnt==3)
              System.exit(0);
        
      }
   }
   
  public static void main ( String[] args )
  {
		SecretWord2 frame = new SecretWord2("TestFrame");	
  }

}

