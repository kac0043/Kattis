import java.util.*;
public class Toilet
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String seats = scan.nextLine();
		boolean isU = false, isU2 = false; 
		int u = 0, d = 0, s = 0, case1 = 0, case2 = 0, case3 = 0;

		if (seats.charAt(0) == 'U')
			isU = true; 
		if (seats.charAt(1) == 'U')
			isU2 = true; 

		char before = seats.charAt(0); 
		for (int i = 1; i < seats.length(); i++)
		{
			if (seats.charAt(i) == 'U')
				u++;
			else
				d++;
			if (before != seats.charAt(i))
				s++;
			before = seats.charAt(i);
		}

		if(isU && isU2)
		{
			case1 = d*2;
			case2 = u*2 - 1;
			case3 = s; 
		}
		else if(isU && !isU2)
		{
			case1 = d*2;
			case2 = u*2 + 1;
			case3 = s; 
		}
		else if(!isU && isU2)
		{
			case1 = d*2 + 1;
			case2 = u*2;
			case3 = s; 
		}
		else if(!isU && !isU2)
		{
			case1 = d*2 - 1;
			case2 = u*2;
			case3 = s; 
		}

		System.out.println(case1);
		System.out.println(case2);
		System.out.println(case3);

	}
}