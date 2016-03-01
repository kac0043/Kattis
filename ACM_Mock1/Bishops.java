import java.util.*;

public class Bishops
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextInt())
		{
			int x = scan.nextInt(); 
			if (x == 1)
				System.out.println(1); 
			else
				System.out.println(x + (x-2)); 
		}
	}
}
