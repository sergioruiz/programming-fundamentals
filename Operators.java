/*	PROLOGUE
Sergio
Operators.java

Explains relational operators in Java
*/

public class Operators
{
	public static void main(String[] args)
	{
		int x = 5;
		int y = 5;
		// >  <  >=  <=  ==  !=
		boolean result = x <= y;
		System.out.println(result);
		boolean xx = true;
		boolean yy = false;
		System.out.println(xx || yy);
		
		int myInt = 12 - 4 * 2;
		int myInt2 = --myInt % 7 * 3;	
		System.out.println(myInt2);
	}
}




