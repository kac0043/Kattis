import java.util.*;
import java.io.*;

public class planets
{
	public static void main (String[] args)
	{
		Kattio scan = new Kattio(System.in, System.out);
		int count = 1; 
		while (scan.hasMoreTokens())
		{
			int days = 0; 
			int e = scan.getInt();
			int m = scan.getInt();

			while (e!= 0 || m!=0)
			{
				e++;
				m++;
				if (e == 365)
					e = 0;
				if (m == 687)
					m = 0; 
				days++; 
			}

			System.out.println("Case " + count + ": " + days);
			count++; 
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