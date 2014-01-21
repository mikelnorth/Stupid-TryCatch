package controller;

import javax.swing.JOptionPane;
/**
 * Starts the Try/Catch project
 * @author Mikel North
 *@version 1.0 12/10/13
 */
public class TryCatchRunner
{

	public static void main(String[] args)
	{
		int testNumber = 15;
		double testFloatingPoint = 0.0000001;
		double errorTest = 0.0;
		int otherNumber = 0;
		
		try
		{
			testNumber = testNumber/otherNumber;
		}
		catch(ArithmeticException currentError)
		{
			JOptionPane.showMessageDialog(null, currentError.getMessage()); // getMessage gives us error message.
			JOptionPane.showMessageDialog(null, currentError.getClass().toString()); // getClass gives us actual Exception
		}
		
		try
		{
			errorTest = errorTest/errorTest;
		}
		catch(ArithmeticException currentError)
		{
			JOptionPane.showMessageDialog(null, currentError.getMessage());
			JOptionPane.showMessageDialog(null, currentError.getClass().toString());
		}
		JOptionPane.showMessageDialog(null, "Funny Answer:" + errorTest/errorTest);
		JOptionPane.showMessageDialog(null, "Funny Answer:" + errorTest/-errorTest);
		JOptionPane.showMessageDialog(null, "Funny Answer:" + 1.0/errorTest); // NaN means Not a Number, which is a concept.

	}

}
