import java.util.*;

public class dice
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);

		int g = scan.nextInt()+ scan.nextInt()+ scan.nextInt()+ scan.nextInt();
		int e = scan.nextInt()+ scan.nextInt()+ scan.nextInt()+ scan.nextInt(); 

		if (g == e)
			System.out.println("Tie");
		else if (g > e)
			System.out.println("Gunnar");
		else
			System.out.println("Emma");
	}
}