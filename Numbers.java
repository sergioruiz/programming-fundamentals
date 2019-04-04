/*
	Sergio
	Numbers.java
	Create 100 random numbers between -100 and 100.
	Print the even numbers
	Print the odd numbers
*/
import java.util.Random;
public class Numbers
{
	public static int randBetween(int min, int max)
	{
		Random r = new Random();
		return min + r.nextInt(max-min+1);
	}

	public static int[] createArray(int size, int min, int max)
	{
		int[] nums;
		nums = new int[size];
		// Change the value of each box:
		for(int i = 0; i <= nums.length-1; i++)
		{
			nums[i] = randBetween(min, max);
		}
		return nums;
	}

	public static void printIntArray(int[] arr)
	{
		for(int i = 0; i <= arr.length-1; i++)
		{
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}

	public static void main(String[] args)
	{
		int[] myNumbers = createArray(10, -100, 100);
		printIntArray(myNumbers);
	}
}





