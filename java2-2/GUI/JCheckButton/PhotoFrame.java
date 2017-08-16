import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PhotoFrame extends JFrame 
{
   private JPanel panel;
   private int cnt=1;
   private JLabel label;
     
     public PhotoFrame(String title)
	{	
		setTitle(title);
				
      panel=new JPanel();
     
                        
      add(panel);
      
      createComponents();
		setVisible(true);
      
      pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
      
      Timer timer = new Timer(1000,new TextListener()); 
      timer.start();
            
      
	}
   
   public void createComponents()
   {
            
      label=new JLabel();
      
       label.setIcon(new ImageIcon("pic1.png"));           
        panel.add(label);

     
   
   }
   private class TextListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
        cnt++;
        /*if(cnt==4)
         cnt=1;    */
         cnt=(cnt)%3+1;
       label.setIcon(new ImageIcon("pic"+cnt+".png"));
      }
   }
   public static void main ( String[] args )
  {
		PhotoFrame frame = new PhotoFrame("TestFrame");
		
  }

}

	