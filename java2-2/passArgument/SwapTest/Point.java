public class Point
{
   private int x;
   private int y;
   
   public Point(int a, int b)
   {
      x=a;
      y=b;
   }
   
   //copy constructor
   public Point(Point p)
   {
      x=p.x;
      y=p.y;
   }

   
   public int getX()
   {
      return x;
   }
   
   public int getY()
   {
      return y;
   }
   
   public void setX(int a)
   {
     x=a;
   }
   
   public void setY(int a)
   {
      y=a;
   }
 
   public boolean equals(Point p)
   {
      if(x==p.x && y==p.y)
         return true;
   
     return false;
   }
   
   public Point clone()
   {
      
     return new Point(x, y);
   
   }
   
    
  
   public void showPoint()
   {
       System.out.println("("+x+","+y+")");
   }
   
   public String toString()
   {
      String str="(";
      str += x;
      str +=",";
      str +=y;
      str +=")";
      
      return str;
   }
}