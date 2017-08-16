// Write a GUI program which has two text fields.  
// There is a secret word in the program. 
// The user enters a guess into the top field. 
// After each entry, the bottom field either says "correct" or "wrong!" 
// After three wrong guesses, exit the program. 


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SecretWord extends JFrame
{
    private JPanel panel;
    //private JPasswordField;
    private JTextField textField1;
    private JTextField textField2;
    private int cnt;
    private String secret ="CSC210";

    public SecretWord(String title)
    {
        setTitle(title);
        setSize(300,150);

        panel=new JPanel();
        createComponents();

        add(panel);
        setVisible(true);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void createComponents()
    {
        textField1  = new JTextField(10);
        //textField1.addActionListener(new TextListener());

        textField2 = new JTextField(10);
        textField2.setEditable(false);

        JLabel label1 = new JLabel("Enter the secret word:");

        //JLabel label1 = new JLabel("Ender your name:");
        JLabel label2 = new JLabel("Result:");
        JButton button = new JButton("Check");
        button.addActionListener(new ButtonListener());

        panel.add(label1);
        panel.add(textField1);
        panel.add(label2);
        panel.add(textField2);
        panel.add(button);

    }

    private class ButtonListener implements ActionListener
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

            /*
            String name = textField2.getText();
            String password = textField1.getText();

            if(name.equals(userName)&&password.equals(pwd))
                JOptionPane.showMessageDialog(null,"log on...");
            else
            {
                JoptionPane.showMessageDialog(null,"Incorrect user name or password.");

                if()
            }
            */


            //JOptionPane.showMessageDialog(null, "Hello, "+input);

            // System.exit(0);
            // textField2.setText("Hello, "+input);
        }

    }

    public static void main ( String[] args )
    {
        SecretWord frame = new SecretWord("TestFrame");
    }

}

	