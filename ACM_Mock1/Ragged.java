import java.util.*;

public class Ragged
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> lines = new ArrayList<Integer>();
		while(scan.hasNextLine())
		{
			String x = scan.nextLine();
			if (x.length() == 0)
				break; 
			int y = x.length(); 
			lines.add(y);
		} 

		int x = lines.get(0);
		int index = 0;
		for (int i = 0; i < lines.size(); i++)
		{	
			if (lines.get(i) > x)
			{
				x = lines.get(i);
				index = i; 
			}	
		}

		lines.remove(lines.get(lines.size()-1)); 

		int sum = 0;
		for (int i = 0; i < lines.size(); i++)
		{
			sum += (x-lines.get(i))*(x-lines.get(i)); 
		}

		System.out.println(sum); 
	}
}