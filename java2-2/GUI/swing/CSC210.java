import javax.swing.*;
import java.awt.*;

/**
 * Created by Sayaka Tamura on 12/9/2016.
 */

public class CSC210 extends JFrame
{
	private JPanel panel;
	int width=400;
	int height=200;

	public CSC210(String title)
	{
		setTitle(title);
		setSize(width,height);

		panel = new JPanel();
		panel.setBackground(Color.BLUE);

		add(panel);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[]args)
	{
		CSC210 CSC210Blue = new CSC210("CSC210Blue");
	}
}
