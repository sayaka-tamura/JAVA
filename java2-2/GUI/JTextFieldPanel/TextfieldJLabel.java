import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TextfieldJLabel extends JFrame 
{
   private JPanel panel;
   private JTextField textField;
   private JLabel output;
   
   public TextfieldJLabel(String title)
	{	
		setTitle(title);
		setSize(200,100);
		
      panel=new JPanel();
      createComponents();

      add(panel);      
		setVisible(true);
      
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
   
   public void createComponents()
   {  
      textField= new JTextField(10);
      textField.addActionListener(new TextListener()); 
           
       JLabel label = new JLabel("Enter your name:");
      //panel.setBackground(Color.BLUE);
      
      panel.add(label);
      panel.add(textField);     
   }
   
   private class TextListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         String answer = textField.getText();
         //JOptionPane.showMessageDialog(null, "Got it. Your answer is "+ answer);
         //output.setText("your name is " + answer);
         JLabel output=new JLabel();
         panel.add(output);
         output.setText("Got it. Your answer is "+ answer);
         
         textField.setEditable(false);
              
      }
   }
   public static void main ( String[] args )
  {
		TextfieldJLabel frame = new TextfieldJLabel("TestFrame");
		
  }

}

	