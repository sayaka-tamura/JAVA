/**
 * Created by Sayaka Tamura on 12/12/2016.
   file name: TextAreaExample.java
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TextAreaExample extends JFrame
{
	private JPanel panel;
	private JTextArea textArea;
   
	private JScrollPane textAreaScrollPane;
	private JButton lockButton;
	private JButton clearButton;
	private boolean isLocked = false;

	public TextAreaExample()
	{
		setTitle("Text Area Example");
		setSize(250,250);

		createTextArea();
		createButtons();
		createPanel();

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void createTextArea()
	{
		textArea = new JTextArea(10,20);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textAreaScrollPane = new JScrollPane(textArea);
	}

	private void createButtons()
	{
		ButtonListener listener = new ButtonListener();

		lockButton = new JButton("Lock");
		lockButton.addActionListener(listener);

		clearButton = new JButton("Clear");
		clearButton.addActionListener(listener);
	}

	private void createPanel()
	{
		panel = new JPanel();
		panel.add(textAreaScrollPane);
		panel.add(lockButton);
		panel.add(clearButton);
		add(panel);
	}

	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent evt)
		{
			if(evt.getSource()==lockButton)
			{
				isLocked = !isLocked;
				if(isLocked)
				{
					lockButton.setText("Unlock");
					textArea.setEditable(false);
				}
				else
				{
					lockButton.setText("Lock");
					textArea.setEditable(true);
				}
			}
			else
				textArea.setText(null);
		}
	}

	public static void main(String[] args)
	{
		TextAreaExample frame = new TextAreaExample();
	}
}
