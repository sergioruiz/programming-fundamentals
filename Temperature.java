/*
Sergio
Temperature.java

Translates temperature from Celsius to Fahrenheit
*/

import java.util.Scanner;
public class Temperature
{
	public static void main(String[] args)
	{
		System.out.println("Enter Celsius");
		Scanner in = new Scanner(System.in);
		float celsius = in.nextFloat();
		float fahr = (celsius * 9/5)+32;
		System.out.println("Result = " + fahr + " F");
	}
}
