/*
	https://pastebin.com/7dF3EX30
	Strings1.java
	Sergio
	
	Demonstrates the use of Strings in Java
*/

public class Strings1
{
	public static void countCharacter(String s, char c)
	{
		System.out.print(c + " ");
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) == c)
			{
				System.out.print(c);
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		String txt = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissim augue vel urna pretium, ut ornare nulla congue. Vivamus faucibus rutrum dolor. Nunc ut arcu sem. Pellentesque in pellentesque magna. Etiam facilisis molestie lobortis. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Integer id arcu at ligula blandit ultrices a id augue. Duis tristique porta purus, in fermentum est vulputate lobortis. Nam in est et lorem condimentum consequat suscipit vel risus. Duis feugiat placerat odio ut auctor. Fusce vitae convallis felis. Phasellus faucibus.";
		
		for(int x = 97; x <= 122; x++)
		{
			char c = (char)x;  // From the ASCII table
			countCharacter(txt, c);
		}

	}
}
