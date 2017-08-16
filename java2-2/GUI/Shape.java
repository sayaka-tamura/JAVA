import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Shape extends JFrame  implements ChangeListener
{
    private ShapePanel sPanel;
    private JSlider slider;
    
    public Shape()
    {
    
    	Container contentPane=getContentPane();
    	contentPane.setLayout(new BorderLayout());
    		
    	sPanel=new ShapePanel();
    
      	slider = new JSlider( JSlider.HORIZONTAL, 0, 1000, 0);
    	slider.setMajorTickSpacing( 100 );
    	slider.setMinorTickSpacing(  50);
    	slider.setPaintTicks( true );
    	slider.setPaintLabels( true );
    	slider.setPreferredSize( new Dimension(300,50)) ;
    	slider.addChangeListener( this );
    	
    	JPanel sliderPanel=new JPanel();   
    	sliderPanel.add(slider);
    	
        contentPane.add(sPanel, BorderLayout.CENTER);
    	contentPane.add(sliderPanel, BorderLayout.SOUTH);
    			
    	pack();
        setVisible( true ); 
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    	
    	
    
        public void stateChanged( ChangeEvent evt )
    	{
          	int value=slider.getValue();		
        	sPanel.setSize(value);
    	 		
     	}
        
        


    private class ShapePanel extends JPanel
    {
    	private int diameter=0;
    	public ShapePanel()
    	{
    	 setBackground(Color.CYAN); 
    	 setPreferredSize(new Dimension(200, 200)); 
    	 }
    
    	public void paintComponent(Graphics g)
    	{
    		super.paintComponent(g); 
    	
    		g.setColor(Color.orange);
    		g.fillOval(0,0, diameter, diameter);
    	}
    	
    	public void setSize(int d)
    	{
    		diameter=d;
    		repaint();
    	}
    }
    
    public static void main(String args[])
    {
    		
    		new Shape();
    		
   }
    
}