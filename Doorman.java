import java.util.*;

public class Doorman
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int range = scan.nextInt();
		int difference = 0, num = 0;
		scan.nextLine();
		String list = scan.nextLine();

		for (int i = 0; i < list.length(); i++)
		{
			num++;
			if (list.charAt(i) == 'M')
				difference++;
			else
				difference--;
			if (Math.abs(difference) > range)
			{
				if (i + 1 < list.length() && list.charAt(i+1) != list.charAt(i))
				{
					if (list.charAt(i+1) == 'M')
						difference += 2;
					else
						difference -= 2;
					if (i+2 < list.length())
						list = list.substring(0, i+1) + list.substring(i+2, list.length());
					else
						list = list.substring(0, i+1);  
					i--; 
				}
				else 
				{
					num--;
					break;
				}	
			}
		}
		System.out.println(num);
	}
}
