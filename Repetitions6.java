/*
Sergio
Repetitions6.java
Introduces the concept of accumulator
*/
import java.util.Random;
public class Repetitions6
{
	public static void main(String[] args)
	{
		// Find the sum of 100 random numbers between -10 and 10:
		int limit = 100000000;
		int min = -10;
		int max = 10;
		// The scope of variable "sum" is: the block of code of function "main"
		int sum = 0;
		Random gen = new Random();
		for(int i = 1; i <= limit; i++)
		{
			// Sum is an "accumulator". Should be declared outside the scope of "for"
			sum += min + gen.nextInt(max-min+1);
		}
		System.out.println(sum);
	}
}




