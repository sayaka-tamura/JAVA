// Write a program to create an interface as shown in the figure. 
// 
// It includes a text field, a text area and two buttons,  
// called “append” and “clear”. 
// 
// The user enter text to text field. 
// If the append button is clicked, 
// the text entered to the text field will be appended to the text area. 
// If clear button is clicked, the text in both text field text area will be cleared. 
// The layout of the components will not change when the frame is resized. 


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TextAreaFrame_appendClear extends JFrame 
{
   private JPanel panel;
   
   private JTextField textField;  
   private JTextArea textArea;
      
   private JButton lockButton;
   private JButton clearButton;
    
   
   public TextAreaFrame_appendClear(String title)
   	{	
   		setTitle(title);
   		setSize(400,500);
        
         panel=new JPanel();
         panel.setLayout(new BorderLayout());
         
         createTextField();
         createTextArea();
         createButtons();
                     
         add(panel);     
   		setVisible(true);
         
   		setDefaultCloseOperation(EXIT_ON_CLOSE);
   	 }
       
       
       public void  createTextField()
       {
          textField =new JTextField(20);
          JLabel label= new JLabel("Enter text: ");
          
          JPanel textFieldPanel = new JPanel();
          
          textFieldPanel.add(label);
          textFieldPanel.add(textField);
         
          panel.add(textFieldPanel, BorderLayout.NORTH);
       
       
       }
       public void  createTextArea()
       {
         textArea = new JTextArea(20, 30);
         textArea.setLineWrap(true);
         textArea.setWrapStyleWord(true);

         JScrollPane scrollPane = new JScrollPane(textArea);
        // scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
         
         panel.add(scrollPane, BorderLayout.CENTER);
         
        // panel.add(textArea);
       }
       
       public void  createButtons()
       {
         lockButton = new JButton("Append");
         clearButton = new JButton("Clear");
         
         ButtonListener listener = new ButtonListener();
         lockButton.addActionListener(listener);
         clearButton.addActionListener(listener);
         
         JPanel buttonPanel = new JPanel();
         buttonPanel.add(lockButton);
         buttonPanel.add(clearButton);
         
         panel.add(buttonPanel, BorderLayout.SOUTH);
          
       
       }
           
      private class ButtonListener implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            if(e.getSource()==clearButton)
            { 
                textArea.setText("");
            
            }
            else
            {
               String input = textField.getText();
               textArea.append(input);
            
            }
            /*
            {
             if(lockButton.getText().equals("Lock"))
             {
              textArea.setEditable(false); 
              lockButton.setText("Unlock");
             }
             else
             {
              textArea.setEditable(true); 
              lockButton.setText("Lock");
             }

            }*/
                     
         }
      }
   public static void main ( String[] args )
  {
		TextAreaFrame_appendClear frame = new TextAreaFrame_appendClear("TestFrame");
		
  }

}

	