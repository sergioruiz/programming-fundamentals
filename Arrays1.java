/*
Sergio
Arrays1.java

Introduces the concept of arrays in Java
*/

public class Arrays1
{
	public static void main(String[] args)
	{
		// 1. In Java, arrays are dynamically allocated.
		// Declare the array:
		float[] numbers;
		// Instance the array:
		numbers = new float[4];
		numbers[0] = -44.0f;
		numbers[1] = 13.231f;
		numbers[2] = 22.87777f;
		numbers[3] = -11.11f;
		// Biggest index: 3
		// Length: 4
		
		System.out.println(numbers[1]);
		
		// 2. We can know the number of elements an array holds, by using the member "length".
		
		System.out.println(numbers.length);
		// Print the last element in "numbers"
		System.out.println(numbers[numbers.length-1]);
		
		// 3. A Java array variable must be declared (like other variables), but with [] after the data type.
		
		// 4. The values in the array are ordered and each of them has an index beginning from 0.
		
		// 5. Java arrays can be used as a local variable or a method parameter.
		
		// 6. The size of an array must be specified by an int value and not long or short.
		
		// 7. An array in Java may contain primitive data types or objects.
		
		String[] names;
		names = new String[3];
		names[0] = "Juan Carlos";
		names[1] = "Archana";
		names[2] = "Paty";
		
	}
}







