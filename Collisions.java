/*
Sergio
Collisions.java

Tests two 2D circles for collision
*/
import java.util.Random;
public class Collisions
{
	public static void main(String[] args)
	{
		Random rnd = new Random();
		// To generate a random float between min and max:
		float minF = -6.0f;
		float maxF = 6.0f;
		float xF = minF + (maxF - minF) * rnd.nextFloat();
		System.out.println(xF);
		
		// To generate a random int between min and max:
		int minI = -6;
		int maxI = 6;
		int xI = minI + rnd.nextInt(maxI - minI + 1);
		System.out.println(xI);
		
		// Now complete the collision problem using a decision structure:
	}
}