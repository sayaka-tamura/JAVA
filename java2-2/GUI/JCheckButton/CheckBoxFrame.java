
/**
 * Created by Sayaka Tamura on 12/12/2016.
   file name: CheckBoxFrame.java
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBoxFrame extends JFrame
{
	JCheckBox italicBox;
	JCheckBox boldBox;
	JCheckBox exitBox;
	JTextField textField;
	JPanel controlPanel;

	public CheckBoxFrame()
	{
		setTitle("Style Selecter");
		createControlPanel();

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void createControlPanel()
	{
		controlPanel = new JPanel();
		controlPanel.setLayout(new BoxLayout(controlPanel,BoxLayout.Y_AXIS));

		JPanel labelPanel = crateLabel();
		JPanel textPanel = createTextField();
		JPanel checkBoxPanel = createCheckBoxes();

		controlPanel.add(labelPanel);
		controlPanel.add(textPanel);
		controlPanel.add(checkBoxPanel);
		add(controlPanel);
		pack();
	}

	private JPanel crateLabel()
	{
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Style Options");
		panel.add(label);

		return panel;
	}

	private JPanel createTextField()
	{
		JPanel panel = new JPanel();
		textField = new JTextField(15);
		panel.add(textField);

		return panel;
	}

	private JPanel createCheckBoxes()
	{
		JPanel panel = new JPanel();

		CheckBoxListener listener = new CheckBoxListener();

		italicBox=new JCheckBox("Italic");
		italicBox.addItemListener(listener);
		panel.add(italicBox);

		boldBox=new JCheckBox("Bold");
		boldBox.addItemListener(listener);
		panel.add(boldBox);

		exitBox = new JCheckBox("Exit");
		exitBox.addItemListener(listener);
		panel.add(exitBox);

		return panel;
	}

	private class CheckBoxListener implements ItemListener
	{
		public void itemStateChanged(ItemEvent evt)
		{
			int style = Font.PLAIN;

			if(italicBox.isSelected())
				style += Font.ITALIC;
			if(boldBox.isSelected())
				style += Font.BOLD;
			if(exitBox.isSelected())
				System.exit(0);

			int size = (textField.getFont()).getSize();
			String name = (textField.getFont()).getName();

			Font f = new Font(name, style, size);
			textField.setFont(f);
		}
	}

	public static void main(String[] args)
	{
		CheckBoxFrame cf = new CheckBoxFrame();
	}

}
