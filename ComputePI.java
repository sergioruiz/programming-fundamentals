/*
Sergio
ComputePI.java

Approximates the value of PI with a sum: 4*(1+1/3-1/5+1/7-...)
*/
public class ComputePI
{
	public static double runCycle(int limit)
	{
		double sum = 0.0;
		int sign = 1;
		for(int i = 1; i <= limit; i+=2)
		{
			double frac = (double)sign / i;
			sum += frac;
			sign = -sign;
		}
		double pi = 4 * sum;
		return pi;
	}
	
	public static void main(String[] args)
	{
		double pi = runCycle(1000);
		double diff1 = Math.PI-pi;
		System.out.println("Math.PI=" + Math.PI);
		System.out.println("PI     =" + pi);
		System.out.println("DIFF1  =" + diff1);
		System.out.println();

		pi = runCycle(10000);
		double diff2 = Math.PI-pi;
		System.out.println("Math.PI=" + Math.PI);
		System.out.println("PI     =" + pi);
		System.out.println("DIFF2  =" + diff2);
		System.out.println();

		pi = runCycle(100000);
		double diff3 = Math.PI-pi;
		System.out.println("Math.PI=" + Math.PI);
		System.out.println("PI     =" + pi);
		System.out.println("DIFF3  =" + diff3);
		
	}
}
