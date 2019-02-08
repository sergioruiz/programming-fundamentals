/*
Sergio
Decisions.java

Prints if the student passes a test.
*/
import java.util.Scanner;
public class Decisions
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a score (0-100)");
		int score = reader.nextInt();
		if(score >= 70)
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
	}
}








