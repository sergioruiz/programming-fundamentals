/*
Sergio
LitersOfPaint.java

Finds out how many liters of paint are needed
to paint the inside of a room, without the floor.
*/

public class LitersOfPaint
{
	public static void main(String[] args)
	{
		// int		an integer, no decimals
		// float	a number with floating point
		float width = 2.75f;
		float height = 2.4f;
		float depth = 5.5f;
		float coverage = 1.2f;
		float fb = 2.0f * width * height;
		float lr = 2.0f * depth * height;
		float ce = width * depth;
		float area = fb + lr + ce;
		float litersToBuy = area / coverage;
		System.out.println("Liters of paint to buy: ");
		System.out.println(litersToBuy);
	}
}
