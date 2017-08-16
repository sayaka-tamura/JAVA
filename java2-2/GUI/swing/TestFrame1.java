/**
 * Created by Sayaka Tamura on 12/9/2016.
 */
import javax.swing.*;

public class TestFrame1
{
	public static void main (String[]args)
	{
		int height = 100;
		int width = 200;

		JFrame frame = new JFrame(); // 3. construct a JFrame object
		frame.setTitle("Test Frame 1"); // 4. set the title
		frame.setSize(width,height); // 5. 200 pixels wide, 100 pixels high
		frame.setVisible(true); // 6. become visible on the screen
		frame.setSize(width+100, height+50);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 7. exit the program when closing the window.
	}
}
