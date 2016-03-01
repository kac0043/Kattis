import java.util.*;

public class reverseBinary
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();

		String bin = Integer.toString(x, 2);
		char[] bins = bin.toCharArray();

		int count = bins.length - 1;
		char y;
		for (int i = 0; i < bins.length/2; i++)
		{
			y = bins[i];
			bins[i] = bins[count];
			bins[count] = y; 
			count--;
		}

		String binBack = new String(bins);
		x = Integer.parseInt(binBack, 2);
		System.out.println(x); 

	}
}