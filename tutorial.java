import java.util.*;
import java.io.*;

public class tutorial
{
	public static void main (String[] args)
	{
		Kattio scan = new Kattio(System.in);
		int m = scan.getInt();
		int n = scan.getInt();
		int t = scan.getInt();
		long total = n;
		boolean AC = true;


		if (t == 1)
		{
			if (n >= 13 || n > m)
			{
				AC = false; 
			}
			else 
			{
				while (n!=0)
					if (total > m)
					{
						AC = false;
						break; 
					}	
					else
					{
						total *= n-1;
						n = n-1;
					}
			}
		}

		else if (t == 2)
		{
			if (n >= 30 || (n > m))
			{
				AC = false; 
			}
			else 
			{
				long power = (long) Math.pow(2, n); 
				if (power > m)
				{
					AC = false; 
				}	
			}
				
		}

		else if (t == 3)
		{
			if (n >= 180 || (n > m))
			{
				AC = false; 
			}
			else 
			{
				total = n*n*n*n;
				if (total > m)
					AC = false; 
			}
		}

		else if (t == 4)
		{
			if (n >= 1001 || (n > m))
			{
				AC = false; 
			}
			else 
			{
				total = n*n*n;
				if (total > m)
					AC = false; 
			}
		}

		else if (t == 5)
		{
			if (n >= 32000)
			{
				AC = false; 
			}
			else 
			{
				total = n*n;
				if (total > m)
					AC = false; 
			}
		}

		else if (t == 6)
		{
			if (n >= 39650000 || (n > m))
			{
				AC = false; 
			}
			double log = (Math.log(n) / Math.log(2)) * n; 
			total = (long) Math.ceil(log);
			if (total > m)
				AC = false; 
		}

		else if (t == 7)
		{
			if (n > m)
				AC = false; 
		}

		else 
			AC = false; 

		if (AC == true)
			System.out.println("AC");
		else
			System.out.println("TLE");

		
		
	}
	public static class Kattio extends PrintWriter {
    public Kattio(InputStream i) {
	super(new BufferedOutputStream(System.out));
	r = new BufferedReader(new InputStreamReader(i));
    }
    public Kattio(InputStream i, OutputStream o) {
	super(new BufferedOutputStream(o));
	r = new BufferedReader(new InputStreamReader(i));
    }

    public boolean hasMoreTokens() {
	return peekToken() != null;
    }

    public int getInt() {
	return Integer.parseInt(nextToken());
    }

    public double getDouble() { 
	return Double.parseDouble(nextToken());
    }

    public long getLong() {
	return Long.parseLong(nextToken());
    }

    public String getWord() {
	return nextToken();
    }



    private BufferedReader r;
    private String line;
    private StringTokenizer st;
    private String token;

    private String peekToken() {
	if (token == null) 
	    try {
		while (st == null || !st.hasMoreTokens()) {
		    line = r.readLine();
		    if (line == null) return null;
		    st = new StringTokenizer(line);
		}
		token = st.nextToken();
	    } catch (IOException e) { }
	return token;
    }

    private String nextToken() {
	String ans = peekToken();
	token = null;
	return ans;
    }
}
}