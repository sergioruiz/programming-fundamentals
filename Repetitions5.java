/*
Sergio
Repetitions5.java
Creates a table
*/
import java.util.Scanner;
public class Repetitions5
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive number ");
		int n = scan.nextInt();
		
		// For each row ("row" is a counter):
		for(int row = 1; row <= n; row++)
		{
			// For each column ("col" is a counter):
			for(int col = 1; col <= n; col++)
			{
				System.out.print(row + "," + col+"  ");
			}
			// Row is done. Skip a line:
			System.out.println();
		}
		
	}
}








