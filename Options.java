/*
Sergio
Options.java
Demonstrates the use of the switch structure
*/
import java.util.Scanner;
public class Options
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 10");
		int num = scan.nextInt();
		switch(num)
		{
			case 1:
				System.out.println("1");
				break;
			case 2:
				System.out.println("2");
				break;
			case 3:
				System.out.println("3");
				break;
			case 4:
				System.out.println("4");
				break;
			case 5:
				System.out.println("5");
				break;	
			case 6: case 7: case 8:
				System.out.println("6-8");
			default:
				System.out.println("9 or 10");
		}
	}
}
