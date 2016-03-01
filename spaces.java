import java.util.*;

public class spaces
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int width = scan.nextInt();
		int p = scan.nextInt();
		int[] parts = new int[p+2];
		ArrayList<Integer> ways = new ArrayList<Integer>();

		for (int i = 1; i < p+1; i++)
		{
			parts[i] = scan.nextInt();
		}

		parts[0] = 0;
		parts[p+1] = width;  

		for (int i = 0; i < p+2; i++)
		{
			for (int j = i+1; j < p+2; j++)
			{
				ways.add(Math.abs(parts[j] - parts[i]));
			}
		}

		for (int i = 0; i < ways.size(); i++)
		{
			while (ways.indexOf(ways.get(i)) != ways.lastIndexOf(ways.get(i)))
			{
				ways.remove(ways.lastIndexOf(ways.get(i)));  
			}
		}

		Integer[] a = new Integer[ways.size()];
		ways.toArray(a); 
		
		Arrays.sort(a);

		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}

	}
}