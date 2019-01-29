/*
Sergio
LitersOfPaintGeneric.java

Finds how many liters of paint to buy to paint the inside of a rectangular prism. Windows and floor will not be painted.
*/

import java.util.Scanner;

public class LitersOfPaintGeneric
{
	public static void main(String[] args)
	{
		// INPUT
		Scanner scan = new Scanner(System.in);
		System.out.println("Input the room's width in meters, as a decimal number, then press [Enter]");
		float width = scan.nextFloat();
		System.out.println("Input the room's height in meters, as a decimal number, then press [Enter]");
		float height = scan.nextFloat();
		System.out.println("Input the room's depth in meters, as a decimal number, then press [Enter]");
		float depth = scan.nextFloat();
		System.out.println("Input the paint's coverage in meters squared, as a decimal number, then press [Enter]");
		float coverage = scan.nextFloat();
		// PROCESSING
		float frontBack = 2.0f * width * height;
		float leftRight = 2.0f * depth * height;
		float ceiling = width * depth;
		float area = frontBack + leftRight + ceiling;
		float litersToBuy = area / coverage;
		// OUTPUT
		System.out.println("Front+Back= " + frontBack);
		System.out.println("Left+Right= " + leftRight);
		System.out.println("Ceiling= " + ceiling);
		System.out.println("AREA= " + area + " m^2");
		System.out.println("LITERS TO BUY = " + litersToBuy + " liters.");		
	}
}
