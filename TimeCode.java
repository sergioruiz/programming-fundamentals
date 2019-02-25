/*
Sergio
TimeCode.java
Shows how to measure time elapsed for code execution in Java
*/
public class TimeCode
{
	public static void main(String[] args)
	{
		long sum = 0;
		long start = System.currentTimeMillis();
		for(long z = 0; z < 10000000; z++)
		{
			sum += z;
		}
		long end = System.currentTimeMillis();
		long diff = end-start;
		System.out.println("Elapsed time: "+diff);
		System.out.println("SUM: " + z);
	}
}