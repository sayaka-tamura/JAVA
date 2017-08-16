/**
 * Created by Sayaka Tamura on 12/14/2016.
   File name: RadioButtonFrame.java
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class RadioButtonFrame extends JFrame 
{
   JRadioButton redButton;
   JRadioButton greenButton;
   JRadioButton blueButton;
   JRadioButton yellowButton;
   JPanel panel;
     
   public RadioButtonFrame()
   {
      setTitle("Color Selecter");
      setLocationRelativeTo(null); //centerize component
      createComponents();   
      pack();
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);

   }
	
	public void createComponents()
	{
	
		panel=new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED, 3), "Colors"));
		
		Listener listener = new Listener();
		redButton=new JRadioButton("Red");
		redButton.addItemListener(listener);

		greenButton=new JRadioButton("Green");
		greenButton.addItemListener(listener);
      
		blueButton=new JRadioButton("Blue");
		blueButton.addItemListener(listener);
      
		yellowButton=new JRadioButton("Yellow");
		yellowButton.addItemListener(listener);

		ButtonGroup group = new ButtonGroup();
		
		group.add(redButton);
		group.add(greenButton);
		group.add(blueButton);
		group.add(yellowButton);

		panel.add(redButton);
		panel.add(greenButton);
		panel.add(blueButton);
		panel.add(yellowButton);

		add(panel);
	}
   
   private class Listener implements ItemListener   {
   
      public void itemStateChanged(ItemEvent e)
       {
          if(redButton.isSelected())    
          {    
             setColor(Color.RED);
          }
          else if (e.getSource()==greenButton)  // OR (greenButton.isSelected())
          {
            setColor(Color.GREEN);

          }
          else if (e.getSource()==blueButton)    
          {
            setColor(Color.BLUE);

          }
          else
            setColor(Color.YELLOW);

       }
      
      public void setColor(Color c)
      {
            panel.setBackground(c);   
            redButton.setBackground(c);
            greenButton.setBackground(c);
            blueButton.setBackground(c);
            yellowButton.setBackground(c);
      }
   
   }
	
	public static void main(String[] args)
	{
      new RadioButtonFrame();
	}
      
}


