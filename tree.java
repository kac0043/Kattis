import java.util.*;
import java.io.*;

public class tree
{

	public static void main (String[] args)
	{
		Kattio scan = new Kattio(System.in, System.out);
		long x = scan.getInt();
		long total = 0, curr = 0;
		String l = "";
		if (scan.hasMoreTokens())
			l = scan.getWord(); 
		char[] list = l.toCharArray();
		for (int i = 0; i <= x; i++)
		{
			total += (long) Math.pow(2, i);
		}

		for (int i = 0; i < list.length; i++)
		{
			total -= (long) Math.pow(2, i);
		}

		curr = list.length-1; 
		for (int i = 0; i < list.length; i++)
		{
			if (list[i] == 'R')
			{
				total -= (long) Math.pow(2, curr);
			} 
			curr--;
		}

		System.out.println(total); 
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

