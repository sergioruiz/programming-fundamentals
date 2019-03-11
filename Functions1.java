/*
Sergio
Functions1.java
Demonstrates the use of functions (methods)
*/

public class Functions1
{
	// Return type: double
	// Name: sum
	// Parameter 1: a, type: double
	// Parameter 2: b, type: double
	public static double sum(double a, double b)
	{
		double s = a + b;
		return s;
		// A print here would never happen!
	}
	
	public static void printer(String txt, int what)
	{
		System.out.println(txt + what);
	}
	
	// 1. Declaring the function:
	public static void sillyName()
	{
		System.out.println("Silly!");
	}
	
	public static void main(String[] args)
	{
		int myNum = 5;
		int myNum2 = -3;
		// 2. Calling the function:
		sillyName();
		printer("Hello", myNum);
		sillyName();
		printer("World!", myNum2);
		double mySum = sum(-3.1675, 5.2278);
		System.out.println(mySum);
	}
}








