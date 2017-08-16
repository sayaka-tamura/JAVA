/**
 * Created by Sayaka Tamura on 12/12/2016.
   file name: TextAreaExample_flowlayout.java
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TextAreaExample_flowlayout extends JFrame
{
	private JPanel panel;
	private JTextArea textArea;
   
   private JPanel buttonPanel;

	private JScrollPane textAreaScrollPane;
	private JButton lockButton;
	private JButton clearButton;
	private boolean isLocked  = false;

	public TextAreaExample_flowlayout()
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
		buttonPanel = new JPanel();

		ButtonListener listener = new ButtonListener();
		lockButton = new JButton("Lock");
		//Font f = new Font("sanserif",Font.BOLD,32);
		//Font fMono = new Font("monospaced",Font.BOLD+Font.ITALIC,20);
		Font fDialog = new Font("dialog",Font.PLAIN,20);
		lockButton.setFont(fDialog);

		lockButton.addActionListener(listener);

		clearButton = new JButton("Clear");
		clearButton.addActionListener(listener);

		buttonPanel.add(lockButton);
		buttonPanel.add(clearButton);
	}

	private void createPanel()
	{
		panel = new JPanel();

		panel.setLayout(new BorderLayout());
		panel.add(textAreaScrollPane,BorderLayout.CENTER);

		panel.add(textAreaScrollPane);
		panel.add(buttonPanel,BorderLayout.SOUTH);

		add(panel);
	}

	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent evt)
		{
			if(evt.getSource()==lockButton)
			{
				isLocked=!isLocked;

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

	public static void main(String[]args)
	{
		TextAreaExample_flowlayout textAreaEx = new TextAreaExample_flowlayout();
	}
}
