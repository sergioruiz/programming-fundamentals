/*
Sergio
CheckTip.java

Calculates the tip for a meal.
*/

import java.util.Scanner;
public class CheckTip
{
	public static void main(String[] args)
	{
		// Instance a variable of type Scanner, named "scan":
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the check total");
		float total = scan.nextFloat();
		System.out.println("Enter the percentage of tip to give");
		float percentage = scan.nextFloat();
		percentage = percentage / 100.0f;
		float tipQty; // declare
		tipQty = total * percentage; // assign
		//float tipQty = total * percentage;
		float sum = total + tipQty;
		
		System.out.println("AMOUNT: " + total);
		System.out.println("TIP   : " + tipQty);
		System.out.println("TOTAL : " + sum);
	}
}