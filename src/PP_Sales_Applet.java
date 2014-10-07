/**
 * PP_Sales_Applet.java
 * @author Garrett J. Beasley
 * 10/03/2014
 * Draws a House Picture
 */


//Imports for the program.
import acm.program.ConsoleProgram;


public class PP_Sales_Applet extends ConsoleProgram
{
	
	public void run()
	{
		/**Set the size of the applet*/
		setSize(500,400);
		
		/**Gathers the inputs from the user and stores them in a variable*/
		String name = readLine("Enter your name:");
		print(name);
		
		
		
	}
}