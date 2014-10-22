/**
 * PP_Sales_Applet.java
 * @author Garrett J. Beasley
 * 10/03/2014
 * Draws a House Picture
 */



//Imports for the program.
import acm.program.ConsoleProgram;
import java.util.Date;


public class PP_Sales_Applet extends ConsoleProgram
{
	
	public void run()
	{

		
		double tax =0.095;
		double discount =0.1;
		
		/**Set the size of the applet*/
		setSize(500,400);
		
		
		println("Item 1:");
		double qty1 = readDouble("Enter the quantity of the item(s):");
		double price1 = readDouble("Enter the price of the item:");
		println("Item 2:");
		double qty2 = readDouble("Enter the quantity of the item(s):");
		double price2 = readDouble("Enter the price of the item:");
		println("Item 3:");
		double qty3 = readDouble("Enter the quantity of the item(s):");
		double price3 = readDouble("Enter the price of the item:");
		
		double subtotal=((price1*qty1)+(price2*qty2)+(price3*qty3));
		double disApplied=discount*subtotal;
		double total = (subtotal*tax)+subtotal;
		
		
		
		
		/**Checks to see if the discount is applied*/
		if (subtotal>100)
		{
			println("");
			println("Subtotal: "+subtotal);
			println("Tax: "+tax*subtotal);
			println("Discount applied:"+disApplied);
			println("Total: "+(total-disApplied));
		}
		else if (subtotal<=100)
		{
		println("");
		println("Subtotal: "+subtotal);
		println("Tax: "+tax*subtotal);
		println("Total: "+total);
		}
		
		
		
		Date today = new Date();
		println(today);
		
	}
}