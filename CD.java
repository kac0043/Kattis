import java.util.*;
import java.io.*;

public class CD
{
	public static void main (String[] args)
	{
		Kattio scan = new Kattio(System.in, System.out);
		int n = scan.getInt();
		int m = scan.getInt(); 
		while (n!=0 && m != 0)
		{
			int count = 0; 
			int[] ns = new int[n];
			for (int i = 0; i < n; i++)
			{
				ns[i] = scan.getInt();
			}
			int ndex = 0;
			int mnum = scan.getInt(); 
			int mdex = 0; 
			while (ndex < n && mdex < m)
			{
				int val = ns[ndex];
				if (mnum == val)
				{
					count++; 
					ndex++;
					mdex++; 
					if (mdex < m)
						mnum = scan.getInt(); 
				}
				else if (val > mnum)
				{
					mdex++; 
					if (mdex < m)
						mnum = scan.getInt();
				}
				else if (mnum > val)
				{
					ndex++; 
				}
			}
			while (mdex < m-1)
			{
				scan.getInt();
				mdex++; 
			}
				 
			System.out.println(count); 
			n = scan.getInt();
			m = scan.getInt(); 
		}
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