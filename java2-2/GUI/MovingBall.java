import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MovingBall extends JFrame
{
    public MovingBall()
    {
        setLocationRelativeTo(null);
        setSize (500, 400);

        BallPanel ballPanel=new BallPanel();
        add(ballPanel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args)
    {
        new MovingBall();
    }  
  
}

class BallPanel extends JPanel
{
    private int x=0;
    private int y=0;
    private int dx=1;
    private int dy=2;
    private int radius = 10;
     
    public BallPanel()
    {
        Timer timer = new Timer(10, new Listener());
        timer.start();
    }
    
    private class Listener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {  
            int width= (int)getWidth();
        int height=(int)getHeight();
        
         if(x<radius)
            dx=Math.abs(dx);
        if(x+radius>width)
            dx=-dx;
       

        if(y<radius)
            dy=Math.abs(dy);

        if(y+radius>height)
            dy=-dy;


        
        x+=dx;
        y+=dy;
        

            repaint();
        }
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        g.setColor(Color.BLUE);
        g.fillOval(x - radius, y - radius, radius*2, radius*2); 
        
        g.setColor(Color.BLACK);
        g.drawString("ball @("+x+","+y+") Speed@("+dx+","+dy+")", 30, 30)  ;
            
    }
    
}

