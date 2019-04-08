/**
Sergio
Arrays2.java

Compares two arrays of ints.
*/
public class Arrays2
{
	public static void main(String[] args)
	{
		// Code a Java program to:
		// 1. Generate 2 arrays of size 3
		//     Elements in range [0, 2]
		// 2. Compare those arrays and determine if they have the same elements.
		
		// Do the same for two arrays of size 100
		int[] arr1 = createRandomArray(3, 0, 2);
		int[] arr2 = createRandomArray(3, 0, 2);
		boolean result = compareArrays(arr1, arr2);
		if(result == true)
		{
		}
		else
		{
		}
		
		// Do the same for two arrays of size 100
		int[] arr3 = createRandomArray(100, 0, 2);
		int[] arr4 = createRandomArray(100, 0, 2);
		boolean result2 = compareArrays(arr3, arr4);
		if(result2 == true)
		{
		}
		else
		{
		}		
	}
}