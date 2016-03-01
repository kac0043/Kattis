import java.util.*;
import java.io.*;

public class guess
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int x = 500;
		int add = x/2;  
		System.out.println(x);
		System.out.flush();
		String s = scan.nextLine(); 
		while (!s.equalsIgnoreCase("correct"))
		{
			if (s.equalsIgnoreCase("lower"))
			{ 
				x -= (add+1);
				add = add/2; 
				if (x == 0)
					x = 1; 
			}
			else 
			{
				x += (add+1);
				add = add/2; 
			}
			System.out.println(x);
			System.out.flush();
			s = scan.nextLine();
		}
	}
}