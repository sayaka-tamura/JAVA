import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TextFieldFrame extends JFrame 
{
   private JPanel panel;
   private JTextField textField1;
   private JTextField textField2;
   
   public TextFieldFrame(String title)
	{	
		setTitle(title);
		setSize(200,200);
     
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
      textField2.addActionListener(new TextListener());
      textField2.setEditable(false);
  
      JLabel label1 = new JLabel("Enter your name:");
      JLabel label2 = new JLabel("Here is your name:");
     
      panel.add(label1);
      panel.add(textField1);
      panel.add(label2);
      panel.add(textField2);
   }
  
   private class TextListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         String input = textField1.getText();
         textField2.setText("Hello, "+input);
      }
   }
      
  public static void main ( String[] args )
  {
		TextFieldFrame frame = new TextFieldFrame("TestFrame");
		
  }

}

	