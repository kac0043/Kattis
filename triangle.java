import java.util.*;

public class triangle
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();
		int x3 = scan.nextInt();
		int y3 = scan.nextInt();

		int t = scan.nextInt();
		int count = 0; 

		double area = (Math.abs((double)x1*(y2-y3)+(double)x2*(y3-y1)+(double)x3*(y1-y2))/2);
		 

		ArrayList<Integer> xs = new ArrayList<Integer>();
		ArrayList<Integer> ys = new ArrayList<Integer>();

		for (int i = 0; i < t; i++)
		{
			xs.add(scan.nextInt());
			ys.add(scan.nextInt()); 
		}

		for (int i = 0; i < xs.size(); i++)
		{
			double area1 = (Math.abs((double)xs.get(i)*(y2-y3)+(double)x2*(y3-ys.get(i))+(double)x3*(ys.get(i)-y2))/2);
			double area2 = (Math.abs((double)x1*(ys.get(i)-y3)+(double)xs.get(i)*(y3-y1)+(double)x3*(y1-ys.get(i)))/2);
			double area3 = (Math.abs((double)x1*(y2-ys.get(i))+(double)x2*(ys.get(i)-y1)+(double)xs.get(i)*(y1-y2))/2);
			double areatotal = area1+area2+area3;
			if (areatotal == area)
				count++; 
		}
		
		int a = (int)(area*10);
		area = (double) a/10;
		System.out.println(area);
		System.out.println(count); 

	}
}