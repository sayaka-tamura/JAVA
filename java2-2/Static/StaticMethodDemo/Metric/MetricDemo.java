import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/** 
   This program demonstrates the Metric class. 
*/ 

public class MetricDemo
{
   public static void main(String[] args)
   {
      String input; // To hold input 
      double miles; // A distance in miles 
      double kilos; // A distance in kilometers
      
      // Create a DecimalFormat object. 
      DecimalFormat fmt = new DecimalFormat("0.00");
      
      // Get a distance in miles.
      input = JOptionPane.showInputDialog("Enter " + 
                              "a distance in mlies.");
      
      miles = Double.parseDouble(input); 
      
      // Convert the distance to kilometers.
      kilos = Metric.milesToKilometers(miles);
      JOptionPane.showMessageDialog(null, 
            fmt.format(miles) + " miles equals " + 
            fmt.format(kilos) + " kiloaeters."); 
      
      // Get a distance in kilometers.
      input = JOptionPane.showInputDialog("Enter " + 
                              "a distance in kilometers."); 
      kilos = Double.parseDouble(input); 
      
      // Convert the distance to kiloaeters.
      miles = Metric.kilometersToMiles(kilos); 
      JOptionPane.showMessageDialog(null,
            fmt.format(kilos) + " kilometers equal " +
            fmt.format(miles) + " miles.");
            
      System.exit(0); 
   }
}