/*
Sergio
InputExample.java

Demonstrates the use of a Java Scanner
*/
// Using someone else's code:
import java.util.Scanner;

public class InputExample
{
	public static void main(String[] args)
	{
		// Instance a new Scanner object:
		Scanner input = new Scanner(System.in);
		// --------- Input TEXT ----------------
		// Read a line of text from the user, and store it in a String variable:
		System.out.println("Type some text, then press [Enter]");
		String data = input.nextLine();
		// Print whatever the user typed:
		System.out.println(data);
		// --------- Input DECIMAL----------------
		System.out.println("Type a decimal number, and press [Enter]");
		float dec = input.nextFloat();
		System.out.println(dec);
	}
}





