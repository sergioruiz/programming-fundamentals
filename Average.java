/*
Sergio
Average.java
Computes the average of 1M random numbers between 10 and 500
*/

import java.util.Random;
public class Average
{
	public static void main(String[] args)
	{
		Random rand = new Random();
		float min = 10.0f;
		float max = 500.0f;
		float sum = 0.0f;
		int limit = 1000000;
		for(int i = 1; i <= limit; i++)
		{
			sum += min + (max-min) * rand.nextFloat();
		}
		// "Casting" an int to a float:
		float avg = sum / (float)limit;
		System.out.println(avg);
	}
}
