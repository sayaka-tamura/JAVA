import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CheckBoxFrame_selected extends JFrame 
{
     
   private JPanel controlPanel;
   private JCheckBox italicBox;
   private JCheckBox boldBox;
   
     
   public CheckBoxFrame_selected()
   {
      setTitle("Style Selecter");      
      setLocationRelativeTo(null);
      createControlPanel();
       
      pack();      
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);

   }
     
   private void createControlPanel()
   {
       controlPanel=new JPanel();
              
            italicBox = new JCheckBox("Italic");
      
      italicBox.addItemListener(new CheckBoxListener());
      
      controlPanel.add(italicBox);      
      
      
      boldBox = new JCheckBox("Bold");
      
      boldBox.addItemListener(new CheckBoxListener());
      
      controlPanel.add(boldBox);      
      
      add(controlPanel);
      
  }
    
     private class CheckBoxListener implements ItemListener
  {
      public void itemStateChanged( ItemEvent evt)
      {
        if(italicBox.isSelected())
            System.out.println("italic selected");
        if(!italicBox.isSelected())
         System.out.println("italic deselected");
        if(boldBox.isSelected())
            System.out.println("bold selected");
        if(!boldBox.isSelected())
         System.out.println("bold deselected");

      }
   }

	   public static void main(String[] args)
   {
      CheckBoxFrame_selected cf=new CheckBoxFrame_selected();
   }
      
}

      

  
